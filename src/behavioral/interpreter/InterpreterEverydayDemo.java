package behavioral.interpreter;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class InterpreterEverydayDemo {

    public static void main(String[] args) {
        String input = "Tigers, and cats, and dogs! Wow, me!";

        Pattern p = Pattern.compile("(cat|dog|mouse|human|rabbit|Tigers)");
        Matcher m = p.matcher(input);

        while (m.find()) {
            System.out.println("Found a " + m.group() + ".");
        }
    }
}
