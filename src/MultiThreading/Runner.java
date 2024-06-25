package MultiThreading;

import java.util.Arrays;
import java.util.Objects;

public class Runner
{
    public static void main(String[] args) throws InterruptedException {
          /* Thread t1 = new Thread(new SimpleRunnable());

           Thread t2 = new Thread(new SimpleRunnable());
           // new state
        System.out.println("t1 State:- "+t1.getState());

        Thread.sleep(100);
        System.out.println(Thread.currentThread().getState());
        t1.start();  //runnable state from start method
        t2.start();
        System.out.println("t1 state:- "+t1.getState());
        System.out.println("t2 state:- "+t2.getState());
        */

          int[] number ={1,2,3,4,5,6,7,8,9,10};
          String[] words = {"apple","orange","Banana","Apple","APPle"};

        long count = Arrays.stream(words).filter(w -> w.equalsIgnoreCase("Apple")).count();

        System.out.println("apple count "+count);


          int sum= Arrays.stream(number).filter(num->num%2==0).sum();
        System.out.println("sum of even number "+sum);


        String an = new String("Apple");
        String ap = new String("Apple");
        System.out.println(an.equals(ap));
        System.out.println(an.hashCode()+"  "+ap.hashCode());

        Object o1 = new Object();
        Object o2 = o1;
        Object o3 = new Object();

        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
        System.out.println(o1.hashCode()+" "+o2.hashCode()+" "+o3.hashCode());


    }
}
