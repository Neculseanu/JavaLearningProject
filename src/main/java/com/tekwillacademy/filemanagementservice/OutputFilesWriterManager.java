package com.tekwillacademy.filemanagementservice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputFilesWriterManager {

    public static void writeDataIntoTheFilesUsingFileWriter(String filePath, String content)
    {
        FileWriter fileWriter= null;
        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            if(fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

    public static void writeDataIntoTheFilesUsingBufferWriter(String filePath, String content)
    {
        BufferedWriter bufferedWriter= null;
        FileWriter fileWriter= null;
        try {
            fileWriter = new FileWriter(filePath);
            bufferedWriter= new BufferedWriter(fileWriter);
            bufferedWriter.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            if(fileWriter!=null){
                try {
                    bufferedWriter.close();
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
