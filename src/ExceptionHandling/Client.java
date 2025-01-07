package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3;
            num3 = num1 / num2;
        } catch (NullPointerException e) {
            System.err.println("Num pointer error");
        } catch (ArithmeticException e) {
            System.err.println("Arithmetic error");
        } catch (InputMismatchException e) {
            System.err.println("Input is wrong please check again");
        } catch (Exception e) {
            System.err.println("Exception error");
        } finally {
            System.out.println("finally block");
        }
        System.out.println("after finally block");

    }
}
