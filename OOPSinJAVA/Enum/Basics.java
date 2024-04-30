package OOPSinJAVA.Enum;

public class Basics {
      enum Week {
           Monday ,Tuesday,Wednesday,Thursday,Friday,Saturday ,Sunday
    }


    enum Month{
          January,February,March,April,May,June,July,August,September,November,December

    }
    public static void main(String[] args) {
       // Week week;
        //Month month;
       // month = Month.February;
        //System.out.println(month);
       // week= Week.Monday;
        // System.out.println(week);

        for (Month m:Month.values()){
            System.out.println(m);

        }
  for (Week day : Week.values()){
      System.out.println(day);
       }

    }
}
