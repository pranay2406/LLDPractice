package MultiThreading.ProducerConsumer;

import java.util.Queue;

public class Consumer implements Runnable{

     private Queue<Object> store;
     private int number;
     private String name;

     public Consumer(Queue<Object> store, int number,String name) {
         this.store = store;
         this.number = number;
         this.name = name;
     }

    @Override
    public void run() {
            while(true)
            {
                if(!store.isEmpty())
                {
                    System.out.println(this.name+" is producing the item "+store.size());
                    store.remove();
                }
            }
    }
}
