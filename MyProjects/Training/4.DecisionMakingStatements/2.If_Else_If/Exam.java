/** A student passed the exam. The program displays the results of the exam and gives its own assessment of student's
 * knowledge. Assessment is determined by the program.
 */
public class Exam {
    public static void main(String[]args){

        int exam = (int)(Math.random()*10+1);

        if (exam <3){
            System.out.println(exam + " -very bad");
        } else if (exam <5){
            System.out.println(exam + " -bad");
        } else if (exam <7){
            System.out.println(exam + " -satisfactorily");
        } else if (exam <9){
            System.out.println(exam + " -good");
        } else {
            System.out.println(exam + " -excellent");
        }
    }
}
