import java.util.Scanner;
import java.io.FileReader;

public class ReadingTextFiles {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter name of textfile to read: ");
        String filename = kb.nextLine();
        
        try 
        {
            Scanner inputFile = new Scanner(new FileReader(filename)); 
            while ( inputFile.hasNextInt() )
            {
                int value = inputFile.nextInt();
                System.out.println(value);
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
