package validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateString {
    public static boolean IsContainOnlyNumbers(String stringToValidate) {
        Pattern pattern = Pattern.compile("^[-0-9 ]+$");
        Matcher matcher = pattern.matcher(stringToValidate);

        return matcher.matches();
    }
}
