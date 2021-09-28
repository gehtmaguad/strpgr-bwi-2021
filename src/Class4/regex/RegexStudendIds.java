package Class4.regex;

import java.util.Scanner;

public class RegexStudendIds {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        String studidPattern = "(wi|if)[0-9]{2}b[0-9]{3}";
        String input = sc.next();
        System.out.printf("\"%s\" matches %s\n",
                input,
                input.matches(studidPattern) ? "" : "NOT");
    }
}
