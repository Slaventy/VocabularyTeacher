package ver0;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

class EnglishVocabulary extends Vocabulary {

    //конструктор для массива строк
    EnglishVocabulary(@NotNull String[][] Dic) {
        Map<String, String > map = new HashMap<>();
        for (int i = 0, j = 0; i < Dic.length; i++){
            map.put(Dic[i][j], Dic[i][j+1]);
            j = 0;
        }
        setVocabulary(map);
    }

    //конструктор для коллекции
    EnglishVocabulary(Map<String, String> map) {
        setVocabulary(map);
    }

}
