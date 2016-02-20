package geometricObjects;

public abstract class GeometricFigures {

    double dim1;
    double dim2;
    double dim3;

    GeometricFigures(int a, int b){
        dim1 = a;
        dim2 = b;
    }

    GeometricFigures(int a){
        dim1 = a;
    }

    GeometricFigures(int a, int b, int c){
        dim1 = a;
        dim2 = b;
        dim3 = c;
    }

    abstract double getFigureSquare();
}
