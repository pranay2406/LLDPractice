package Java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.IntUnaryOperator;

public class Stream {

    public static void main(String[] args) {
          int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
          Arrays.stream(arr).filter(x -> x%2 ==1).forEach(x -> System.out.print(x+" "));
        System.out.println("-------------------");

        Arrays.stream(arr).filter(x-> x % 2 == 0).map(x -> x*x).forEach(x -> System.out.print(x+" "));

        List<Integer> list = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        System.out.println("====================");

        List<Integer> addNumber = list.stream().filter(x -> x%2 == 1).toList();
        System.out.println(addNumber);

           int[] arr2 = {0,-2,-2,5,5,5};

           Map<Integer,Integer> map = new HashMap<>();
             for (int i = 0; i < arr2.length; i++) {
                 if(!map.containsKey(arr2[i])){
                     map.put(arr2[i],1);
                 }
                 else {
                     map.put(arr2[i],map.getOrDefault(arr2[i],0)+1);
                 }
             }
        System.out.println(map);
              int maxcount = 0;
             int maxCountNumber = arr2[0];

             for(Integer integer : map.values()){
                 if(integer > maxcount)
                 {
                     maxcount = integer;
                 }
             }
        System.out.println(maxcount);

    }
}
