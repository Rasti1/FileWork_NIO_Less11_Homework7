package project.controller;

import project.model.FileWriteService;
import project.model.ReadFileService;
import project.view.AppView;

public class AppController {

    public void runApp(){

        FileWriteService write = new FileWriteService();
        ReadFileService read = new ReadFileService();
        AppView view = new AppView();

        while(true){

            int choice = view.getChoice();

            switch (choice){

                case 1 -> {

                    String[] writeInfo = view.getWriteInfo();
                    view.getOutput(write.writeInFile(writeInfo[0], writeInfo[1]));

                }
                case 2 -> view.getOutput(read.readFromFile(view.getReadInfo()));
                case 0 -> {

                    view.getOutput("App closed.");
                    System.exit(0);

                }
                default -> view.getOutput("Invalid value. Try again.");
            }
        }
    }
}
