package cars;

public class JamesBondCar extends Car{

    // overrides method cars.Car
    public int drive(int howLong){
        distance = howLong*180;
        return (distance);
    }

}
