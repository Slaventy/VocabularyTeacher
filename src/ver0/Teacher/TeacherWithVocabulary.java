package ver0.Teacher;

import ver0.Interface.ConsolMenu;
import ver0.Interface.LogicInConsol;
import ver0.Vocabulary.Vocabulary;


public class TeacherWithVocabulary {
    /**поле для хранения любого словаря*/
    private Vocabulary vocabulary;  //словарь
    private static TeacherWithVocabulary teacherWithVocabulary; //поле для хранения единственного объекта

    /**конструктор*/
    private TeacherWithVocabulary(){
    }

    /**метод получения единственного объекта*/
    public static TeacherWithVocabulary getTeacherWithVocabulary(){
        if (teacherWithVocabulary == null){
            teacherWithVocabulary = new TeacherWithVocabulary();
        }
        return teacherWithVocabulary;
    }

    /**связь словаря и учителя*/
    public void setVocabulary(Vocabulary voc){
        vocabulary = voc;
    }

    /**начало */
    public void Start(){
        if (ConsolMenu.getConsolMenu().MenuConsolOrWindow()){
            return;
        }
        ConsolMenu.getConsolMenu().MenuTeacherOrShowVocabulary();
    }

    /**начало в консоле*/
    public void startInConsole(){
        new LogicInConsol().start();
    }

    /**выводим весь словарь*/
    public void outVocabulary(){
        System.out.println(vocabulary);
    }
    /**Для получения словаря*/
    public Vocabulary getVocabulary() {
        return vocabulary;
    }
}