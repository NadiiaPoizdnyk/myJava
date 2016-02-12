package strings;

/**
 * The program displays the sequence number of the character from which begin words: dad, mom, son, daughter.
 */
public class indexOf {
    public static void main(String[]args){

        String str = "My dad is at home, my mom is at home, my sone is at home, my daughter is at home";

        int dad = str.indexOf("dad");     // methods of the String class, indexOf
        int mom = str.indexOf("mom");
        int son = str.indexOf("son");
        int daughter = str.indexOf("daughter");

        System.out.println(dad);
        System.out.println(mom);
        System.out.println(son);
        System.out.println(daughter);

    }
}
