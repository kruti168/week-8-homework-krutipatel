package userinputnumber;

import java.util.Scanner;

/**12. Write a programme to input any number and check if it is prime or not.
 (Prime number is a number that is greater than 1 and divided by 1 or itself only.
 In other words,  prime numbers can't be divided by other numbers than itself or
 1. For example 2, 3, 5, 7, 11, 13,  17.... are the prime numbers.)**/
public class Programme12PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//scanner calling
        System.out.println("Enter any Number");
        int n = scanner.nextInt();
        primeNumber(n);//calling static method
    }

//Instance method with parameter
    public static void primeNumber(int n){
        int count = 0;
        for (int i = 2; i <= n/2; ++i){// for loop

            if(n % i == 0){
                 count ++;
                 break;
            }
        }
        if (count == 0 && n != 1){// if else

            System.out.println(n + " is a prime number .");
        }else {
            System.out.println(n + "is not Prime number .");
        }

    }
}
