import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            String pathname = "createFileTest.txt";
            File myFileObj = new File(pathname);

            if(myFileObj.exists()){
                myFileObj.delete();
            }

            if(myFileObj.createNewFile()){
                System.out.println("A new file was created and it's " +
                        "name is " + myFileObj.getName());

            } else {
                System.out.println("Tried to, but can't create file to " +
                        "following pathname: " + pathname + "\n verify if " +
                        "this file already exists");
            }
        } catch (IOException e) {
            System.out.println("IO error occurred: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}