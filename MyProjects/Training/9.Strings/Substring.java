/**
 * The program converts parts of the main string into separate strings.
 */
public class Substring {
    public static void main(String[]args){

        String str = "Ma daddy is at home, my mom is at home, my son is at home, my daughter is at home";

        String dad = str.substring(3, 8);   // methods of the String class, substring()
        String mom = str.substring(24, 27);    // 27 exclusive
        String son = str.substring(43, 46);
        String daughter = str.substring(62, 70);

        System.out.println(dad);
        System.out.println(mom);
        System.out.println(son);
        System.out.println(daughter);
    }
}
