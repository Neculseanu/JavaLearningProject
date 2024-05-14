package com.tekwillacademy.filemanagementservice;

import java.io.File;

public class FileTaskExecution {

    public static void main(String[] args) {
        File fileObject01= new File("src/main/java/com/tekwillacademy/filemanagementservice/ fisier.txt");

        FilesManager.createTheFileIfDoesNotExist(fileObject01);
        FilesManager.informIfTheFileExist(fileObject01);
        System.out.println(FilesManager.createTheFileIfDoesNotExist(fileObject01));
        FilesManager.informIfTheFileExist(fileObject01);
        FilesManager.printTheFileName(fileObject01);
        FilesManager.printTheAbsolutPath(fileObject01);
        FilesManager.printIfTheFileIsDirectory(fileObject01);
        FilesManager.deleteTheFileIfExists(fileObject01);

        String path= "src/main/java/com/tekwillacademy/filemanagementservice/writedata.txt";
        OutputFilesWriterManager.writeDataIntoTheFilesUsingFileWriter(path, "Content 1");
        OutputFilesWriterManager.writeDataIntoTheFilesUsingFileWriter(path, "Content 2");
        OutputFilesWriterManager.writeDataIntoTheFilesUsingBufferWriter(path, "Content 3");


        InputFilesReadManager.printTheDataFromAFile(path);
        InputFilesReadManager.printDataFromAFileByUsingFileReader(path);


    }
}
