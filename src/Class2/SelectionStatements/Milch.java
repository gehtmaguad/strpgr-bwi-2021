package Class2.SelectionStatements;

import java.util.Scanner;

public class Milch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fett;
        int haltbar;
        int k;

        System.out.printf("Fettgehalt: ");
        fett = sc.nextDouble();
        System.out.printf("Haltbar: ");
        haltbar = sc.nextInt();

        if (fett < 0 || haltbar < 0 || haltbar > 1)
            k = -1;
        else if (fett > 7) {
            if (haltbar == 0)
                k = 1;
            else
                k = 2;
        } else if (fett < 3) {
            if (haltbar == 0)
                k = 3;
            else
                k = 4;
        } else {
            if (haltbar == 0)
                k = 5;
            else
                k = 6;
        }

        if (k == -1)
            System.out.printf("Ungueltig!\n");
        else if (k == 1)
            System.out.printf("Extravollmilch (frisch)\n");
        else if (k == 2)
            System.out.printf("Extravollmilch (haltbar)\n");
        else if (k == 3)
            System.out.printf("Leichtmilch (frisch)\n");
        else if (k == 4)
            System.out.printf("Leichtmilch (haltbar)\n");
        else if (k == 5)
            System.out.printf("Normalmilch (frisch)\n");
        else if (k == 6)
            System.out.printf("Normalmilch (haltbar)\n");

        sc.close();

    }
}
