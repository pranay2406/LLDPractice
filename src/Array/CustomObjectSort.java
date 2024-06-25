package Array;

import java.util.Arrays;

public class CustomObjectSort {


    public static void main(String[] args) {

        Employee[] A1 = new Employee[3];
        int[] Arr = {2,3,4,5,1,9};

        A1[0] = new Employee("Pranay", 28, 35000);
        A1[1] = new Employee("Vaibhav", 26, 36000);
        A1[2] = new Employee("Dileep", 26, 28000);
        Arrays.sort(A1);
        Arrays.sort(Arr);

        System.out.println(Arrays.toString(A1));
        System.out.println(Arrays.toString(Arr));
    }
}
