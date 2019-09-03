package ver0.Vocabulary;

import java.util.Map;

/**
 * Абстрактный словарь любого языка на
 * основе книги
 */
public abstract class Vocabulary  implements Book {

    /**словарь в виде коллекции ключ-значение строк*/
    private Map<String, String> mapStrings;    //коллекция для пары ключ(уникальный) - значение

    /**передает текущий словарь*/
    public Map<String, String> getVocabulary(){
        return mapStrings;
    }
    /**передача колекции со словами для словаря
     * слова и их перевод на соответствующий язык*/
    void setVocabulary(Map<String, String> map){
        mapStrings = map;
    }


    /** для правильного отображения переопределен метод*/
    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for (Map.Entry entry : getVocabulary().entrySet()) {
            out.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
        }
        return out.toString();
    }
}
