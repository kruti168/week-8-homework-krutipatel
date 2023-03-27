package displaypattern;

import java.util.Scanner;

/**14. Write a program in Java to display the pattern like a diamond.
 While loop
 *
 ***
 *****
 *******
 *********
 ***********
 *************
 ***********
 *********
 *******
 *****
 ***
 **/
public class Programme14LikeDiamond {

    public static void main(String[] args) {
      Programme14LikeDiamond obj = new Programme14LikeDiamond();//calling object
      obj.diamond();

    }
    public void diamond(){ //instance method

        Scanner scanner = new Scanner(System.in); //calling scanner
        System.out.println("Enter Number :");
        int size = scanner.nextInt();

        System.out.print("Enter Symbol : ");

        char c = scanner.next().charAt(0);
        int i=1;
        int j;

        while(i<=size)  // while loop
        {
            j=1;
            while(j++<=size-i)

            {
                System.out.print(" ");

            }
            j=1;
            while(j++<=i*2-1)

            {
                System.out.print(c);

            }

            System.out.println();
            i++;
        }
        i=size-1;
        while(i>0)
        {
            j=1;
            while(j++<=size-i)

            {
                System.out.print(" ");

            }
            j=1;
            while(j++<=i*2-1)

            {
                System.out.print(c);

            }

            System.out.println();
            i--;
        }





        }
    }

