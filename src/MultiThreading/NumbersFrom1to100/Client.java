package MultiThreading.NumbersFrom1to100;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        /*  for(int i=0;i<100;i++)
          {
              NumberPrinter n = new NumberPrinter(i);
              Thread thread = new Thread(n);
              thread.start();

          }*/

        //ExecuterService
       /* ExecutorService executorService = Executors.newFixedThreadPool(10);

          for (int i=0; i<= 100; i++) {

               NumberPrinter num = new NumberPrinter(i);
               executorService.execute(num);
           }*/

        ExecutorService executorService1 = Executors.newFixedThreadPool(10);
          for (int i=1; i<= 100; i++) {

              if(i==10 || i==50 || i==98)
              {
                  System.out.println("Debug");
              }
              NumberPrinter num = new NumberPrinter(i);
              executorService1.execute(num);
          }

        executorService1.shutdown();
    }
}
