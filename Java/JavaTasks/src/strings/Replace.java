package strings;

/**
 * The program changes one sequences of symbols for other.
 */
public class Replace {
    public static void main(String[]args){

        String str = "My dad is at home, my mom is at home, my sone is at home, my daughter is at home";
        System.out.println(str);

        String str1 = str.replace("home", "school"); // methods of the String class, replace()
        System.out.println(str1);

        String str2 = str1.replace("my son", "John");
        System.out.println(str2);

        String str3 = str2.replace("my daughter", "Bella");
        System.out.println(str3);
    }
}
