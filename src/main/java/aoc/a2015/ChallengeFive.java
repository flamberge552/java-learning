package aoc.a2015;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChallengeFive {
    File file = new File("C:\\Projects\\internals\\java-learning\\src\\main\\java\\words.txt");
    static List<String> texts = new ArrayList<>();

    void readStringsFromFile(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            texts.add(scanner.nextLine());
        }
    }

    boolean isNaughtyOrNice(String word) {
        int count = 0;
        char previousLetter = '1';
        boolean hasDoubleLetters = false;
        boolean isValid = false;
        boolean hasIllegalCombinations = false;

        for (char letter : word.toCharArray()) {
            if ((letter == 'a') || (letter == 'i') || (letter == 'e') || (letter == 'o') || (letter == 'u')) {
                count++;
            }
            if (previousLetter == letter) {
                hasDoubleLetters = true;
            }
            if ((letter + previousLetter == 'a' + 'b') || (letter + previousLetter == 'c' + 'd') ||
                    (letter + previousLetter == 'p' + 'q') || (letter + previousLetter == 'x' + 'y'))
                hasIllegalCombinations = true;
            previousLetter = letter;
        }

        if ((hasDoubleLetters && count >= 3) && !hasIllegalCombinations)
            isValid = true;

        return isValid;
    }

    public static void main(String... args) throws IOException {
        ChallengeFive challengeFive = new ChallengeFive();
        challengeFive.readStringsFromFile(challengeFive.file);
        for (String word : texts) {
            System.out.println(word + " good status is " + challengeFive.isNaughtyOrNice(word));
        }
    }
}
