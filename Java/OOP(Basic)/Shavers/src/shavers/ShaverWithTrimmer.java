package shavers;

/**
 * Наследование
 */
public class ShaverWithTrimmer extends Shaver {

    ShaverWithTrimmer(int razorCount) {
        super(razorCount);      //вызов конструктора из родительского класса
        this.mRazors++;
    }

    void trim() {
    }

    //Override - перегрузить переопределить метод класса родителя.
    void shave(int stubble) {
        super.shave(stubble);
        this.trim();
    }
}
