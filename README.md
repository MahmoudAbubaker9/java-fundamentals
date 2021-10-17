# java-fundamentals

## About the project (lab1)

**File:**
Main.class
Main.java

**Method:**

1- pluralize method

that method accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

2- flipNHeads method

that method is function called flipNHeads that accepts an integer n and flips coins until n heads are flipped in a row

3- clock method

that method is clock that uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second.

## Arrays, Loops, Imports, ArrayLists  (Lab 2)

1- Rolling Dice : 

that method called roll that accepts an integer n and rolls a six-sided dice n times. The method should return an array containing the values of the rolls.

2- Contains Duplicates :

that method called containsDuplicates that returns true or false depending on whether the array contains duplicate values.

3- Calculating Averages :

that method that accepts an array of integers and calculates and returns the average of all the values in the array.

4- Arrays of Arrays :

Given an array of arrays calculate the average value for each array and return the array with the lowest average.

## Maps and File I/O  (Lab 3)

This application reads a javascript file and reads it all, and if the file contains an error, it will print "Missing semicolon." with the line number instead of the line content.

## Composition and Inheritance, Part 1  (Lab 6)

Class Restaurent :
should have a name, a number of stars betweeen 0 and 5, and a price category (i.e. number of dollar signs). Implement a Restaurant constructor for the data and override toString method to get data string.

To run the test just type $ ./gradlew test in the root directory.