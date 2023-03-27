package userinputnumber;

import java.util.Scanner;

/**2. -Read the numbers from the console entered by the user and print the minimum  and maximum number the user has entered.
 -Before the user enters the number, print the message Enter number:
 -If the user enters an invalid number, break out of the loop and print the minimum and maximum  number.
 Hint:
 -Use an endless while loop.
 -Create a class with the name MinAndMaxInputChallenge.
**/

 public class Programme2MinAndMaxInputChallenge {

    public static void main(String[] args)
    {
        //instance object
        Programme2MinAndMaxInputChallenge programme2MinAndMaxInputChallenge = new Programme2MinAndMaxInputChallenge();
        programme2MinAndMaxInputChallenge.minMax();
    }

    //instance method no return no parameter
    public void minMax()
    {
        int count = 0;
        int max = 0;
        int min = 0;
        boolean first = true;

        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);

        //while loop
        while(true)
        {
            System.out.println("Enter number :" );
            boolean num = scanner.hasNextInt();

            count += 1;
            if(num)
            {
                int sNum = scanner.nextInt();
                if(first)
                {
                    first = false;
                    min = sNum;
                    max = sNum;
                }
                if(sNum > max)
                {
                    max = sNum;
                }
                if (sNum < min)
                {
                    min = sNum;
                }
                if(count==5)
                {
                    break;
                }
            }
            else
            {
                System.out.println("Invalid number");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("The minimum number is : " + min);
        System.out.println("The maximum number is : " + max);

        //close scanner object
        scanner.close();
    }
}