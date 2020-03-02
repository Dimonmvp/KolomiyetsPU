package com.mvp.tasks;

import java.io.File;
import java.io.IOException;

import static com.mvp.tasks.QuickSort.*;

public class Start {
    public static void main(String[] args) {
//        setArrayLength(10);
//        setSupportingElement(3);
//        initArray();
//        printArray();
//        quickSort();
//        printArray();
//        System.out.println("CountOfChanger:"+getCountOfChanger());
//        System.out.println("CountOfRecursion:"+getCountOfRecursion());
        ReverseNumbFromFile reverseNumbFromFile = new ReverseNumbFromFile();
        ReverseNumbFromFile.createFile("test");
        ReverseNumbFromFile.writeToFile("qwerty");
        ReverseNumbFromFile.readToFile();
        ReverseNumbFromFile.writeToFile(ReverseNumbFromFile.getNumb().toString());



    }
}
