package org.example.fileoperation;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.logging.Logger;

public class FileService {

    static File file=new File("myFile.txt");
    static Logger logger = Logger.getLogger("FileService");
    static Scanner scanner=new Scanner(System.in);

    public boolean menu(){

        logger.info("1.Create\n2.Write\n3.Read\n4.Update\n5.Delete\n6.Quit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> createFile();
            case 2 -> writeIntoFile();
            case 3 -> readFromFile();
            case 4 -> updateTheFile();
            case 5 -> {
                try {
                    deleteFile();
                } catch (IOException e) {
                    logger.info("Cannot delete the file "+e);
                }
            }
            case 6 -> {
                scanner.close();
                return false;
            }
            default -> logger.warning("Wrong Option! Please try Again");
        }
        return true;

    }
    public void createFile(){
        try{
            if(file.createNewFile()){
               logger.info("File created: "+file.getName());
            }
            else {
                logger.info("File Already exists.");
            }
        } catch (IOException e) {
           logger.info("An error has occurred.");
            throw new IllegalArgumentException(e);
        }
    }
    public void writeIntoFile(){
        logger.info("Enter the content to write to the file: ");
        scanner.nextLine();
        String input=scanner.nextLine();
       try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
           bufferedWriter.write(input);
           logger.info("Successfully wrote to the file.");
       } catch (IOException e) {
           logger.info("An error occurred while writing to the file.");
           throw new IllegalArgumentException(e);
       }
    }

    public void readFromFile(){
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(file))) {
            String line;
            while((line=bufferedReader.readLine())!=null){
                logger.info(line);
            }
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public void updateTheFile(){
        logger.info("Enter the content to append to file: ");
        scanner.nextLine();
        String content=scanner.nextLine();
        try(FileWriter fileWriter=new FileWriter(file,true)) {
            fileWriter.write(" "+content);
            logger.info("Content SSuccessfully updated");
        } catch (IOException e) {
            throw new IllegalArgumentException(e);
        }

    }

    public void deleteFile() throws IOException {
        Files.delete(file.toPath());
        logger.info("File Deleted");
    }
}
