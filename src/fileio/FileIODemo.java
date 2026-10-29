package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * Module 11: reading and writing text files with java.nio.file.
 */
public class FileIODemo {

    public static void main(String[] args) {
        try {
            Path file = Files.createTempFile("java-course-", ".txt");
            try {
                Files.writeString(file, "Java file I/O\nSecond line\n");
                System.out.println("Wrote: " + file.toAbsolutePath());

                List<String> lines = Files.readAllLines(file);
                System.out.println("Lines:");
                for (String line : lines) {
                    System.out.println("  " + line);
                }

                Files.writeString(file, "Appended line\n", StandardOpenOption.APPEND);
                System.out.println("File size: " + Files.size(file) + " bytes");
            } finally {
                Files.deleteIfExists(file);
                System.out.println("Temporary file deleted.");
            }
        } catch (IOException exception) {
            System.err.println("File operation failed: " + exception.getMessage());
        }
    }
}
