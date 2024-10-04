package org.example.fileoperation;


import java.util.logging.Logger;

public class FileDemo {
    static Logger logger = Logger.getLogger("FileDemo");
    static FileService fileService=new FileService();
    public static void main(String[] args) {

        boolean condition=true;
        while(condition){
            condition=fileService.menu();
        }


    }

}
