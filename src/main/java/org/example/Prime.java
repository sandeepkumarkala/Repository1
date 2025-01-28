package org.example;

import java.util.Scanner;

public class Prime {
    static boolean chk = false;

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Input your number to be checked and press Enter.");
        int z = num.nextInt();
        System.out.println("Your input is :" + z);
        if (checkPrime(z)) {
            System.out.println("Number is prime.");
        } else {
            System.out.println("Number is not prime.");
        }
    }

    public static boolean checkPrime(int n) {

        if (n < 1) {
            System.out.println("Invalid Number");
System.exit(0);
        } else if (n == 1) {
            return true;
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                int j = n % i;
                if (j == 0) {
                    return false;
                }
                chk = true;
            }
        }
        return chk;
    }
}
