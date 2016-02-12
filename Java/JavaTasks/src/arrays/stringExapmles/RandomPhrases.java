package arrays.stringExapmles;

/** The program generates random phrases from arrays of strings.
 */
public class RandomPhrases {
    public static void main(String[]args){

        String[] j1 = {"Alice", "Julia", "Alex", "Bella", "Bill"};
        String[] j2 = {" looks", " studies", " reads", " hurts", " writes"};
        String[] j3 = {" a lesson.", " a test.", " a text.", " a task.", " a homework."};

        int i1 = (int)(Math.random()*5);
        int i2 = (int)(Math.random()*5);
        int i3 = (int)(Math.random()*5);

        String a = j1[i1] + j2[i2] + j3[i3];
        System.out.println(a);
    }
}
