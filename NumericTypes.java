import java.util.Scanner;

/**
 This program demonstrates how numeric types and operators behave in Java
 */
public class NumericTypes {
    public static void main (String[] args) {
        //TASK #2 Create a Scanner object here
        //identifier declarations
        double NUMBER = 2; // number of scores
        int score1; // first test score
        int score2; // second test score
        int BOILING_IN_F = 212; // boiling temperature
        int fToC; // temperature in Celsius
        double average; // arithmetic average
        String output; // line of output to print out

        //scanner object
        Scanner scan = new Scanner(System.in);

        // ask for user's name
        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        //Request first score
        System.out.print("Enter the first score: ");
        score1 = scan.nextInt();

        //Request second score
        System.out.print("Enter the second score: ");
        score2 = scan.nextInt();

        // Find an arithmetic average
        average = (score1 + score2) / NUMBER;
        output = score1 + " and " + score2 + " have an average of " + average;
        System.out.println(output);

        // Convert Fahrenheit temperatures to Celsius
        fToC = ((BOILING_IN_F-32)*5)/9;
        output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
        System.out.println(output + "\n\n");

        // Prompt the user to enter another temperature in Fahrenheit after the original temperature conversion is printed out.
        System.out.print("Enter another temperature in fahrenheit: ");
        BOILING_IN_F = scan.nextInt();

        // Override
        fToC = ((BOILING_IN_F-32)*5)/9;
        output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";

        System.out.println(output);

        System.out.println("\n\nGoodbye"); // to show that the program is ended
    }
}
