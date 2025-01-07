package Java.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class findMax implements Comparable{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(30);
        list.add(24);
        list.add(5);

        Collections.sort(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        try
        {
            
        }
        finally {

        }

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
