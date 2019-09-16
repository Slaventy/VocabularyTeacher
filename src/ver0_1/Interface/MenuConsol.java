package ver0_1.Interface;

import ver0_1.Teacher.Teacher;
import ver0_1.Tests.TestVoc;
import ver0_1.Vocabulary.VocabularyWithWords;

public class MenuConsol {

    private Consol consol = Consol.getConsole();

    public void menuConsoleVocabulary() {
        System.out.println("1 - будем работать в консоли с англо-русским словарем");
        System.out.println("2 - будем работать в окне с англо-русским словарем");
        System.out.println("3 - выход");
        while (true) {
            try {
                switch (Integer.parseInt(consol.getConsoleString())) {
                    case (1): {

                        VocabularyWithWords vocabularyWithWords = new VocabularyWithWords(new TestVoc().getListEng_Rus());
                        Teacher teacher = new Teacher(vocabularyWithWords);
                        teacher.startInConsole();
                        return;
                    }
                    case (2): {
                        VocabularyWithWords vocabularyWithWords = new VocabularyWithWords(new TestVoc().getListRus_Eng());
                        Teacher teacher = new Teacher(vocabularyWithWords);
                        teacher.startInConsole();
                        return;
                    }
                    case (3): {
                        System.out.println("выходим");
                        return;
                    }
                }
            } catch (NumberFormatException ignored) {}
            consol.clsConsole();
            System.out.println("Введите номер выбранной позиции");
        }
    }
}
