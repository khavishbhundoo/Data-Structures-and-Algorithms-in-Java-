package even;

import java.util.Scanner;

/**
 * Write a short Java method, isEven, that takes an int i and returns true if
 * and only if i is even. Your method cannot use the multiplication, modulus, or
 * division operators, however.
 *
 * @author Khav
 */
public class Even {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer : ");
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.println("Wrong input! Please entern an integer : ");
        }
        int num = input.nextInt();
        System.out.println(isEven(num));
    }

    /**
     *
     * @param n integer
     * @return true if even ; else false
     */
    public static boolean isEven(int n) {
        return ((n & 1) == 0);
    }

}
