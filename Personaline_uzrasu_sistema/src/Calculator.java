import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<DateTime> day = new ArrayList<>();
    public Calculator(String date1, String date2){
        // return given date in DateTime type and in given pattern
        DateTimeFormatter pattern = DateTimeFormat.forPattern("yyyy-MM-dd");
        // What day is it today?
        DateTime today = pattern.parseDateTime(date1);
        DateTime startDate = pattern.parseDateTime(date1);
        DateTime endDate = pattern.parseDateTime(date2);
        while (startDate.isBefore(endDate)){
            if ( startDate.getDayOfWeek() == today.getDayOfWeek() ){
                day.add(startDate);
            }
            startDate = startDate.plusDays(1);
        }
    }
    List<DateTime> GetDates(){ return day; }
    int GetDayOfWeek(String date1) {
        DateTimeFormatter pattern = DateTimeFormat.forPattern("yyyy-MM-dd");
        // get date in format yyyy MM dd
        DateTime today = pattern.parseDateTime(date1);
        return today.getDayOfWeek();
    }
}
