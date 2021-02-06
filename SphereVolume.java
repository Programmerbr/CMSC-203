import java.util.Scanner;

public class SphereVolume {
    public static void main (String[] args){

        /* Pseudo-code for SphereVolume.java:


                Calculate volume of the sphere using the formula (see Task #3b)
        V=4/3 πr^3
        Print the volume
                 */
    double diameterOfaSphere;
    double radius;
    double sphereVolume;

        Scanner scan = new Scanner (System.in);

            //Print the purpose of the program
            System.out.println("*** Sphere Volume calculator *** ");

            //Print a prompt asking for the diameter of a sphere
            System.out.print("Type the diameter of a sphere: ");

                //Read the diameter
                diameterOfaSphere = scan.nextDouble();

                //Calculate the radius as diameter divided by 2
                radius = (diameterOfaSphere/2);

                //Calculate volume of the sphere using the formula V=4/3 πr^3
                // Math.Pi for pie calculation and Math.pow for radius to the power of 3
                sphereVolume = ((4.0/3.0)*Math.PI)*(Math.pow(radius, 3));

System.out.println(radius);
System.out.printf("The sphere's volume is: %.9f", sphereVolume);



    }
}
