package DesignPattern.Singleton;

import lombok.Synchronized;

public class SingletonAdv {
    private static SingletonAdv instanceAdv;

    private SingletonAdv(){

    }
       public static SingletonAdv getObjectAdv()
       {
            if(instanceAdv == null)
            {
                synchronized (SingletonAdv.class)
                {
                    if(instanceAdv==null)
                    {
                        instanceAdv = new SingletonAdv();
                    }

                }

            }
        return instanceAdv;
       }

}
