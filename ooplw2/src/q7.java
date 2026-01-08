import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class q7 {

    public static void main(String[] args){
        LocalDate today =LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd ,yyyy");
        String formattedDate = today.format(formatter);
        System.out.println(formattedDate);
    }
}
