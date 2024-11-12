package Array;

import java.util.ArrayList;
import java.util.List;

public class Test extends Rectangle {


    public static void main(String[] args) {

        List<Integer> listToSort = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int middle = listToSort.size() / 2;

        List<Integer> leftList = listToSort.subList(0,middle);
        List<Integer> rightList = listToSort.subList(middle,listToSort.size());

        System.out.println(leftList);
        System.out.println(rightList);
    }
}
