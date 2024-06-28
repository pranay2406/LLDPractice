package DesignPattern.Singleton;

import java.awt.event.WindowStateListener;
import java.security.PrivateKey;

public class Singleton {
       private static Singleton instanse;

       private  Singleton()
       {

       }
       public static Singleton getObject()
       {
            if(instanse == null)
            {
                instanse= new Singleton();
            }
            return instanse;
       }
}
