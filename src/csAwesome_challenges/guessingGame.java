package csAwesome_challenges;
import java.util.Scanner;

/*
This game takes a random number from 1 -> 100 and asks you to guess it
if you guess too high or too low, you get the hint and try again
if you guess correctly, you are given congrats and the game ends
 */
public class guessingGame {
  public static void main(String[] args)  {

      int num = (int) (Math.random()*100)+ 1;
      Scanner kb = new Scanner(System.in);
      System.out.println("Enter your guess for a number from 1 -> 100");
      int guess = kb.nextInt();

      while(guess != num){
          if(guess > num){
              System.out.println("Too high; Try again!");
          }else{
              System.out.println("Too low; Try again!");
          }
          guess = kb.nextInt();
      }
      System.out.println("Good job! The random number was: " + num);
  }
}
