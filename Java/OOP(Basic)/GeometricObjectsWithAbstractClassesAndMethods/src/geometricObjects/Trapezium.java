package geometricObjects;

public class Trapezium extends GeometricFigures {

    Trapezium(int a, int b, int c) {
        super(a, b, c); // sides and h
    }

    double getFigureSquare() {
        return ((dim1 + dim2)/2) * dim3;
    }
}