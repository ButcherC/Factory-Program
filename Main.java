package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static com.sun.jmx.snmp.ThreadContext.contains;
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;

public class Main {

    public static void main(String[] args) throws IOException {

        String myValue;
        String myFile;
        System.out.println("Please enter a file to read.");
        BufferedReader myReader = new BufferedReader(new InputStreamReader((System.in)));
        myFile = myReader.readLine();
        List<String> lines = Files.readAllLines(Paths.get(myFile));
        lines.toString();
        String[] theArray = lines.toString().split(",");
        for(int i = 0; i < theArray.length; i++)
        {
            if (theArray[i].contains("High Resolution"))
            {
                DocWidgetFactory getTheStuff = new DocWidgetFactory();
                getTheStuff.HighResWidget();
                getTheStuff.HighResDoc();
            }
        else if (theArray[i].contains("Low Resolution")) {
                DocWidgetFactory getMoreStuff = new DocWidgetFactory();
                getMoreStuff.LowResWidget();
                getMoreStuff.LowResDoc();
            } else {
                System.out.println("Resolution Setting not found.");
            }

    }
}}
