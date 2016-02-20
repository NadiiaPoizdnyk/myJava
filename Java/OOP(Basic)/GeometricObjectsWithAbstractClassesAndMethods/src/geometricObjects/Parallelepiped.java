package geometricObjects;

public class Parallelepiped extends GeometricFigures {

    Parallelepiped(int a, int b, int c) {
        super(a, b, c); // sides
    }

    double getFigureSquare() {
        return 2 * (dim1*dim2 + dim1*dim3 + dim2*dim3);
    }
}