package geometricObjects;

public class Rhombus extends GeometricFigures {

    Rhombus (int a){
        super(a);
    }

    @Override
    double getFigureSquare() {
        return dim1 * dim1;
    }
}
