package MultiThreading;

public class SimpleRunnable implements Runnable{

    @Override
    public void run() {
        meth1();
        System.out.println("Hi from SimpleRunnable");

    }

    public static  void meth1()
    {

    }
}
