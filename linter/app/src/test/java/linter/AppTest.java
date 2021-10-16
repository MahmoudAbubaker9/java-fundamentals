package linter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {


    @Test
    public void emptyTest(){
        String testPath = "./src/test/resources/empty.js";
        ArrayList<String> emptyTest = new ArrayList<>();
        assertEquals( emptyTest , App.fileScan(testPath));
    }

    @Test public void testMultiError(){
        String testPath = "./src/test/resources/multiError.js";
        ArrayList<String> multiTest = new ArrayList<>();
        multiTest.add("Line 1 : Missing semicolon.");
        multiTest.add("Line 2 : Missing semicolon.");
        multiTest.add("Line 6 : Missing semicolon.");
        multiTest.add("Line 8 : Missing semicolon.");
        multiTest.add("Line 9 : Missing semicolon.");
        multiTest.add("Line 10 : Missing semicolon.");

        assertEquals( multiTest ,App.fileScan(testPath));
    }

    @Test public void testManyError(){
        String testPath = "./src/test/resources/manyErrors.js";
        ArrayList<String> manyTest = new ArrayList<>();
        manyTest.add("Line 1 : Missing semicolon.");
        manyTest.add("Line 2 : Missing semicolon.");
        manyTest.add("Line 3 : Missing semicolon.");
        manyTest.add("Line 4 : Missing semicolon.");
        manyTest.add("Line 5 : Missing semicolon.");
        manyTest.add("Line 6 : Missing semicolon.");
        manyTest.add("Line 7 : Missing semicolon.");
        manyTest.add("Line 11 : Missing semicolon.");
        manyTest.add("Line 13 : Missing semicolon.");
        manyTest.add("Line 18 : Missing semicolon.");
        manyTest.add("Line 20 : Missing semicolon.");

        assertEquals( manyTest ,App.fileScan(testPath));
    }

    @Test public void testNoError(){
        String testPath = "./src/test/resources/noError.js";
        ArrayList<String> noError = new ArrayList<>();
        assertEquals( noError , App.fileScan(testPath));
    }

    @Test public void testOneError(){
        String testPath = "./src/test/resources/oneError.js";
        ArrayList<String> oneError = new ArrayList<>();
        oneError.add("Line 1 : Missing semicolon.");
        assertEquals( oneError , App.fileScan(testPath));
    }


}