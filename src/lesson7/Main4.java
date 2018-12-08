package lesson7;

public class Main4 {
    public static void main(String[] args) {
        Thread myThread = new CustomThread ("myThread", 3000);
        Thread otherThread = new CustomThread("OtherThread", 5000);
        myThread.setDaemon(true);
        myThread.start();
        otherThread.setDaemon(true);
        otherThread.start();

        try {
            //myThread.join(10);
            //myThread.join(50);
            myThread.join(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main method finished");
    }
}
//Output for join 10
//