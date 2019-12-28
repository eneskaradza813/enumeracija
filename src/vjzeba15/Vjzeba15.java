package vjzeba15;

public class Vjzeba15 {
    
    public enum DaysofWeek{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
       
    }

    public static void main(String[] args) {
        DaysofWeek daysofWeek = DaysofWeek.WEDNESDAY;
        
        switch(daysofWeek){
            case MONDAY:
                System.out.println("Day is Monday");
                break;
            case TUESDAY:
                System.out.println("Day is Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Day is Wednesday");
                break;
            case THURSDAY:
                System.out.println("Day is Thursday");
                break;
            case FRIDAY:
                System.out.println("Day is Friday");
                break;
            case SATURDAY:
                System.out.println("Day is Saturday");
                break;
            case SUNDAY:
                System.out.println("Day is Sunday");
                break;
        }


        
    }

}
