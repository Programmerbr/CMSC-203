
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class FileLetterCounter {

   public static void main(String[] args) throws IOException {

       Scanner sc = new Scanner(System.in);
       System.out.print("Enter file path:");

       //This is the path to the file you want to read from
       String path = sc.nextLine();
       System.out.print(" Enter character to count:");

       char ch = sc.next().toUpperCase().charAt(0);

       //read all lines into a list
       List<String> lines = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
       int count = 0;
       for(String linestr:lines){
           for(char ch0:linestr.toCharArray()) {
               if(ch0 == ch)
                   count++;
           }
       }
       System.out.println(" The character " + "'"+ch+"'" + " appears in the file wc4 " + count +  " times.");
   }

   }
