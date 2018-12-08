package lesson7;

public class MainForThreads {
    public static void main(String[] args) {
        Thread myThread = new CustomThread ("myThread", 3000);
        Thread otherThread = new CustomThread("OtherThread", 5000);
        myThread.start();
        otherThread.start();
        System.out.println("main method finished");
    }
}
//Output:
//main method finished
//myThreadstarted
//OtherThreadstarted
//myThreadfinished
//OtherThreadfinished