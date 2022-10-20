import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("fileWriterTest.txt");
            writer.write("Hello world from inside .txt file");
            writer.close();
            System.out.println("I wrote my first file in Java");
        } catch (IOException e) {
            System.out.println("An error occurred with writer: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
