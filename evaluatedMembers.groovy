Cube cube = operation.application.getCube("Plan1")
Map accProprsPln = [:]
Map accProprsEss = [:]
List<String> accountsPln = operation.application.getDimension('Entity',cube).getEvaluatedMembers('IChildren("EntAll")', cube)*.getName(MemberNameType.MEMBER_NAME)
List<String> accountsEss = operation.application.getDimension('Entity',cube).getEvaluatedMembers('IChildren("EntAll")', cube)*.getName(MemberNameType.ESSBASE_NAME)
List<String> accountsUnq = operation.application.getDimension('Entity',cube).getEvaluatedMembers('IChildren("EntAll")', cube)*.getName(MemberNameType.UNIQUE_NAME)
List<String> accountsUnqEss = operation.application.getDimension('Entity',cube).getEvaluatedMembers('IChildren("EntAll")', cube)*.getName(MemberNameType.UNIQUE_ESSBASE_NAME)
println("Pln"+accountsPln)
println("Ess"+accountsEss)
println("Unq"+accountsUnq)
println("UnqEss"+accountsUnqEss)



//Before refresh
Pln[EntOnTheFly, EntOnTheFly2, EntAll]
Ess[EntOnTheFly, hsp_mof_42b2636e-c42a-4920-a3c5-f5c244ddf28e_1, EntAll]
Unq[EntOnTheFly, EntOnTheFly2, EntAll]
UnqEss[EntOnTheFly, hsp_mof_42b2636e-c42a-4920-a3c5-f5c244ddf28e_1, EntAll]
//After Refresh
Pln[EntOnTheFly, EntOnTheFly2, EntAll]
Ess[EntOnTheFly, EntOnTheFly2, EntAll]
Unq[EntOnTheFly, EntOnTheFly2, EntAll]
UnqEss[EntOnTheFly, EntOnTheFly2, EntAll]
