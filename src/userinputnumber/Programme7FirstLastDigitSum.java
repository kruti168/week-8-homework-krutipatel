package userinputnumber;

import java.util.Scanner;

/**
 * 7. First And Last Digit Sum
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value
 */

public class Programme7FirstLastDigitSum {
    public static void main(String[] args)
    {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number :");
        int n1 = scanner.nextInt();

        Programme7FirstLastDigitSum programme7FirstLastDigitSum = new Programme7FirstLastDigitSum();
        int result = programme7FirstLastDigitSum.sumFirstAndLastDigit(n1);
        System.out.println("The sum of the first and last digit number is  " +result);

        //create static method object
        scanner.close();

    }

    //instance method with return with parameter
    public int sumFirstAndLastDigit(int number)
    {
        //if condition
        if (number < 0)
        {
            return -1;
        }
        int lastNumber = number % 10;
        int firstNumber = number;

        //while loop
        while (firstNumber >= 10)
        {
            firstNumber = firstNumber / 10;
        }

        int result;
        result = firstNumber + lastNumber;
        return result;
    }

}
