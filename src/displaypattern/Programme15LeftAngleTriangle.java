package displaypattern;

import java.util.Scanner;

/**15. Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * * **/
public class Programme15LeftAngleTriangle {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);// calling scanner
        System.out.println("Enter Number");
        int rows = scanner.nextInt();
        Programme15LeftAngleTriangle programme15LeftAngleTriangle = new Programme15LeftAngleTriangle();//calling method
        programme15LeftAngleTriangle.leftAngle(rows);
        scanner.close();//scanner close

    }

    public void leftAngle(int rows) {//instance method with perameter


        for (int i = 1; i <= rows; i++) {//nested for loops

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

}







