package SimpleDictionary;
import java.util.Scanner;
import java.util.HashMap;

public class SimpleDictionary {

    private HashMap<String, String> translations;

    public SimpleDictionary() {
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        return this.translations.get(word);
    }

    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }

    public static void main(String[] args) {
        TextUI t = new TextUI(new Scanner(System.in), new SimpleDictionary());
        t.start();
        //System.out.println(dictionary.translate("pike")); // prints the string "hauki"
    }
}
