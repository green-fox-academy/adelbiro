package petrolstation;

public class Station {
    int gasAmount;

    public void Station(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    public void refill(Car car) {
        this.gasAmount = this.gasAmount - car.capacity;
        car.gasAmount = car.capacity;
    }
}
