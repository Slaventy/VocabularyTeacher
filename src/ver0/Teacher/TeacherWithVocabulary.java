package ver0.Teacher;

import ver0.Interface.Consol;
import ver0.Interface.RndClass;
import ver0.Tests.TestVoc;
import ver0.Vocabulary.EnglishVocabulary;
import ver0.Vocabulary.Vocabulary;


public class TeacherWithVocabulary {
    /**поле для хранения любого словаря*/
    private Vocabulary vocabulary;  //словарь
    private Consol consol = new Consol();   //класс для работы с консоль
    private RndClass rndClass = new RndClass();     //класс для случайной выборки из словаря

    private static TeacherWithVocabulary teacherWithVocabulary;

    /**Связываем учителя и словарь*/
    private TeacherWithVocabulary(){
        startInConsole();
    }

    public static void getTeacherWithVocabulary(){
        if (teacherWithVocabulary == null){
            teacherWithVocabulary = new TeacherWithVocabulary();
        }
        teacherWithVocabulary.startInConsole();
    }

    private void startInConsole(){
        System.out.println("1 - будем работать в консоли с англо-русским словарем");
        System.out.println("2 - выход");
        switch (Integer.valueOf(consol.getConsole())){
            case(1):{
                vocabulary = new EnglishVocabulary(TestVoc.Dic);
            }
            case(2):{
                System.out.println("выходим");
                break;
            }
        }
        String val, con;
        do {
            val = rndClass.getRndValMapVoc(vocabulary);
            consol.sendConsole("Напишите перевод слова " + val);
            con = consol.getConsole();
            if (con.equals("exit")){
                consol.sendConsole("exiting");
                return;
            }
            if (val.equals(vocabulary.getVocabulary().get(con))){
                consol.sendConsole("Верно");
            }else {
                consol.sendConsole("Не верно");
            }
        }while (true);

    }
//    /**выводим весь словарь*/
//    private void outVocabulary(){
//        System.out.println(vocabulary);
//    }
}