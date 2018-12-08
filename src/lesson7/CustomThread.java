package lesson7;

public class CustomThread extends Thread {
    long sleepMillisecond;
    String name;

    public CustomThread(String name, long sleepMillisecond) {
        super(name);
        this.sleepMillisecond = sleepMillisecond;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " started");
        try {
            Thread.sleep(sleepMillisecond);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException was occured in " + name);
        }
        System.out.println(name + " finished");
    }
}
