package decisionMakingStatements.ternary;

/** The program reports, who is at home now: father, mother or son.
 * The answer is generated randomly.
 */
public class Home {
    public static void main(String[]args){

        int a = (int)(Math.random()*2);
        int b = (int)(Math.random()*2);
        int c = (int)(Math.random()*2);

        String k = a == 0? "Dad is at home" : "Dad is not at home";
        String g = b == 0? "Mom is at home" : "Mom is not at home";
        String j = c == 0? "Son is at home" : "Son is not at home";

        System.out.println(k);
        System.out.println(g);
        System.out.println(j);
    }
}
