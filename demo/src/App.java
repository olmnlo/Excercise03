import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Write a program that prints the numbers from 1 to 100 such that:
        // If the number is a multiple of 3, you need to print "Fizz" instead of that
        // number 
        // If the number is a multiple of 5, you need to print "Buzz" instead of that
        // number.
        // If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
        // // instead of that number.

         for (int i = 1; i <= 100; i++) {
             if (i%3 == 0 && i%5 ==0){
                 System.out.println("FizzBuzz");
             }
             else if (i%3 == 0){
                 System.out.println("Fizz");
             }else if(i%5 == 0){
                 System.out.println("Buzz");
             }
         }


         // Write a Java program to reverse a string.
         // Test Data: Input a string: The quick brown fox Expected Output: Reverse
         // string: xof nworb kciuq ehT

         Scanner scn = new Scanner(System.in);
         System.out.print("Enter sentence: ");
         String sentence = scn.nextLine();

         for (int i = sentence.length()-1; i >=0; i--) {
             System.out.print(sentence.charAt(i));
         }
         System.out.println("");


         /*
          * 3.Write a program to find the factorial value of any number entered
          * through the keyboard.
          */
         System.out.print("Enter number to find factorial: ");
         int num = scn.nextInt();
         int total = 1;
         for (int i = 1; i <= num; i++) {
             total *= i;
          }
          System.out.println("The factorial of number: "+ num +" is "+ total);
        

          /*
         * 4.Two numbers are entered through the keyboard. Write a program to find
         * the value of one number raised to the power of another. (Do not use Java
         * built-in method)
         */
         System.out.print("Enter number: ");
         int base = scn.nextInt();
         int result = 1;
         System.out.print("\nEnter the power: ");
         int power = scn.nextInt();
        
         for (int i = 0; i < power; i++) {
           result *= base;
         }
         System.out.println("The number " + base + " to the power of " + power + " is: " + result);
         /*
          * 5.Write a program that reads a set of integers, and then prints the sum of
          * the even and odd integers.
          */
         int even_total = 0;
         int odd_total = 0;
         do {
          System.out.println("Enter number or enter 0 to print and quit");
          num = scn.nextInt();
          if (num%2 == 0){
              even_total += num;
          }else {
              odd_total += num;
          }
         }while(num!=0);
         System.out.println("The total of even numbers is: "+ even_total);
         System.out.println("The total of odd numbers is: "+ odd_total);
         /*Write a program that prompts the user to input a positive integer. It
          should then output a message indicating whether the number is a prime
          number.
          */
        int number;
        do{
        System.out.println("if you want to quit enter negative number");
        System.out.println("Enter positive number: ");
        number = scn.nextInt();
        boolean is_prime = true;
        for (int i = 2; i < number; i++) {
            if (number %i == 0){
                is_prime = false;
                break;
            }else{
                continue;
            }
        }
        if(number >= 0){
        if (is_prime && number >= 2){
            System.out.println("the number: "+ number +" is prime");
        }else{
            System.out.println("the number: "+ number +" is not prime");
        }
    }else{
        System.out.println("Thank you for using prime checker");
    }
        }while(number >= 0);


        // /*
        //  * 7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
        // another for loop to print the days (Days 1 -7) for each week.
        //  */
         for (int i = 1; i <= 4; i++) {
             System.out.println("Week "+ i);
             for (int j = 1; j <= 7; j++) {
                 System.out.println("day "+j);
             }
         }



        // /*
        //  * 8.Write a program thats check if the word is a palindrome or not. hint: A
        // string is said to be a palindrome if it is the same if we start reading it from
        // left to right or right to left.
        //  */

         System.out.print("Enter word: ");
         String word = scn.next();
         // shorter solution:
         //  StringBuilder reversed_word = new StringBuilder(word);
         //  if (word.equalsIgnoreCase(reversed_word.toString())){
         //     System.out.println("it is palindrome");
         //  }else{
         //     System.out.println("it is not palindrome");
         String reversed_word = "";
         for (int i = word.length()-1; i >= 0; i--) {
             reversed_word+=word.charAt(i);
         }
         if (word.equalsIgnoreCase(reversed_word)){
              System.out.println("it is palindrome");
         }else{
             System.out.println("it is not palindrome");
         }

         scn.close();


    }
}
