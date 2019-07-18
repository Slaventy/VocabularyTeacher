package ver0;

public class Main {
    public static void main(String[] args) {
        TeacherWithVocabulary teacher = new TeacherWithVocabulary(new EnglishVocabulary());
        System.out.println("Давайте посмотрим слова на сегодня");
        teacher.outVocabulary();
        teacher.start();
    }
}
