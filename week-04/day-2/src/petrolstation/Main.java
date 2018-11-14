package petrolstation;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Station molStation = new Station();
        molStation.gasAmount = 1000;

        molStation.refill(myCar);
        System.out.println(myCar.gasAmount);
        System.out.println(molStation.gasAmount);
    }
}
