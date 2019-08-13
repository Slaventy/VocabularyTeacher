package ver0;

public class Main {

    public static void main(String[] args) {

        TestVoc test = new TestVoc();
        TeacherWithVocabulary teacher = new TeacherWithVocabulary(new EnglishVocabulary(test.map));
        TeacherWithVocabulary teacher2 = new TeacherWithVocabulary(new EnglishVocabulary(test.Dic));
        System.out.println("Давайте посмотрим слова на сегодня");
        teacher.outVocabulary();
        teacher2.outVocabulary();
        teacher.start();
    }
}
