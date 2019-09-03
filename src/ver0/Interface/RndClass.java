package ver0.Interface;


import ver0.Vocabulary.Vocabulary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RndClass {
    private Random rndI = new Random();
    public String getRndValMapVoc(Vocabulary vocabulary){
        List<String> keys = new ArrayList<>(vocabulary.getVocabulary().keySet());
        String randomKey = keys.get( rndI.nextInt(keys.size()));
        return vocabulary.getVocabulary().get(randomKey);
    }
}
