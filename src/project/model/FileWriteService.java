package project.model;

import project.utils.Constants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class FileWriteService {

    public String writeInFile (String fileName, String content){
        Path filePath = Path.of(Constants.BASE_PATH + fileName + ".txt");
        try {
            Files.writeString(filePath, content, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
        } catch (IOException e) {
            return "> " + e.getMessage();
        }
        return "> Success!";
    }
}
