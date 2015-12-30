/* Task4 slide #14; slide #13 and #15
== сопоставляет только ссылки на строки. Она выясняет, указывают ли ссылки на одну и ту же строку.

Логический метод equals (object obj);
s1.equals(s3);
 */

public class WorkWithStrings2 {
    public static void main(String[]args){
        String a = "Good Morning my dear friends!";
        String b = "How is going?";
        String c = "How is going?";

        Integer x = new Integer(6);
        Integer y = new Integer(6);

        System.out.println(a==b);       // выясняет, указывают ли ссылки на одну и ту же строку.
        System.out.println(a.equals(c));
        System.out.println(c==b);
        System.out.println(c.equals(b));
        System.out.println("________________________________");

        System.out.println(x == y); // --> FALSE, т.к. это разные объекты с разными ссылками
        System.out.println(x.equals(y)); // --> TRUE, здесь уже задействована логика сравнения
    }
}
