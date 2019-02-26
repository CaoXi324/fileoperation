import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class TestFileOperation {
    public static void main(String[] args) throws IOException {

        /*创建文件夹*/
        File fileDir = new File("./src/file_operation/files/");
        fileDir.mkdir();
        File fileDir2=new File("./src/file_operation2/");
        fileDir2.mkdir();

        /*创建文件*/
        File txtFile=new File("./src/file_operation3/hi.txt");
        txtFile.createNewFile();
        System.out.println(txtFile.getName());

        /*重命名文件*/
        boolean isRename=fileDir2.renameTo(new File("./src/file_operation3"));
        System.out.println(isRename ? "Rename file successfully!" : "Rename file failed");

        /*创建文件*/
        File logFile = new File("./src/file_operation/files/error.log");
        File txFile=new File("./src/file_operation/files/hello.txt");
        txFile.createNewFile();
        Boolean isCreateSuccess = logFile.createNewFile();
        System.out.print(isCreateSuccess ? "Create file successfully!" : "Create file failed");

        /*获取文件夹内的文件*/
        String[] fileList=fileDir.list();
        for(int i=0; i<fileList.length;i++) {
            System.out.println(fileList[i]); //error.log;hello.txt
        }



        /*删除文件、文件夹*/
        File delFile=new File("file_operation3");

        Boolean isDeleteSuccess = delFile.delete();
        System.out.println(isDeleteSuccess? "Delete file successfully" : "Delete file failed");
    }
}
