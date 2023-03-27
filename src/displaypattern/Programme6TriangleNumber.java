package displaypattern;

import java.util.Scanner;

/**6. Write a program in Java to display the pattern like a triangle with a number.
 For eg.
 Input number of rows: 10
 Expected Output:
 1
 12
 123
 1234
 12345
 123456
 1234567
 12345678
 123456789
 12345678910**/
public class Programme6TriangleNumber {

    public static void main(String[] args) {
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);//scanner close
        int n = in.nextInt();
        triangle(n);//call static method
        in.close();//scanner close
    }
    public static void triangle (int n){ //static method
        int i;
        int j;
           for (i = 1; i <= n; i++) {//nested for loop
            for (j = 1; j <= i; j++)
                System.out.print(j);

            System.out.println("");
        }
    }
}
