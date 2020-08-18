package ver0_1.Vocabulary;


import java.util.List;
import java.util.Random;

/**
 * Словарь vocabulary представляет список объектов Word
 * и предоставляет произвольный доступ к любому объекту
 * списка
 * */
public class VocabularyWithWords{

    private final List<Word> vocabulary;

    public VocabularyWithWords(List<Word> list){
        vocabulary = list;
    }

    public Word getWordRND(){
        int rnd = new Random().nextInt(vocabulary.size());
        vocabulary.get(rnd).addWordShow();
        return vocabulary.get(rnd);
    }
}
