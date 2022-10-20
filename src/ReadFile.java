import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("readFileTest.txt");
            writer.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
            writer.close();

            File myFileObj = new File("readFileTest.txt");
            Scanner reader = new Scanner(myFileObj);

            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Something goes wrong with our Scanner: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Something goes wrong with our writer: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
