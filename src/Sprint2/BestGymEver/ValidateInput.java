package Sprint2.BestGymEver;

public class ValidateInput {


    /**
     * Kolla om användaren input är ett namn eller ett personnummer med max 10 siffror.
     * Med hjälp av regex.
     * @param input (Användarens input)
     * @return boolean om sant.
     */
    public boolean checkInput(String input) {

        if(input.matches("([a-zA-Z\\-]+){3,}\\s+([a-zA-Z\\-]+){3,}")) {
            return true;
        }
        else if(input.matches("^[0-9]{10}$")) {
            return true;
        }
        else {
            return false;
        }
    }


}
