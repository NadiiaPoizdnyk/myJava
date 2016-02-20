package shavers;

/**
 * описание класса —как шаблон, по которому будут создаваться объекты.
 * по описанию создастся экземпляр класса Shaver
 * а затем вызовется конструктор, который в примере принимает в качестве параметра
 * целочисленное значение — количество лезвий (3).
 */
public class ShaverOwner {
    public static void main(String[] args) {

        Shaver myShaver = new Shaver(3);
        ShaverWithTrimmer myTrimShaver = new ShaverWithTrimmer(3);

        // Полиморфизм
        Shaver [] shavers = new Shaver[2];
        shavers[0] = new Shaver(3);
        shavers[1] = new ShaverWithTrimmer(3);
        for (Shaver s: shavers){
            s.shave(0);
        }
    }
}
