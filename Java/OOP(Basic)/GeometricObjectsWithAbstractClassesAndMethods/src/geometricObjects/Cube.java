package geometricObjects;

public class Cube extends GeometricFigures {

    Cube(int a) {
        super(a);
    }

    double getFigureSquare() {
        return 6 * dim1 * dim1;
    }

    double getVolume(int a){
        return a * a * a;
    }
}