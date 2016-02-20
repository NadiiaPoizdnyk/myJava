package geometricObjects;

public class Main {
    public static void main(String[] args) {
        double result;

        Rhombus rhombus = new Rhombus(5);
        result = rhombus.getFigureSquare();
        System.out.println("Rhombus Square: " + result + " cm");

        Rectangle rectangle = new Rectangle(5, 2);
        result = rectangle.getFigureSquare();
        System.out.println("Rectangle Square: " + result + " cm");

        RightangledTriangle rightangledTriangle = new RightangledTriangle(4, 2);
        result = rightangledTriangle.getFigureSquare();
        System.out.println("Rightangled Triangle Square: " + result + " cm");

        Сircle circle = new Сircle(5);
        result = circle.getFigureSquare();
        System.out.println("Сircle Square: " + result + " cm");

        Ellipse ellipse = new Ellipse(3,5);
        result = ellipse.getFigureSquare();
        System.out.println("Ellipse Square: " + result + " cm");

        Parallelogram parallelogram = new Parallelogram(8, 5);
        result = parallelogram.getFigureSquare();
        System.out.println("Parallelogram Square: " + result + " cm");

        Trapezium trapezium = new Trapezium(8, 7, 4);
        result = trapezium.getFigureSquare();
        System.out.println("Trapezium Square: " + result + " cm");

        Parallelepiped parallelepiped = new Parallelepiped(4, 3, 7);
        result = parallelepiped.getFigureSquare();
        System.out.println("Parallelepiped Square: " + result + " cm");

        Cube cube = new Cube(5);
        result = cube.getFigureSquare();
        System.out.println("Cube Square: " + result + " cm");
        double result1 = cube.getVolume(5);
        System.out.println("Cube Volume: " + result1 );
    }
}
