/**
 * The program splits the strings into an array of strings.
 * The separator is a space. The program prints each element of the array and returns the string in reverse order.
 */
public class Split {
    public static void main(String[]args){

        String st = "dad is at home, mom is at home, son is at home, daughter is at home";
        System.out.println(st);
        String str[] = st.split(" ");   // methods of the String class, split()
        int l = str.length;

        for (int i = 0; i < l; i++){
            System.out.println("str[" + i + "] = " + str[i]);
        }
        for (int i = (l -  1); i >= 0; i = i - 1){
            System.out.print(str[i] + " ");
        }
    }
}
