package ver0_1.Teacher;

import ver0_1.Interface.Consol;
import ver0_1.Vocabulary.VocabularyWithWords;
import ver0_1.Vocabulary.Word;

import java.util.ArrayList;
import java.util.Arrays;

public class Teacher {

    private final VocabularyWithWords vocabulary;//словарь слов


    public Teacher(VocabularyWithWords vocabularyWithWords){
        this.vocabulary = vocabularyWithWords;
    }

    public void startInConsole(){
        do {
            Word word = vocabulary.getWordRND();//получили случайное слово из словаря
            Consol.getConsole().sendConsole("для выхода введите exit");
            Consol.getConsole().sendConsole("Введите перевод слова " + word.getWord());

            String transl = Consol.getConsole().getConsoleString().toLowerCase();//вводим свой перевод слова

            if (transl.equals("exit")){return;}//выход из программы
            String[] split = transl.split(" ");//разделяем перевод на несколько слов
            ArrayList<String> translate = new ArrayList<>(Arrays.asList(split));//создаем лист перевода

            if (word.getTranslate().equals(translate)){
                Consol.getConsole().sendConsole("Верно");
                word.addAssessment();
            }else {
                Consol.getConsole().sendConsole("Не верно");
                word.subAssessment();
            }
            Consol.getConsole().sendConsole(word.toString());

        }while (true);
    }
}