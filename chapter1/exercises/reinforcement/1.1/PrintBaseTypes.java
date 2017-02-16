package printbasetypes;

import java.util.Scanner;

/**
 * R-1.1 Write a short Java method, inputAllBaseTypes, that inputs a different
 * value of each base type from the standard input device and prints it back to
 * the standard output device.
 *
 * @author Khav
 */
public class PrintBaseTypes {

    public static void main(String[] args) {
        inputAllBaseTypes();
    }

    /**
     * Inputs a different value of each base type from the standard input device
     * Print each data back to standard output
     */
    public static void inputAllBaseTypes() {
        Scanner input = new Scanner(System.in);
        //byte
        System.out.print("Enter a byte : ");
        while (!input.hasNextByte()) {
            input.nextLine();
            System.out.println("Wrong input! Please enter a byte : ");
        }
        System.out.println("Success : " + input.nextByte());
        //short
        System.out.print("Enter a short: ");
        while (!input.hasNextShort()) {
            input.nextLine();
            System.out.println("Wrong input! Please enter a short : ");
        }
        System.out.println("Success : " + input.nextShort());

        //int
        System.out.print("Enter an integer : ");
        while (!input.hasNextInt()) {
            input.nextLine();
            System.out.println("Wrong input! Please enter an integer : ");
        }
        System.out.println("Success : " + input.nextInt());

        //float
        System.out.print("Enter a float : ");
        while (!input.hasNextFloat()) {
            input.nextLine();
            System.out.println("Wrong input! Please enter an float : ");
        }
        System.out.println("Success : " + input.nextFloat());

        //long
        System.out.print("Enter a long: ");
        while (!input.hasNextLong()) {
            input.nextLine();
            System.out.println("Wrong input! Please enter a long : ");
        }
        System.out.println("Success : " + input.nextLong());

        //double
        System.out.print("Enter a double: ");
        while (!input.hasNextDouble()) {
            input.nextLine();
            System.out.println("Wrong input! Please enter a double : ");
        }
        System.out.println("Success : " + input.nextDouble());

        //boolean
        System.out.print("Enter a boolean: ");
        while (!input.hasNextBoolean()) {
            input.nextLine();
            System.out.println("Wrong input! Please enter a boolean : ");
        }
        System.out.println("Success : " + input.nextBoolean());
        //char
        //nextChat don't exist
        System.out.print("Enter a char: ");
        char c = input.next().charAt(0);
        System.out.println("Success : " + c);
    }
}
