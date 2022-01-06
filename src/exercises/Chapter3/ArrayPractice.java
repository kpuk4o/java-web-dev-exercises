package exercises.Chapter3;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice();
        arrayPractice.printOddNumbers();
        arrayPractice.splitString();
        arrayPractice.splitStringIntoSentences();
    }


    public void printOddNumbers() {
        //Create an array 1, 1, 2, 3, 5, 8. No decimals => integers array
        int[] myArrayOfInts = { 1, 1, 2, 3, 5, 8 };

        //Loop through the array and print out each value
        for (int i = 0; i < myArrayOfInts.length; i++) {
            if(myArrayOfInts[i] % 2 != 0) {
                System.out.println(myArrayOfInts[i]);
            }
        }
    }
    public String[] splitString() {
        String myString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitString = myString.split(" ");
//        System.out.println(Arrays.toString(splitString));
        return splitString;
    }

    public void splitStringIntoSentences() {
        String myString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitStringIntoSentences = myString.split("\\.");
        System.out.println(Arrays.toString(splitStringIntoSentences));
    }
}
