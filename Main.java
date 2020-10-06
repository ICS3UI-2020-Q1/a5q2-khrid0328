import java.util.Scanner;
/**
 * This program prints the numbers from 1 to a number the user inputs on a single line with commas in between them
 * @author Dafna Khripun
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    // create scanner for user inputs
    Scanner input = new Scanner(System.in);

    // ask the user to enter a positive integer
    System.out.println("Please enter a positive integer");

    // create a variable for user input
    int integer = input.nextInt();

    // use a for loop to print all numbers from one to integer on a single line
    for(int i = 1; i < integer; i++){
      
      // loop action: print the number
      System.out.print(i + ", " );
    }
    System.out.print(integer);
  }
}
