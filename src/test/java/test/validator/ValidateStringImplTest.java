package test.validator;

import org.testng.annotations.Test;
import validator.ValidateString;

import static org.testng.Assert.*;

public class ValidateStringImplTest {

    @Test
    public void testIsContainOnlyNumbersPositive() {
        ValidateString validateString = new ValidateString();
        String stringToValidate = "1 2 3342 32 21";
        boolean actual = validateString.IsContainOnlyNumbers(stringToValidate);
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @Test
    public void testIsContainOnlyNumbersNegative() {
        ValidateString validateString = new ValidateString();
        String stringToValidate = "1c 22d3 3342da 32 sa21";
        boolean actual = validateString.IsContainOnlyNumbers(stringToValidate);
        boolean expected = false;
        assertEquals(actual, expected);
    }
}