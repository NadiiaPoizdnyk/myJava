package strings;

// Task3 slide #11

public class WorkWithStrings {
    public static void main(String[]args){
        String attention = "Внимание: ";
        String s = attention + "неизвестный символ";

        System.out.println(attention += s);
    }
}
