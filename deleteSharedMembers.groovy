List<Cube> cubes = operation.application.getCubes()
List<Member> members
Map memProps = [:]

println(cubes)
cubes.each{
          members = operation.application.getDimension('Account',it).getEvaluatedMembers('Children("TotalSalary")', it)
          members.each{mbrItr ->
                        memProps = mbrItr.toMap()
          				if(memProps.get("Data Storage") == "shared")
                          {
                           mbrItr.delete()
                           println("Account member :"+mbrItr+" got deleted")
                          } 	
                       }
           }
