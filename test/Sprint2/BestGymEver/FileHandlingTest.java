package Sprint2.BestGymEver;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FileHandlingTest {

    FileHandling fh = new FileHandling();

    @Test
    void checkFilesForInput() {

        ArrayList<Person> person = new ArrayList<>();
        person.add(new Person("Ida Idylle", "2222222222", "2017-03-07"));
        person.add(new Person("Diamanda Djedi", "7608021234", "2019-01-30"));

        assertTrue(fh.checkFilesForInput(person, "Ida Idylle").equals("Välkommen tillbaka Ida Idylle"));
        assertTrue(fh.checkFilesForInput(person, "Kalle anka").equals("Obehörig Person"));
        assertTrue(fh.checkFilesForInput(person, "7608021234").equals("Välkommen Diamanda Djedi"));
        assertFalse(fh.checkFilesForInput(person, "Diamanda Djedi").equals("Obehörig Person"));
        assertFalse(fh.checkFilesForInput(person, "2222222222").equals("Välkommen Diamanda Djedi"));

    }




}