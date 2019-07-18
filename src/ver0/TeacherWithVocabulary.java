package ver0;

import java.util.Random;
import java.util.Scanner;

/**
 *
 *
 */

class TeacherWithVocabulary {
    //поле для хранения любого словаря
    private Vocabulary vocabulary;

    //Связываем учителя и словарь
    TeacherWithVocabulary(Vocabulary voc){
        vocabulary=voc;
    }

    //запуск обучения
    void start(){
        Random rndI = new Random();
        Random rndJ = new Random();
        int i, j;
        do{
            i = rndI.nextInt(vocabulary.VocStrings.length);
            j = rndJ.nextInt(vocabulary.VocStrings[0].length);
            System.out.println("Напишите перевод слова: " + vocabulary.VocStrings[i][j]);
            Scanner sc = new Scanner(System.in);
            String answer = sc.next();
            if (answer.equals("exit")){
                return;
            }
            if(j == 0){
                if (answer.equals(vocabulary.VocStrings[i][j+1])){
                    System.out.println("верно");
                }else {
                    System.out.println("неверно");
                }
            } else {
                if (answer.equals(vocabulary.VocStrings[i][j-1])){
                    System.out.println("верно");
                }else {
                    System.out.println("неверно");
                }
            }
        }while (true);
    }

    //выводим весь словарь
    void outVocabulary(){
        System.out.println(vocabulary);
    }
}