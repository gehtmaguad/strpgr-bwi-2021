package Class5.Strings;

public class StringPool {
    public static void main(String[] args) {
        String string1 = "StringPool?";
        String string2 = "StringPool?";
        String string3 = new String("StringPool?");
        String string4 = new String("StringPool?");

        System.out.printf("s1 == s2: %b\n", (string1 == string2));
        System.out.printf("s1 == s3: %b\n", (string2 == string3));
        System.out.printf("s1 == s3: %b\n", (string3 == string4));

        System.out.printf("s1 equals s2: %b\n", (string1.equals(string2)));
        System.out.printf("s1 equals s3: %b\n", (string2.equals(string3)));
        System.out.printf("s1 equals s3: %b\n", (string3.equals(string4)));
    }
}
