import java.util.Scanner;

public class DistanceTravelled {

    public static void main (String[] args) {

        int vehicleSpeed;
        int timeTravelled;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter vehicle speed (in mph): \n");
        vehicleSpeed = scan.nextInt();

             while (vehicleSpeed <0)
                {
                    System.out.print("Enter vehicle speed (in mph): \n");
                    vehicleSpeed = scan.nextInt();
                }

        System.out.print("Enter time travelled (in hrs): \n");
        timeTravelled = scan.nextInt();

            while (timeTravelled <1)
            {
                System.out.print("Enter time travelled (in hrs): \n");
                timeTravelled = scan.nextInt();
            }


        System.out.println("Hour\tDistance Travelled");

            for (int i = 1; i <= timeTravelled; i++){

            System.out.println(i + "\t\t" + (i*vehicleSpeed));

            }



    }
}
