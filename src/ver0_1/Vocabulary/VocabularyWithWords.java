package ver0_1.Vocabulary;

import org.jetbrains.annotations.Contract;

import java.util.List;
import java.util.Random;

/**
 * Словарь vocabulary представляет список объектов Word
 * и предоставляет произвольный доступ к любому объекту
 * списка
 * */
public class VocabularyWithWords{

    private List<Word> vocabulary;

    @Contract(pure = true)
    public VocabularyWithWords(List<Word> list){
        vocabulary = list;
    }

    public Word getWordRND(){

        int rnd = new Random().nextInt(vocabulary.size());
        vocabulary.get(rnd).addWordShow();
        return vocabulary.get(rnd);
    }


}
