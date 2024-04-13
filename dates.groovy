import java.time.*;
import java.time.chrono.HijrahChronology;
Date date = new Date(); // Gregorian date

Calendar cl=Calendar.getInstance();
cl.setTime(date);
    
HijrahDate islamyDate = HijrahChronology.INSTANCE.date(LocalDate.of(cl.get(Calendar.YEAR),cl.get(Calendar.MONTH)+1, cl.get(Calendar.DATE))); 
//OUTPUT: Hijrah-umalqura AH 1436-02-03 
