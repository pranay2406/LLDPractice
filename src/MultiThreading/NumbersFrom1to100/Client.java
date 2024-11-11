package MultiThreading.NumbersFrom1to100;

public class Client {
    public static void main(String[] args) {
          for(int i=0;i<100;i++)
          {
              NumberPrinter n = new NumberPrinter(i);
              Thread thread = new Thread(n);
              thread.start();

          }
    }
}
