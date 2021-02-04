import java.net.InetAddress;
import java.net.NetworkInterface;

public class NetworkConnectivityTester {
       public static void main (String[] args){

           byte[] ipAddress = new byte[] {8,8,8,8};


           try {
               System.out.println("Computer Name: " + InetAddress.getLocalHost().getHostName());
               System.out.println("IP Address: " + InetAddress.getLocalHost().getHostAddress());
               System.out.println("Loopback address: " + InetAddress.getLoopbackAddress());


               //Check if google server is reachable or not.
               System.out.println("Connection Status: " + InetAddress.getByAddress("googleDnsServer", ipAddress).isReachable(50));

           } catch (Exception e) {

               System.out.println("Your connection seems to be lost.");
           }

           // Test connectivity and return results
           try {
               InetAddress[] addresses = InetAddress.getAllByName("www.google.com");

               for (InetAddress address : addresses) {
                   if (address.isReachable(1000)) {
                       System.out.println("Connected " + address);
                   }

               }
           } catch (Exception e) {
               System.out.println("\n\n***Failed to establish connection***");
           }

       }

       }





