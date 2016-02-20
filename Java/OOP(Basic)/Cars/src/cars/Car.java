package cars;

public class Car {      //is subclassed by cars.JamesBondCar

    int distance;

    public void start(){
        System.out.println("I start to drive");
    }

    public void stop(){
        System.out.println("I stop to drive");
    }

    public int drive(int howLong){
        distance = howLong * 60;        //is overridden in cars.JamesBondCar
        return (distance);
    }
}
