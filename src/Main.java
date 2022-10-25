import wordsChecker.WordsChecker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordsChecker wordsChecker = new WordsChecker("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
        while (true) {
            System.out.println("Введите слово:");
            String line = scanner.nextLine();
            System.out.println("В тексте слово: " + line + " " + (wordsChecker.hasWord(line) ? "Есть" : "Отсутствует"));
        }
    }
}
