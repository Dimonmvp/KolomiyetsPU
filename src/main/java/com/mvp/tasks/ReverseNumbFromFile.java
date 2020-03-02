package com.mvp.tasks;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReverseNumbFromFile {
    public static StringBuilder numb = new StringBuilder();
    public static File file = new File
            ("./file/");

    public ReverseNumbFromFile(){
        if (!file.exists())
        {
            file.mkdir();
        }
    }
    public static void createFile(String nameOfFile){
        file=new File(file.getName()+"/"+nameOfFile+".txt");
        try {
            if (!file.exists())
            {
                file.createNewFile();
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

    }
    public static void writeToFile(String string)
    {
        try(FileWriter fileWriter = new FileWriter(file,false))
        {
            fileWriter.write(string);
            fileWriter.flush();
        }catch (IOException e)
        {
            System.out.println(e);
        }
    }
    public static void readToFile()
    {
        try(FileReader fileReader = new FileReader(file)) {
            Scanner scanner = new Scanner(fileReader);
            numb.append(scanner.nextLine());
            numb.append(1+(int)(Math.random()*10));
            numb.reverse();
        }
        catch (IOException e)
        {
            System.out.println();
        }

    }

    public static StringBuilder getNumb() {
        return numb;
    }

    public static void setNumb(StringBuilder numb) {
        ReverseNumbFromFile.numb = numb;
    }
}
