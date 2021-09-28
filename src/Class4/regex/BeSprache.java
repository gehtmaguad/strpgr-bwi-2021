package Class4.regex;

import java.util.Scanner;

public class BeSprache {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String plainText = sc.nextLine();

        System.out.printf("%s\n", plainText.toLowerCase());
        System.out.printf(
                "%s\n",
                plainText.toLowerCase()
                        .replaceAll("([aeiouäüö])", "$1b$1")
                        .toLowerCase());

        sc.close();
    }
}
