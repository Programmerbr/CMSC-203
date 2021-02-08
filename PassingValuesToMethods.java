public class PassingValuesToMethods {

    public static void main (String[] args)
    {
        MilesconvertToKm(1);
        MilesconvertToKm(10);
        MilesconvertToKm(100);

    }

    public static void MilesconvertToKm(double kilometer)
    {
        System.out.println(kilometer + " Km is " + kilometer*1.6 + " miles");
    }

}
