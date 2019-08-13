package ver0;

import java.util.Map;

/**
 * Абстрактный словарь любого языка
 */
abstract class Vocabulary  implements Book{

    //словарь в виде массива строк
    private Map<String, String> mapStrings;    //коллекция для пары ключ(уникальный) - значение


    Map<String, String> getVocabulary (){
        return mapStrings;
    }

    void setVocabulary(Map<String, String> map){
        mapStrings = map;
    }
    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for (Map.Entry entry : getVocabulary().entrySet()) {
            out.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
        }
        return out.toString();
    }
}
