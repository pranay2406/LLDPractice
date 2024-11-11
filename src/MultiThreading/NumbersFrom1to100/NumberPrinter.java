package MultiThreading.NumbersFrom1to100;

public class NumberPrinter implements Runnable {
     private int numberToPrint;

    public NumberPrinter(int number) {
        this.numberToPrint=number;
    }

    @Override
    public void run() {
        System.out.println(numberToPrint+" Printed by "+Thread.currentThread().getName());

    }
}
