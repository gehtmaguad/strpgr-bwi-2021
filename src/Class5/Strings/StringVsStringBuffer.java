package Class5.Strings;

public class StringVsStringBuffer {
    // Java-Strings sind unveränderbar - bei jeder Änderung wird ein neues Objekt erzeugt
    // Java-StringBuffer sind beliebig veränderbar
    // https://javabeginners.de/String/StringBuffer.php
    public static void main(String[] args) {
        StringBuffer buff = new StringBuffer("sch\u00E4fer");
        System.out.println(buff);
        buff.insert(3, 'l');
        System.out.println(buff);
        buff.insert(0, 7);
        System.out.println(buff);
        buff.append("höhle");
        System.out.println(buff);
    }
}
