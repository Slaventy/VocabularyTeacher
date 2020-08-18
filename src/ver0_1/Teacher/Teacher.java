package ver0_1.Teacher;

import ver0_1.Interface.Console;
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
            Console.getConsole().sendConsole("для выхода введите exit");
            Console.getConsole().sendConsole("Введите перевод слова " + word.getWord());

            String transl = Console.getConsole().getConsoleString().toLowerCase();//вводим свой перевод слова

            if (transl.equals("exit")){return;}//выход из программы
            String[] split = transl.split(" ");//разделяем перевод на несколько слов
            ArrayList<String> translate = new ArrayList<>(Arrays.asList(split));//создаем лист перевода

            if (word.getTranslate().equals(translate)){
                Console.getConsole().sendConsole("Верно");
                word.addAssessment();
            }else {
                Console.getConsole().sendConsole("Не верно");
                word.subAssessment();
            }
            Console.getConsole().sendConsole(word.toString());

        }while (true);
    }
}