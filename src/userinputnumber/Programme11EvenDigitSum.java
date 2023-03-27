package userinputnumber;

import java.util.Scanner;

/**11. Even Digit Sum
 Write a method named getEvenDigitSum with one parameter of type int called number.
 The method should return the sum of the even digits within the number.
 If the number is negative, the method should return -1 to indicate an invalid value.  EXAMPLE INPUT/OUTPUT:
 * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * getEvenDigitSum(-22); → should return -1 since the number is negative
 NOTE: The method getEvenDigitSum should be defined as public static  **/

 public class Programme11EvenDigitSum {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);//calling scanner
            System.out.println("Enter Number");
            int n1 = scanner.nextInt();


            System.out.println(getEvenDigitSum(n1));
            scanner.close();//scanner close

        }

        public static int  getEvenDigitSum(int n1) {//static method with parameter
            int digit;
            int sum = 0;

            //if and while loop
            if (n1 >= 0){
                while (n1 > 0) {


                    digit = n1 % 10;
                    if (digit % 2 == 0) {
                        sum = sum + digit;
                    }
                        n1 /= 10;

                } if (n1 >= 0){
                System.out.println("The sum of even digit number is :");
            }return sum;

            }
            System.out.println("invalid input");
             return -1;

    }

}



