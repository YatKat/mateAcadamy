package lesson4.homeTaskCar;

public class CarWheel {
    private double wheelState;

    public CarWheel() {
        this.wheelState = 1;
    }

    public CarWheel(double wheelState) {
        this.wheelState = wheelState;
    }

    public double getWheelState() {
        return wheelState;
    }

    public void setWheelState(double wheelState) {
        this.wheelState = wheelState;
    }

    public void changeWheel() {
        wheelState = 1;
    }

    public void eraseWheel(int percent) {
        wheelState = wheelState - (percent * 100 / wheelState);
    }

    public void printSate() {
        System.out.println(wheelState);
    }
}
