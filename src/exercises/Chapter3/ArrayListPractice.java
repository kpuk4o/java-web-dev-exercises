package exercises.Chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> sum = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        /*sum.add(1);
        sum.add(2);
        sum.add(3);
        sum.add(4);
        sum.add(5);
        sum.add(6);
        sum.add(7);
        sum.add(8);
        sum.add(9);
        sum.add(10); */
        Integer theSum = ArrayListPractice.sumAllEvenNumbers(sum);
        System.out.println((theSum));

        ArrayPractice arrayPractice = new ArrayPractice();
        String[] returnedWords = arrayPractice.splitString();

        ArrayList<String> wordsToSearch = new ArrayList<String>(Arrays.asList(returnedWords));
        System.out.println("Enter the word length to search: ");
        Integer searchLength = ArrayListPractice.getUserInput();
        ArrayListPractice.printWordsWithFiveLetters(wordsToSearch, searchLength);
    }

    public static Integer getUserInput() {
        Scanner scanner = new Scanner(System.in);
        Integer userInt = scanner.nextInt();
        scanner.close();
        return userInt;
    }

    public static void printWordsWithFiveLetters(ArrayList<String> words, Integer searchLength) {
        for(int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == searchLength) {
                System.out.println(words.get(i));
            }
        }
    }

    public static Integer sumAllEvenNumbers(ArrayList<Integer> numbersToSum) {
        Integer total = 0;
        for (int i = 0; i < numbersToSum.size(); i++) {
            if (numbersToSum.get(i) % 2 == 0) {
                total += numbersToSum.get(i);
            }
        }
        return total;
    }
}
