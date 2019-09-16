package ver0.Interface;

import ver0.Teacher.TeacherWithVocabulary;
import ver0.Tests.TestVoc;
import ver0.Vocabulary.EnglishVocabulary;

public class ConsolMenu {
    private Consol consol = Consol.getConsole();
    private static ConsolMenu consolMenu;
    private ConsolMenu(){}
    public static ConsolMenu getConsolMenu(){
        if (consolMenu == null){
            consolMenu = new ConsolMenu();
        }
        return consolMenu;
    }

    public boolean MenuConsolOrWindow(){
        while (true) {
            System.out.println("1 - будем работать в консоли с англо-русским словарем");
            System.out.println("2 - будем работать в окне с англо-русским словарем");
            System.out.println("3 - выход");
            try {
                switch (Integer.parseInt(consol.getConsoleString())) {
                    case (1): {
                        //берем учителя, загружем словарь в который грузим тестовую выборку
                        TeacherWithVocabulary.getTeacherWithVocabulary().setVocabulary(new EnglishVocabulary(TestVoc.Dic));
                        return false;
                    }
                    case (2): {

                    }
                    case (3): {
                        System.out.println("выходим");
                        return true;
                    }
                }
            }catch (NumberFormatException ex){
                System.out.println();
            }
            consol.clsConsole();
            System.out.println("Введите номер выбранной позиции");
        }
    }

    public void MenuTeacherOrShowVocabulary(){
        while (true) {
            System.out.println("1 - перейдем к учебе");
            System.out.println("2 - посмотрим слова в словаре");
            System.out.println("3 - выход");
            try {
                switch (Integer.parseInt(consol.getConsoleString())){
                    case (1):{
                        TeacherWithVocabulary.getTeacherWithVocabulary().startInConsole();
                        return ;
                    }
                    case (2):{
                        TeacherWithVocabulary.getTeacherWithVocabulary().outVocabulary();
                        break;
                    }
                    case (3):{
                        return ;
                    }
                }
            }catch (NumberFormatException ex){
                System.out.println();
            }
            consol.clsConsole();
            System.out.println("Введите номер выбранной позиции");
        }
    }
}
