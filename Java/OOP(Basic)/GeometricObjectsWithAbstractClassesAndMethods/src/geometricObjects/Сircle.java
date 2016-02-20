package geometricObjects;

public class Сircle extends GeometricFigures{

    Сircle(int a){
        super(a); //R
    }

    double getFigureSquare(){
        return 3.14 * dim1 * dim1;
    }
}
