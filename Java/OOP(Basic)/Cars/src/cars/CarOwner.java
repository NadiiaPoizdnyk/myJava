package cars;

public class CarOwner {
    public static void main(String[] args) {

        int distance;

        Car myCar = new Car();
        myCar.start();
        distance = myCar.drive(30);
        System.out.println("My car distance: " + distance);
        myCar.stop();

        Car JBcar = new Car();
        JBcar.drive(2);
        System.out.println("James Bond's car distance: " + distance);
        JBcar.stop();

    }
}
