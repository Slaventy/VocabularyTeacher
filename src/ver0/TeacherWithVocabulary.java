package ver0;

import org.jetbrains.annotations.Contract;

import java.util.*;

/**
 *
 *
 */

class TeacherWithVocabulary {
    //поле для хранения любого словаря
    private Vocabulary vocabulary;

    //Связываем учителя и словарь
    @Contract(pure = true)
    TeacherWithVocabulary(Vocabulary voc){
        vocabulary=voc;
    }

    //запуск обучения
    void start(){
        Random rndI = new Random();

        do{
            List<String> keys = new ArrayList<>(vocabulary.getVocabulary().keySet());
            String       randomKey = keys.get( rndI.nextInt(keys.size()) );
            String       value     = vocabulary.getVocabulary().get(randomKey);
            System.out.println("Напишите перевод слова: " + randomKey);
            Scanner sc = new Scanner(System.in);
            String answer = sc.next();
            if (answer.equals("exit")){
                return;
            }
            if (value.equals(answer)){
                System.out.println("Верно");
            }else {
                System.out.println("Не верно");
            }

        }while (true);
    }

    //выводим весь словарь
    void outVocabulary(){
        System.out.println(vocabulary);
    }
}