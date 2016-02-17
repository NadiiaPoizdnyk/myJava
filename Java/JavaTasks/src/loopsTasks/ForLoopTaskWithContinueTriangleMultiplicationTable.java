package loopsTasks;

/**
 * create triangle multiplication table
 */
public class ForLoopTaskWithContinueTriangleMultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (j > i) {
                    System.out.print("\n");
                    continue;
                }
                System.out.print("\t" + (i * j));
            }
        }
    }
}
