package Lab06.LibrarySystem;

public class StringUtils {
    public static boolean included(String word, String searched) {
        if (word.isEmpty() || word.isBlank() || searched.isBlank() || searched.isEmpty()) {
            return false;
        }
        if (word.toLowerCase().trim().contains(searched.toLowerCase().trim())) {
            return true;
        }
        return false;
    }
}
