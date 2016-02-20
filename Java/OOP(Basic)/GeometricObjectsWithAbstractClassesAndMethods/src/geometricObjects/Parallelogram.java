package geometricObjects;

public class Parallelogram extends GeometricFigures {

    Parallelogram(int a, int b) {
        super(a, b); // side and h
    }

    double getFigureSquare() {
        return dim1 * dim2;
    }
}