package shavers;


public class Shaver {

    int mRazors;

    Shaver(int razorCount){
        this.mRazors = razorCount;
    }

    void shave(int stubble) {
        while (stubble >= mRazors){
            stubble = this.mRazors;
        }
    }
}
