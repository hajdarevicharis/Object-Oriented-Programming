package Lab06.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionaryy {
    HashMap<String, String> translation = new HashMap<>();

    public HashMap<String, String> getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "translation=" + translation +
                '}';
    }

    public String translate(String word) {
        if(translation.containsKey(word))
            return translation.get(word);
         else
            return "That word is not in our dictionary, you can add it by using method add().";
    }

    public void add(String word, String translate) {
        if(translation.containsKey(word)) {
            System.out.println("That word is already in our translation book.");
        } else
            translation.put(word,translate);
    }

    public int numOfWords() {
        return this.translation.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> lista = new ArrayList<>();
        for (String key : this.translation.keySet()) {
            lista.add(key + " = " + translation.get(key));
        }
        return lista;
    }
}
