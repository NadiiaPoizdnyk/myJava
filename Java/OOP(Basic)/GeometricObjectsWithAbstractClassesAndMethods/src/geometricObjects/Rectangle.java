package geometricObjects;

public class Rectangle extends GeometricFigures {

    Rectangle (int a, int b){
        super(a, b);
    }

    double getFigureSquare(){
        return dim1 * dim2;
    }
}
