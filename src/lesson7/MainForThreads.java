package lesson7;

public class MainForThreads {
    public static void main(String[] args) {
        Thread myThread = new CustomThread("myThread", 3000);
        Thread otherThread = new CustomThread("OtherThread", 5000);
        // if we invoke just run method, it will not start new threads;
        //to start new thread? we should invoke start method on thread;
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
