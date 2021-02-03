import java.text.DecimalFormat;
import java.util.Scanner;


// To format numbers to print 2 decimal places I had to use %.2f and printf
public class SoftwareSales {

    public static void main (String[] args) {

       int packagesPurchased;

       double price = 99;


        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of packages purchased: ");

        packagesPurchased = scan.nextInt();

        price = price*packagesPurchased;

        if (packagesPurchased <= 9)
        {
            //printf and %.2f to format double decimal places
         System.out.printf("Your discount is: $%.2f\n", (price*0.00));
         System.out.printf("Your total is: $%.2f", price);

        }

        else if (packagesPurchased >= 10 && packagesPurchased <= 19)
        {

            System.out.printf("Your discount is: $%.2f\n", (price*0.20));
            System.out.printf("Your total is: $%.2f", (price - (price*0.20)));

        }

        else if (packagesPurchased >= 20 && packagesPurchased <= 49)
        {
            System.out.printf("Your discount is: $%.2f\n", (price*0.3));
            System.out.printf("Your total is: $%.2f\n", (price - (price*0.3)));

        }

        else if (packagesPurchased >= 50 && packagesPurchased <= 99)
        {
            System.out.printf("Your discount is: $%.2f\n", (price*0.4));
            System.out.printf("Your total is: $%.2f\n", (price - (price*0.4)));

        }

        else if (packagesPurchased >= 100)
        {
            System.out.printf("Your discount is: $%.2f\n", (price * 0.5));
            System.out.printf("Your total is: $%.2f\n", (price - (price * 0.5)));

        }


    }
}
