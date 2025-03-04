package org.example;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author muhammad.khadafi
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to calculate its factorial: ");
        int factorialNumber = scanner.nextInt();

        System.out.print("Enter the size of the string to be generated: ");
        int stringSize = scanner.nextInt();

        BigInteger factorialResult = factorial(factorialNumber);
        System.out.println("The factorial of " + factorialNumber + " is: " + factorialResult);

        String largeString = generateLargeString(stringSize);
        System.out.println("Generated string: " + largeString);
    }

    private static BigInteger factorial(int n) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return (n <= 1) ? BigInteger.ONE : BigInteger.valueOf(n).multiply(factorial(n - 1));
    }

    private static String generateLargeString(int size) {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += "a";
        }
        return result;
    }
}
