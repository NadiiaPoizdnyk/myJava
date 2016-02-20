package geometricObjects;

public class RightangledTriangle extends GeometricFigures {

    RightangledTriangle(int a, int b){
        super(a, b);  //катеты
    }

    double getFigureSquare(){
        return 0.5 * dim1 * dim2;
    }

}
