package MultiThreading.MerSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> listToSort = List.of( 4, 8, 5, 6, 2, 7, 1, 9, 3, 10);

        ExecutorService executorService = Executors.newCachedThreadPool();

        MergeSorter mergeSorter = new MergeSorter(listToSort,executorService);
       Future<List<Integer>> sortedList = executorService.submit(mergeSorter);


       List<Integer> sortedListResult = sortedList.get();
       executorService.shutdown();

        System.out.println(sortedListResult);
    }
}
