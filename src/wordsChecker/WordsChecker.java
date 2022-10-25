package wordsChecker;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {

    private Set<String> TEXT;

    public WordsChecker(String TEXT) {
        this.TEXT = new HashSet<>(List.of(TEXT.split("\\P{IsAlphabetic}+")));
    }

    public boolean hasWord(String word) {
        return TEXT.contains(word);
    }

}
