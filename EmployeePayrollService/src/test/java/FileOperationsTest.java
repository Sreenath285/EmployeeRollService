import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

import static org.junit.Assert.assertTrue;

public class FileOperationsTest {

    private static String HOME = "C:\\Users\\sreen";
    private static String PLAY_WITH_NIO = "TempPlayGround";

    @Test
    public void givenPathWhenCheckedThenConfirm() throws IOException {
        // check file exists or not
        Path homePath = Paths.get(HOME);
        assertTrue(Files.exists(homePath));
        System.out.println(homePath);

        // delete file and check file does not exist
        Path playPath = Paths.get(HOME + "/" + PLAY_WITH_NIO);
        if (Files.exists(playPath)) {
            FileUtils.deleteFiles(playPath.toFile());
        }
        assertTrue(Files.notExists(playPath));

        // create a directory
        Files.createDirectory(playPath);
        assertTrue(Files.exists(playPath));

        // create Empty File
        IntStream.range(1, 10).forEach(counter -> {
            Path tempFile = Paths.get(playPath + "/temp" + counter);
            assertTrue(Files.notExists(tempFile));
            try {
                Files.createFile(tempFile);
            } catch (IOException e) {
            }
            assertTrue(Files.exists(tempFile));
        });

        // List files, directories as well as files with extensions
        System.out.println("Files.list");
        Files.list(playPath).filter(Files::isRegularFile).forEach(System.out::println);
        System.out.println("Files.newDirectory");
        Files.newDirectoryStream(playPath).forEach(System.out::println);
        System.out.println("Files.newDirectory with temp");
        Files.newDirectoryStream(playPath, path -> path.toFile().isFile() && path.toString().contains("temp"))
                .forEach(System.out::println);
    }
}
