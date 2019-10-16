package Sprint2.BestGymEver;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;


class ValidateInputTest {

    ValidateInput v = new ValidateInput();

    @Test
    void checkInput() {
        String input1 = "9308184572";
        String input2 = "Jessie Eurenius";
        String input3 = "Kal1 kalsson";
        String input4 = "93a2310252";
        String input5 = "12345678901";
        String input6 = "hej hej hej hej";
        String input7 = "Hej-hej Hejsanhej";

        TestCase.assertTrue(v.checkInput(input1));
        TestCase.assertFalse(v.checkInput(input4));

        TestCase.assertTrue(v.checkInput(input2));
        TestCase.assertTrue(v.checkInput(input2));

        TestCase.assertFalse(v.checkInput(input5));
        TestCase.assertFalse(v.checkInput(input3));

        TestCase.assertFalse(v.checkInput(input6));
        TestCase.assertTrue(v.checkInput(input7));
    }
}