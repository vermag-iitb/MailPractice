import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Notes:
// regex - stands for regular expression
//

public class matcherCode {
    public static final String SINGLE_EMAIL_REGEX = "(?:(?:[A-Za-z0-9\\-_@!#$%&'*+/=?^`{|}~]|(?:\\\\[\\x00-\\xFF]?)|(?:\"[\\x00-\\xFF]*\"))+(?:\\.(?:(?:[A-Za-z0-9\\-_@!#$%&'*+/=?^`{|}~])|(?:\\\\[\\x00-\\xFF]?)|(?:\"[\\x00-\\xFF]*\"))+)*)@(?:(?:[A-Za-z0-9](?:[A-Za-z0-9-]*[A-Za-z0-9])?\\.)+(?:(?:[A-Za-z0-9]*[A-Za-z][A-Za-z0-9]*)(?:[A-Za-z0-9-]*[A-Za-z0-9])?))";
//
//    (?:+*)
//    (?:[A-Za-z0-9\-_@!#$%&'*+/=?^`{|}~]|(?:\\[\x00-\xFF]?)|(?:"[\x00-\xFF]*"))
//    (?:\.(?:(?:[A-Za-z0-9\-_@!#$%&'*+/=?^`{|}~])|(?:\\[\x00-\xFF]?)|(?:"[\x00-\xFF]*"))+)
//    @
//    (?:[A-Za-z0-9](?:[A-Za-z0-9-]*[A-Za-z0-9])?\.)
//    (?:+(?:(?:[A-Za-z0-9]*[A-Za-z][A-Za-z0-9]*)(?:[A-Za-z0-9-]*[A-Za-z0-9])?))

    public static final Pattern EMAIL_PATTERN = Pattern.compile(SINGLE_EMAIL_REGEX);

    public static void main(String args[]) throws Exception {
//        String email = "ga.ve@xyz.com";
//        Matcher matcher = EMAIL_PATTERN.matcher(email);
//        System.out.println("matcher.matches() => " + matcher.matches());
//        String input = "abcDEF123.-_";
        Object input = false;
        boolean isValid = input.toString().matches("[a-zA-Z0-9_.-]+");
        System.out.println(isValid); // true
    }
}