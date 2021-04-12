import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateSample {

    public static void main(String[] args){

    //さまざまなLocalDateの作り方
    System.out.println("------LocalDate------");
    LocalDate date1 = LocalDate.now();
    LocalDate date2 = LocalDate.of(2021, 3, 22);
    LocalDate date3 = LocalDate.parse("2021-03-22");
    LocalDate date4 = LocalDate.of(2021, Month.APRIL, 22);

    System.out.println(date1);
    System.out.println(date2);
    System.out.println(date3);
    System.out.println(date4);

    System.out.println("getYear() : " + date1.getYear());
    System.out.println("getDayOfMonth() : " + date1.getDayOfMonth());
    System.out.println("getDayOfYear() : " + date1.getDayOfYear());
    System.out.println("getMonthValue() : " + date1.getMonthValue());
    System.out.println("getMonth() : " + date1.getMonth());
    System.out.println("date3.getEra() : " + date1.getEra());
    System.out.println("getChronology() : " + date1.getChronology());
    System.out.println("getDayOfWeek() : " + date1.getDayOfWeek());

    System.out.println();

    System.out.println("getYear() : " + date2.getYear());
    System.out.println("getDayOfMonth() : " + date2.getDayOfMonth());
    System.out.println("getDayOfYear() : " + date2.getDayOfYear());
    System.out.println("getMonthValue() : " + date2.getMonthValue());
    System.out.println("getMonth() : " + date2.getMonth());
    System.out.println("date3.getEra() : " + date2.getEra());
    System.out.println("getChronology() : " + date2.getChronology());
    System.out.println("getDayOfWeek() : " + date2.getDayOfWeek());


    //LocalTime
    System.out.println("------LocalTime------");
    LocalTime time1 = LocalTime.now();
    LocalTime time2 = LocalTime.of(13, 24, 59, 456460000);
    LocalTime time3 = LocalTime.parse("20:12:31");

    System.out.println(time1);
    System.out.println(time2);
    System.out.println(time3);

    //LocalDateTime
    System.out.println("------LocalDateTime------");
    LocalDateTime ldt1 = LocalDateTime.of(2021, Month.AUGUST, 24, 12, 8, 52);
    //もしくは
    LocalDateTime ldt2 = LocalDateTime.of(date1, time3); 

    System.out.println(ldt1);
    System.out.println(ldt2);

    //DateTimeFormatter
    System.out.println("------DateTimeFormatter------");
    LocalDateTime ldt3 = LocalDateTime.now();
    DateTimeFormatter fmt1 = DateTimeFormatter.ISO_DATE;
    System.out.println(ldt3);
    System.out.println(fmt1.format(ldt3));
    System.out.println(ldt3.format(fmt1));

    DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MMMM");
    DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("MMMM", Locale.US);

    LocalDateTime date5 = LocalDateTime.now();
    System.out.println("デフォルトロケール" + date5.format(fmt2));
    System.out.println("USロケール　　　　" + date5.format(fmt3));

    DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    String target = "2021/03/22 21:03:20";
    LocalDateTime ldt4 = LocalDateTime.parse(target, fmt4);
    System.out.println(ldt4);

    //ゾーーん
    System.out.println("------ゾーーん------");
    ZoneId zone1 = ZoneId.systemDefault();
    LocalDateTime date6 = LocalDateTime.of(2021, 3, 22, 12, 30, 45, 200);

    ZonedDateTime zonedate1 = ZonedDateTime.of(date6, zone1);
    System.out.println(zone1);
    System.out.println(zonedate1);

    ZoneId zone2 = ZoneId.of("America/Los_Angeles");
    ZonedDateTime zonedate2 = ZonedDateTime.of(2021, 3, 23, 12, 11, 12, 490000000, zone2);
    System.out.println(zone2);
    System.out.println(zonedate2);

    DateTimeFormatter fmt5 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
    System.out.println(zonedate2.format(fmt5));
    System.out.println(fmt5.format(zonedate1));

    //Period
    System.out.println("------Period------");
    Period period1 = Period.between(date1, date2);
    System.out.println("period" + period1);

    }     
}
