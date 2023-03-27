package userinputnumber;

import java.util.Scanner;

/**3. Write a Java program that takes the user to provide a single character from the
* alphabet. Print Vowel of Consonant, depending on the user input. If the user input
* Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
* error message.
* For eg:
* Input an alphabet: p
*Expected Output:
* Input letter is Consonant**/
public class Programme3Consonant {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// calling scanner
        System.out.println("Input an Alphabet :");
        char ch = scanner.next().charAt(0);
        Programme3Consonant programme3Consonant = new Programme3Consonant();// creating object
        programme3Consonant.findVowel(ch);
        scanner.close();
    }
    public void findVowel(char ch){

         //if else statement
   if (ch== 'a' || ch=='e'  || ch=='i' || ch== 'o' ||ch == 'u'||ch=='A'||ch =='E'||ch =='I'||ch=='O'||ch=='U'){

       System.out.println("Input letter  : " + ch + " is Vowel");
        }else if ((ch >='a' && ch <= 'z') || (ch >='A' && ch <='Z')){

       System.out.println("Input letter : " + ch +  "  is consonant");
   }else {
       System.out.println("Not an alphabet");
   }
    }







}
