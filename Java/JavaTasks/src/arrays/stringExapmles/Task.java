package arrays.stringExapmles;

/**
 * String from  an array
 */
public class Task {
    public static void main(String[]args){

        String[] j = {"Peter", " is at home", "Alice", " is at school", "Bill", " is at home", "Mike", " is at school"};
        int l = j.length;
        String stroka = "";

        for (int i = 0; i < l; i = i + 2){
            stroka = stroka + j[i] + "" + j[i + 1] + ". ";
        }
        System.out.println(stroka);
    }
}
