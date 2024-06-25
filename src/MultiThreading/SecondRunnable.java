package MultiThreading;

public class SecondRunnable extends Thread
{
    @Override
    public void run() {
        System.out.println("Hi from second Runner");

        super.run();
    }

}
