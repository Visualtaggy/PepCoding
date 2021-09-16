import java.util.*;

/**
 * HashmapIntroduction
 * 
 * , "Russian" : "ru-RU",
 * 
 * "Brazilian Portuguese" : "pt-BR", "Latin American Spanish" : "es-MX"
 */
public class HashmapIntroduction {

    public static void main(String[] args) {
        HashMap<String, String> lang = new HashMap<>();
        lang.put("English(US)", "en-US");
        lang.put("French", "fr-FR");
        lang.put("German", "de-DE");
        lang.put("Italian", "it-IT");
        lang.put("Japanese", "ja-JP");

        System.out.println(lang);
        // This will get inserted at any random place [NOTE]: YOU WILL SACRIFICE ORDER
        // for PERFORMANCE
        lang.put("Spanish", "es-ES");

        System.out.println(lang);

        // Getting the key from value
        System.out.println(lang.get("French"));

        // checking if value present ?
        System.out.println(lang.containsKey("French"));

        Set<String> key = lang.keySet();
        System.out.println(key);

    }
}