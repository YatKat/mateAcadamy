package lesson4.homeTaskCar;

public class CarDoor {
    private boolean isDoorClosed;
    private boolean isWindowClosed;
    private boolean isDoorOpened;
    private boolean isWindowOpened;

    public CarDoor() {
        this.isDoorClosed = true;
        this.isWindowClosed = true;
        this.isDoorOpened = false;
        this.isWindowOpened = false;
    }

    public CarDoor(boolean isDoorClosed, boolean isWindowClosed, boolean isDoorOpened, boolean isWindowOpened) {
        this.isDoorClosed = isDoorClosed;
        this.isWindowClosed = isWindowClosed;
        this.isDoorOpened = isDoorOpened;
        this.isWindowOpened = isWindowOpened;
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

    public boolean isDoorOpened() {
        return isDoorOpened;
    }

    public void setDoorOpened(boolean doorOpened) {
        isDoorOpened = doorOpened;
    }

    public boolean isWindowOpened() {
        return isWindowOpened;
    }

    public void setWindowOpened(boolean windowOpened) {
        isWindowOpened = windowOpened;
    }

    public boolean openDoor(){
      return isDoorOpened = true;
    }

    public boolean closeDoor(){
        return isDoorClosed = true;
    }

    public void openCloseDoor(){
        if(isDoorClosed) isDoorOpened = true;
        else isDoorClosed = true;
    }

    public boolean openWindow(){
        return isWindowOpened = true;
    }

    public boolean closeWindow(){
        return isWindowClosed = true;
    }

    public void openCloseWindow(){
        if(isWindowClosed) isWindowClosed = true;
        else isWindowClosed = true;
    }

    public void printData(){
        System.out.println(isDoorClosed +", " + isDoorOpened +", " + isWindowClosed +", " + isWindowOpened);
    }

}
