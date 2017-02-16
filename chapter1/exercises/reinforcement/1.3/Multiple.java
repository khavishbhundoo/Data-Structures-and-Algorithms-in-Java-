package multiple;

import java.util.Scanner;

/**
 * Write a short Java method, isMultiple, that takes two long values, n and m,
 * and returns true if and only if n is a multiple of m, that is, n = mi for
 * some integer i.
 *
 * @author Khav
 */
public class Multiple {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a long (n) : ");
        while (!input.hasNextLong()) {
            input.nextLine();
            System.out.println("Wrong input ! Please enter a long(n) : ");
        }
        long n = input.nextLong();
        System.out.print("Enter a long (m) : ");
        while (!input.hasNextLong()) {
            input.nextLine();
            System.out.println("Wrong input ! Please enter a long(m) : ");
        }
        long m = input.nextLong();

        System.out.println(isMultiple(n, m));
    }

    /**
     *
     * @param n long integer
     * @param m long integer
     * @return true if n is a multiple of m, that is, n = mi for some integer i
     */
    public static boolean isMultiple(long n, long m) {
        return n % m == 0;
    }

}
