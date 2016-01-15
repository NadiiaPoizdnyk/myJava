/** We have a right triangle with sides 3, 4 and 5cm.
 *  The program determines the hypotenuse and the area of the triangle.
 */
public class RightTriangle {
    public static void main(String[]args){

        int a = 3;
        int b = 4;
        int c = 5;
        double square = 0;

        if (a>b && a>c){
            square = b*c/2;
        }

        if (b>a && b>c){
            square = a*c/2;
        }
        if (c>a && c>b){
            square = a*b/2;
        }

        System.out.println("The area is "+square);
    }
}
