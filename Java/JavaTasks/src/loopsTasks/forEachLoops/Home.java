package loopsTasks.forEachLoops;

/**
 * The program greets each family member individually and all together.
 */
public class Home {
    public static void main(String[]args){

        String[] j = {"daddy", "mom", "son", "daughter"};

        for (String x : j){
            System.out.println("variable.Hello, " + x);
        }
        System.out.println("Hi all");
    }
}
