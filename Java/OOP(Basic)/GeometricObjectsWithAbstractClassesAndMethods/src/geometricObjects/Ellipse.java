package geometricObjects;

public class Ellipse extends GeometricFigures{

    Ellipse(int a, int b){
        super(a, b); //R, r
    }

    double getFigureSquare(){
        return 3.14 * dim1 * dim2;
    }
}
