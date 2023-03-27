package displaypattern;

import java.util.Scanner;

/**8. Display right angle triangle of @ using nested for loops
        @
        @@
        @@@
        @@@@
        @@@@@ **/


public class Programme8RightAngle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int rows  = scanner.nextInt();

        Programme8RightAngle obj = new Programme8RightAngle();//calling  method
        obj.triangle(rows);
    }

    public void triangle(int rows) {  // instance method no return no parameter

        for (int i = 1; i <= rows ; i++) {// nested for loop


            for (int j = i; j >= 1; j--) {
                System.out.print("@");
            }
            System.out.println(" ");
        }

    }

}