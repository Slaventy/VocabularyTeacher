package ver0_1.Tests;

import ver0_1.Vocabulary.Word;

import java.util.ArrayList;
import java.util.List;

/**класс предоставляет тестовый набот слов в виде массива строк*/
public class TestVoc {
    //мой тестовый словарик слов

    public List<Word> getListEng_Rus(){
        List<Word> list = new ArrayList<>();

        List<String> boy = new ArrayList<>();
        boy.add("мальчик");
        list.add(new Word("boy", boy));
        List<String> men = new ArrayList<>();
        men.add("человек");
        list.add(new Word("men", men));
        List<String> set = new ArrayList<>();
        set.add("установка");
        list.add(new Word("set", set));
        List<String> reset = new ArrayList<>();
        reset.add("сброс");
        list.add(new Word("reset", reset));
        return list;
    }

    public List<Word> getListRus_Eng(){
        List<Word> list = new ArrayList<>();

        List<String> boy = new ArrayList<>();
        boy.add("boy");
        list.add(new Word("мальчик", boy));

        List<String> men = new ArrayList<>();
        men.add("men");
        list.add(new Word("человек", men));

        List<String> set = new ArrayList<>();
        set.add("set");
        list.add(new Word("установка", set));

        List<String> reset = new ArrayList<>();
        reset.add("reset");
        list.add(new Word("сброс", reset));
        return list;
    }
}
