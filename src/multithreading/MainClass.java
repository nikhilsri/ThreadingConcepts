package multithreading;

public class MainClass {

    //Main Class

        public static void main(String[] args)
        {
            OddThread.sharedPrinter printer = new OddThread.sharedPrinter();
            OddThread oddThread = new OddThread(20, printer);
            oddThread.setName("Odd-Thread");
            OddThread.EvenThread evenThread = new OddThread.EvenThread(20, printer);
            evenThread.setName("Even-Thread");
            oddThread.start();
            evenThread.start();
        }

}
