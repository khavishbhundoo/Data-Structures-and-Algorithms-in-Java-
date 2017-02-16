package sumodd;

import java.util.Scanner;

/**
 * Write a short Java method that takes an integer n and returns the sum of all
 * the odd positive integers less than or equal to n.
 *
 * @author Khav
 */
public class SumOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.println("Wrong input! Enter a positive integer : ");
        }
        int sum = getSumOdd(input.nextInt());
        if (sum != -1) {
            System.out.println("Sum = " + sum);
        }
    }

    /**
     *
     * @param n positive integer
     * @return sum of all the odd positive integers less than or equal to n.
     */
    public static int getSumOdd(int n) {
        if (n == 1) {
            return n;
        }
        if (n < 1 || n == 0) {
            System.out.println("Wrong input! Number should be positive");
            return -1;
        }
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

}
