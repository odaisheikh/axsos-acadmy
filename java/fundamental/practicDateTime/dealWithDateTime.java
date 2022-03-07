import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class dealWithDateTime{
    public static void main(String[] args){
        // LocalDate mydate = LocalDate.now();
        // System.out.println(mydate);
        // DateTimeFormatter convert = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // String formatDate = mydate.format(convert);
        // System.out.println(formatDate);
        ///////////////////////////format date
        // String pattern = "MM-dd-yyyy";
        // SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        // String date = simpleDateFormat.format(new Date());
        // System.out.println(date);
        // Date x = new Date();
        // System.out.println(x);
        ///////////////////////format time 
        // String pattern = " HH:mm:ss";
        // SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        // String date = simpleDateFormat.format(new Date());
        // System.out.println(date);
        /////////////////////////
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = new Date();        
        try {
            date = simpleDateFormat.parse("12-02-2018");
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(date);
    }
}