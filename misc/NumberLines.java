import java.io.File;
import java.util.Scanner;

public class NumberLines {

    public static void main(String[] args) {

        try {
            System.out.print("Enter the file name with extension : ");
            // first create a scanner to read from the console, System.in
            Scanner console = new Scanner(System.in);
            File filename = new File(console.nextLine());

            // next create a scanner to read from the file
            Scanner fileScanner = new Scanner(filename);

            // now read the entire file and print it with line numbers:
            int counter=1;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.printf("%5d: %s%n",counter++,line);
            }
            fileScanner.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
