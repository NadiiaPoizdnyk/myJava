package boxes;

public class Box {

    int width;
    int height;
    int depth;
    String colors;

    int getVolume(){
        return width * height * depth;
    }

    void setDim(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }
}
