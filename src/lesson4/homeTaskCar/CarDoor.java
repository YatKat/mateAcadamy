package lesson4.homeTaskCar;

public class CarDoor {
    private boolean isDoorClosed;
    private boolean isWindowClosed;

    public CarDoor() {
        this.isDoorClosed = true;
        this.isWindowClosed = true;
    }

    public CarDoor(boolean isDoorClosed, boolean isWindowClosed, boolean isDoorOpened, boolean isWindowOpened) {
        this.isDoorClosed = isDoorClosed;
        this.isWindowClosed = isWindowClosed;
    }

    public boolean isDoorClosed() {
        return isDoorClosed;
    }

    public void setDoorClosed(boolean doorClosed) {
        isDoorClosed = doorClosed;
    }

    public boolean isWindowClosed() {
        return isWindowClosed;
    }

    public void setWindowClosed(boolean windowClosed) {
        isWindowClosed = windowClosed;
    }

    public boolean openDoor() {
        return isDoorClosed = false;
    }

    public boolean closeDoor() {
        return isDoorClosed = true;
    }

    public boolean openCloseDoor() {
        return isDoorClosed = !isDoorClosed;
    }

    public boolean openWindow() {
        return isWindowClosed = false;
    }

    public boolean closeWindow() {
        return isWindowClosed = true;
    }

    public boolean openCloseWindow() {
        return isWindowClosed = !isWindowClosed;
    }

    public void printData() {
        System.out.println(isDoorClosed + ", " + isWindowClosed);
    }
}
