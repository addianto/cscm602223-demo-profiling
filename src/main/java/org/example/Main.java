package org.example;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author muhammad.khadafi
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka untuk dihitung faktorialnya: ");
        int factorialNumber = scanner.nextInt();

        System.out.print("Masukkan ukuran string yang akan dibuat: ");
        int stringSize = scanner.nextInt();

        BigInteger factorialResult = factorial(factorialNumber);
        System.out.println("Faktorial dari " + factorialNumber + " adalah: " + factorialResult);

        String largeString = generateLargeString(stringSize);
        System.out.println("String yang dihasilkan: " + largeString);
    }

//    private static BigInteger factorial(int n) {
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
//        return (n <= 1) ? BigInteger.ONE : BigInteger.valueOf(n).multiply(factorial(n - 1));
//    }

    private static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }


//    private static String generateLargeString(int size) {
//        String result = "";
//        for (int i = 0; i < size; i++) {
//            result += "a";
//        }
//        return result;
//    }

    private static String generateLargeString(int size) {
        StringBuilder builder = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            builder.append("a");
        }
        return builder.toString();
    }

}
