package linter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;



public class App {
    public static void main(String[] args) {
        fileScan("./app/src/main/resources/gates.js");
    }
    public static ArrayList<String> fileScan(String path) {
        ArrayList<String> readFile = new ArrayList<>();
        Path getPath = Paths.get(path);

        try {
            List<String> fileCheck = Files.readAllLines(getPath);
            int counter = 1;
            for(String str : fileCheck) {
                if (!str.contains("if")&& !str.contains("else")&& !str.equals("") && !str.endsWith(";") && !str.endsWith("}") && !str.endsWith("{")){
                    String printLine = "Line " + counter + " : Missing semicolon.";
                    readFile.add(printLine);


                }
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readFile;
    }
}