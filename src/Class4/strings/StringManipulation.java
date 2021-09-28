package Class4.strings;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] agrs) {
        String str1 = "This is a text."; // a string variable
        String str2 = "This is a text.";

        // string concatenation
        System.out.printf("\n%s\n", str1 + str2);

        // string equality
        if (str1.equals(str2)) //this is how to check for equality!!
            System.out.printf("\"%s\" equals \"%s\"\n", str1, str2);
        else
            System.out.printf("\"%s\" not equals \"%s\"\n", str1, str2);

        // string trimming
        String trailing = "\t\n te xt \t\n";
        System.out.printf("untrimmed: \"%s\"\n", trailing);
        //remove leading and trailing whitespace
        System.out.printf("trimmed: \"%s\"\n", trailing.trim());

        // character demo 1 # calculations
        char c = 'H'; // a single character
        System.out.printf("c: '%c' (%d)\n", c, c + 0);
        System.out.printf("added: '%c'\n", c + ('a' - 'A')); //convert to lower case

        // character demo 2 # read single character
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("");
        String s = sc.next();
        c = s.charAt(0);
        System.out.printf("s: \"%s\"\n", s);
        System.out.printf("c: '%c'\n", c);
        sc.reset(); //reset to standard behavior
        sc.close();
    }
}
