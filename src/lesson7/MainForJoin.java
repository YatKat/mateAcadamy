package lesson7;

public class MainForJoin {
    public static void main(String[] args) {
        Thread myThread = new CustomThread("myThread", 3000);
        Thread otherThread = new CustomThread("OtherThread", 5000);
        myThread.start();
        try {
            myThread.join(500);
            myThread.join(5000);
            System.out.println("myThread join exit");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        otherThread.start();
        System.out.println("main method finished");
    }
}

//Output:
//myThreadstarted
//myThreadfinished
//myThread join exit
//main method finished
//OtherThreadstarted
//OtherThreadfinished
