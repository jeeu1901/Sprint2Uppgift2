package Sprint2.BestGymEver;

import javax.swing.*;
import java.util.ArrayList;

public class MainGym {

    MainGym() {
        ArrayList<Person> person = new ArrayList<>();

        FileHandling fh = new FileHandling();
        ValidateInput v = new ValidateInput();
        fh.readFile(person);

        String errorMsg = "";
        boolean correctInput = false;
        while(!correctInput) {
            String input = JOptionPane.showInputDialog(errorMsg + "Ange ditt namn(Format:Förnamn Efternamn)\nEller ange ditt personnummer:(Format: YYMMDDXXXX)");
            if(input == null) {
                System.out.println("Programmet avlutas");
                System.exit(0);
            }
            if(v.checkInput(input)) {
                JOptionPane.showMessageDialog(null, fh.checkFilesForInput(person, input));
                correctInput = true;
            }
            else {
                errorMsg = "Du skrev in en ogiltlig input!\n";
            }
        }

    }

    public static void main(String[] args) {
        MainGym start = new MainGym();
    }
}
