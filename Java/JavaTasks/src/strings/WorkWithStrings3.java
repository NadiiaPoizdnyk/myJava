package strings;

/* Slide #12
- String Length   ---> Длина строки:                  String s = "Write once, run anywhere."; int len = s.length();
- Character Selection  ---> Выбор символа:            char ch = s.charAt(позиция);
- ??? Substring Selection ---> Выбор подстроки:       substring(int begin, int end)
 */

public class WorkWithStrings3 {
    public static void main(String[]args){

        String s = "Write once, run anywhere."; //25 with spaces
        int len = s.length();
        char ch;

        System.out.println("String length: " + len);
        System.out.println(ch = s.charAt(0)); // position '0' - the 1st character in the string

    }
}
