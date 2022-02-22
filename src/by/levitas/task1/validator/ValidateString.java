package validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateString {
    private static final String VALIDATION_PATTERN = "^[-0-9 ]+$";

    public static boolean IsContainOnlyNumbers(String stringToValidate) {
        Pattern pattern = Pattern.compile(VALIDATION_PATTERN);
        Matcher matcher = pattern.matcher(stringToValidate);

        return matcher.matches();
    }
}
