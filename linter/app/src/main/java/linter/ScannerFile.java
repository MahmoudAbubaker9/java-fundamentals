package linter;
import java.io.*;
import java.util.Scanner;



public class ScannerFile {

    public static void main(String[] var) {
        Scan("./app/src/main/resources/gates.js");
    }

    public static String Scan(String path) {
        File filepath = new File(path);
        boolean testing=false;
        Scanner scanTest;
        int counter =1;


        try {
            scanTest = new Scanner(filepath);
            while(scanTest.hasNextLine()){
                String scannerTest = scanTest.nextLine();
                if(!(!scannerTest.endsWith(";") || (scannerTest.endsWith("}") || scannerTest.endsWith("{") || scannerTest.contains("if") || scannerTest.contains("else") || scannerTest.equals("")))){
                    System.out.println("In the line "+ counter +": Missing semicolon.");
                    testing = true;

                }
                counter++;
            }
            if( testing == false ){
                System.out.println("There is No errors have been found");
                return "There is No errors have been found";
            }

        } catch (FileNotFoundException error) {
            //print the error and which line
            error.printStackTrace();
        }
        return  "In the line " + counter + ": Missing semicolon.";
    }
    }