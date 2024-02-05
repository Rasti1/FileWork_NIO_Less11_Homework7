package project.model;

import project.utils.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFileService {

    public String readFromFile(String fName) {

        Path filePath = Path.of(Constants.BASE_PATH + fName + ".txt");

        try {
            return Files.readString(filePath);
        } catch (IOException e) {
            return "\n There's no files with this name. " + e.getMessage();
        }
    }
}
