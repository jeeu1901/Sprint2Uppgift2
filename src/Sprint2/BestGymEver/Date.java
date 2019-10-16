package Sprint2.BestGymEver;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date {

    LocalDate dateNow = LocalDate.now().minusYears(1);

    /**
     * Return true om datumet är mindre än ett år sedan eller exakt 1 år sedan.
     * Annars return false;
     * @param s Registrerings datumet för en person i databasen
     * @return boolean
     */
    public boolean dateCheck(String s) {
        LocalDate userDate = LocalDate.parse(s);
        if (dateNow.isBefore(userDate) || dateNow.isEqual(userDate)) {
            return true;
        }
        return false;

    }

    /**
     * @return dagens datum
     */
    public LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    /**
     * Formatterar texten till timmar och minuter
     * @return klockslaget i timmar och minuter
     */
    public String getCurrentTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        return dtf.format(LocalTime.now());
    }
}
