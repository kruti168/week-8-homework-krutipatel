package displaypattern;

import java.util.Scanner;

/**9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)**/
public class Programme9FibonacciNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //calling scanner
        System.out.println("Enter Number :");
        int size = scanner.nextInt();
        fibonacciNumber(size);// calling method
        scanner.close();//scanner close


    }

    public static void fibonacciNumber(int size) {//static method with parameter
       int  firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= size; ++i) {// for loop
            System.out.println(firstTerm );

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }
}