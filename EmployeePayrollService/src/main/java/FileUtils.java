import java.io.File;

public class FileUtils {
    public static boolean deleteFiles(File contentsToDelete) {

        File[] allContents = contentsToDelete.listFiles();
        /***
         * taking if else condition check all contents in a file should be not null if
         * not null then it will enter the for each loop and delete that file
         */
        if (allContents != null) {
            for (File file : allContents) {
                deleteFiles(file);
            }
        }
        return contentsToDelete.delete();
    }
}
