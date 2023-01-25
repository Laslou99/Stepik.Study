public class lessen2 {
    public static int leapYearCount(int year){
        year = (year/4) - (year/100) + (year/400);
        return year;
    }
}
