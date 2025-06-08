class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < MyThreadApp.SIZE; i++) {
            System.out.println("    R = " + i);
        }
    }
}
public class MyThreadApp {
    public final static long SIZE = 100;

    public static void main(String[] args) {
        int availableProcessors = Runtime.getRuntime().availableProcessors();

        for (int i = 0; i < availableProcessors; i++) {
            Thread infiniteThread = new Thread(() -> {
                while(true) {

                }
            });
     //       infiniteThread.start();
        }

        MyThread thread = new MyThread();
        thread.start();

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < SIZE; i++) {
                System.out.println("            Tr2 = " + i);
            }
        });
        thread2.start();

        for (int i = 0; i < SIZE; i++) {
            System.out.println("i = " + i);
        }
    }
}
