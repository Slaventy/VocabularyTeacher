package ver0.Interface;

import ver0.Teacher.TeacherWithVocabulary;

public class LogicInConsol {

    private RndClass rndClass = new RndClass();

public void start(){
    String val, con;
    do {
        val = rndClass.getRndValMapVoc(TeacherWithVocabulary.getTeacherWithVocabulary().getVocabulary()).toLowerCase();
        Consol.getConsole().sendConsole("Для выхода введите \"exit\"\nНапишите перевод слова " + val);
        con = Consol.getConsole().getConsoleString().toLowerCase();
        if ((con.toLowerCase()).equals("exit")){
            Consol.getConsole().sendConsole("exiting");
            return;
        }
        if (val.equals(TeacherWithVocabulary.getTeacherWithVocabulary().getVocabulary().getVocabulary().get(con))){
            Consol.getConsole().sendConsole("Верно");
        }else {
            Consol.getConsole().sendConsole("Не верно");
        }
        Consol.getConsole().clsConsole();
    }while (true);

}







}
