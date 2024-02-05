package project.view;


import java.util.Scanner;

public class AppView {

    Scanner scanner;

    public int getChoice(){

        scanner = new Scanner(System.in);


        System.out.println("""
               What do you want to do:
               1 - Create and Write in;
               2 - Read from;
               0 - Exit.""");
        System.out.print("\nInput: ");

        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;

    }

    public String[] getWriteInfo(){

        System.out.print("\nEnter file's name (without extension): ");
        String fileName = scanner.nextLine();
        System.out.print("\nEnter file's content: ");
        String content = scanner.nextLine();
        return new String[]{fileName, content};

    }

    public String getReadInfo(){

        scanner = new Scanner (System.in);
        System.out.print("\nEnter file's name: ");
        return scanner.nextLine();

    }

    public String displayFileContent(String content) {

        System.out.println("Text in file: ");
        return content;

    }

    public void getOutput(String output){

        System.out.println(output);

    }
}
