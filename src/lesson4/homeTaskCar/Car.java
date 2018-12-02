package lesson4.homeTaskCar;

public class Car {
    private final String MADE_DATE;
    private String engineType;
    private int maxSpeed;
    private int passengersCapacity;
    private int accelerateTime;
    private int quantityOfPassengers;
    private int currentSpeed;
    private CarWheel[] wheels;
    private CarDoor[] doors;

    public Car(String MADE_DATE, String engineType, int maxSpeed, int passengersCapacity, int accelerateTime,
               int quantityOfPassengers, int currentSpeed) {
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.passengersCapacity = passengersCapacity;
        this.accelerateTime = accelerateTime;
        this.quantityOfPassengers = quantityOfPassengers;
        this.currentSpeed = currentSpeed;
        this.MADE_DATE = MADE_DATE;
    }

    public Car(String MADE_DATE) {
        this.MADE_DATE = MADE_DATE;
    }

    public String getMADE_DATE() {
        return MADE_DATE;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public void setPassengersCapacity(int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }

    public int getAccelerateTime() {
        return accelerateTime;
    }

    public void setAccelerateTime(int accelerateTime) {
        this.accelerateTime = accelerateTime;
    }

    public int getQuantityOfPassengers() {
        return quantityOfPassengers;
    }

    public void setQuantityOfPassengers(int quantityOfPassengers) {
        this.quantityOfPassengers = quantityOfPassengers;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public CarWheel[] getWheels() {
        return wheels;
    }

    public void setWheels(CarWheel[] wheels) {
        this.wheels = wheels;
    }

    public CarDoor[] getDoors() {
        return doors;
    }

    public void setDoors(CarDoor[] doors) {
        this.doors = doors;
    }

    public int changeCurrentSpeed(int addSpeed){
       return currentSpeed = currentSpeed+addSpeed;
    }

    public int takeOnePassenger(){
        return quantityOfPassengers++;
    }

    public int landOnePassenger(){
        return quantityOfPassengers--;
    }

    /** method return quantity of landed passengers and set quantityOfPassengers to 0
     * @return quantity of landed passengers, int;
     */
    public int landAllPassengers(){
        int landedPassengers = quantityOfPassengers;
        quantityOfPassengers = 0;
        return landedPassengers;
    }

    public CarDoor getDoorByIndex(int index){
             CarDoor door = doors[index];
             return door;
    }

    public CarWheel getWheelByIndex(int index){
        CarWheel wheel = wheels[index];
        return wheel;
    }

    /**
     * method take off all wheels from the car;
     * set CarWheel object to null;
     */
    public void takeOffWheels(){
        for (int i = 0; i < wheels.length ; i++) {
            wheels[i] = null;
        }

    }

    /**
     * method add new quanity of wheel to existed quantity of wheels at the car;
     * @param quantity
     * @return array of wheels (CarWheel objects) with new quantity;
     */
    public CarWheel[] addNewWheels(int quantity){
        CarWheel[] newWheels = new CarWheel[wheels.length + quantity];
        return newWheels;
    }

    public int getMaxCurrentSpeed(){
        if(quantityOfPassengers == 0) return 0;
        CarWheel wheel = new CarWheel();
        int maxCurrentSpeed = maxSpeed*(int)(wheel.getWheelState());
        return maxCurrentSpeed;
    }

    public void printAllData(){
        System.out.println(MADE_DATE + " ," + engineType + " ," + maxSpeed + " ," + passengersCapacity +
                " ," + accelerateTime + " ," + currentSpeed + " ," + quantityOfPassengers + " ," +
        getMaxCurrentSpeed());
    }
}
