package Lab06.Interface;

import Lab06.HashMap.Dictionaryy;

import java.util.Dictionary;
import java.util.Scanner;


public class TextUserInterface {
    Scanner reader;
    Dictionaryy dictionary;

    public TextUserInterface(Scanner reader, Dictionaryy dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        System.out.println("Statements:");
        System.out.println("Quit - exits the text user interface");
        System.out.println("Add - adds new item to dictionary");
        System.out.println("Translate - finds the translation of a word if it exists in the dictionary");

        while(true) {
            System.out.println("Statement: ");
            String command = reader.nextLine();
            switch (command) {
                case "Quit":
                    System.out.println("You quitted");
                    System.exit(0);
                    break;

                case "Add":
                    System.out.println("Word in bosnian: ");
                    String word = reader.nextLine();
                    System.out.println("In english: ");
                    String translation = reader.nextLine();
                    this.dictionary.add(word, translation);
                    break;

                case "Translate":
                    System.out.println("Which word do you want to translate: ");
                    String translationWord = reader.nextLine();
                    String translationOutput = "";
                    for (String w : this.dictionary.getTranslation().keySet()) {
                        if(!this.dictionary.getTranslation().containsKey(translationWord)) {
                            translationOutput = "word not found";
                            break;
                        }
                        if(w.equals(translationWord)) {
                            translationOutput = this.dictionary.getTranslation().get(w);
                            break;
                        }
                    }
                    System.out.println("Translation: " + translationOutput);
                    break;

                 default:
                     System.out.println("Unknown statement");
                     break;

            }
        }
    }

}
