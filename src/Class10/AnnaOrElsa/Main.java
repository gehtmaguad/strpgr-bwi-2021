package Class10.AnnaOrElsa;

import java.util.Scanner;

public class Main {
    private static final int ELSA = -2;
    private static final int ANNA = -1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question[] questions = {
                new Question("Winter", 2, 1), //0
                new Question("Mutig", 5, 4),  //1
                new Question("Allein", 3, 4),  //2
                new Question("Abenteuer", 4, ELSA), //3
                new Question("Rentiere", ANNA, ELSA),   //4
                new Question("Gehemnis", 4, ANNA),  //5
        };

        int idx = 0;
        do {
            System.out.printf("%s?: ", questions[idx].text);
            String c = sc.next();
            if (c.equals("+"))
                idx = questions[idx].on_yes;
            else if (c.equals("-"))
                idx = questions[idx].on_no;
        } while (idx >= 0);

        System.out.printf("%s", (idx == ELSA) ? "ELSA" : "ANNA");
        sc.close();
    }
}
