package userinputnumber;

import java.util.Scanner;




    /**
     * 5. Palindrome Number
     * Write a method called isPalindrome with one int parameter called number.
     * The method needs to return a boolean.
     * It should return true if the number is a palindrome number otherwise it should return false.
     * Check the tips below for more info about palindromes.
     * Example Input/Output
     * isPalindrome(-1221); → should return true
     * isPalindrome(707); → should return true
     * isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
     * 11212.
     */
    public class Programme5PalindromeNumber {

        public static void main(String[] args)
        {

            //Scanner declaration for reading input form console
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter any number : ");
            int number = scanner.nextInt();

            //create static object with condition
            if(isPalindrome(number))
            {
                System.out.println("Number : " + number + " is palindrome");
            }
            else
            {
                System.out.println("Number : " + number + " is not palindrome");
            }

            //closing the scanner object
            scanner.close();
        }

        //static method with return with parameter
        public static boolean isPalindrome(int number)
        {
            int reverse = 0;
            int remainder;
            int lastDigit = number;

            //while loop
            while(lastDigit != 0 )
            {
                remainder = lastDigit % 10;
                reverse = reverse * 10 + remainder;
                lastDigit = lastDigit / 10;
            }
            //if condition
            if (number == reverse)
            {
                return true;
            }
            return false;
        }
    }





