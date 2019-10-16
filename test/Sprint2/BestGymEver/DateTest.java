package Sprint2.BestGymEver;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class DateTest {

    Date d = new Date();

    @Test

    public void isDateRangeCorrect()  {


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String timeCheck1 = LocalDate.now().minusYears(1).format(formatter);
        String timeCheck2 = LocalDate.now().minusMonths(7).format(formatter);
        String timeCheck3 = LocalDate.now().minusYears(2).format(formatter);
        String timeCheck4 = LocalDate.now().minusMonths(20).format(formatter);
        String timeCheck5 = LocalDate.now().minusMonths(11).format(formatter);



        TestCase.assertTrue(d.dateCheck(timeCheck1));
        TestCase.assertTrue(d.dateCheck(timeCheck2));
        TestCase.assertFalse(d.dateCheck(timeCheck3));
        TestCase.assertFalse(d.dateCheck(timeCheck4));
        TestCase.assertTrue(d.dateCheck(timeCheck5));


    }


}