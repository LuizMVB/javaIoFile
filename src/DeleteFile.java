import java.io.File;

public class DeleteFile {
    public static void main(String[] args){
        File fileObj = new File("deleteTest.txt");
        if(fileObj.delete()){
            System.out.printf("Delete the file: " + fileObj.getName());
        } else {
            System.out.print("Failed to delete the file.");
        }
    }
}
