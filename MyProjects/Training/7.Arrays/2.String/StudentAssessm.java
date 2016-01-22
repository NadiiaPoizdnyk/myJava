/**
 * The program displays assessments of students.
 *
 * !!! INITIALIZATION of arrays when they are DECLARED!!!
 */
public class StudentAssessm {
    public static void main(String[]args){

        String[] j = {"Alice -", "Julia -", "Alex -", "Bella -", "Bill -"};
        int[] g = {8, 7, 6, 5, 4};
        int l = j.length;

        System.out.println("Assessment of students:");
        for (int i = 0; i < l; i++){
            System.out.println(j[i] + " " + g[i]);
        }
    }
}
