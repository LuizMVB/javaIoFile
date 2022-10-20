import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ObtainFileInfo {
    public static void main(String[] args){
        try {
            try (FileWriter writer = new FileWriter("obtainFileInfoTest.txt")) {
                writer.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesqu");
                writer.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesqu");
            }

            File myFileObj = new File("obtainFileInfoTest.txt");
            if(myFileObj.exists()){
                System.out.printf(
                        """
                                File name: %s
                                Absolute path: %s
                                Writeable: %s
                                Readable: %s
                                File size in bytes: %d
                        """,
                        myFileObj.getName(),
                        myFileObj.getAbsolutePath(),
                        myFileObj.canWrite(),
                        myFileObj.canRead(),
                        myFileObj.length()
                );
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
