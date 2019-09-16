package ver0_1.Vocabulary;

import org.jetbrains.annotations.Contract;

import java.util.List;

/**
 * Класс Word представляет из себя объект содержащий
 * не менее двух слов концептуально связанных как слово - перевод,
 * на один из популярных языков.
 * Язык может быть любым, из кодировки UTF-8
 * */

public class Word {

    private String word;//ключевое слово
    private List<String> translate;//перевод - может содержать несколько слов
    private int assessment = 0;//количество баллов за правильный(+1) и неправильный(-1) ответы
    private int wordShow = 0;//количество раз показанное пользователю

    @Contract(pure = true)
    public Word(String word, List<String> translate){
        this.word = word;
        this.translate = translate;
    }

    void addWordShow(){
        wordShow++;
    }

    public void addAssessment() {
        this.assessment++;
    }

    public void subAssessment(){
        this.assessment--;
    }

    public String getWord(){
        return word;
    }

    public List<String> getTranslate(){
        return translate;
    }

    @Override
    public boolean equals(Object obj){

        if (obj == this){
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Word word = (Word)obj;
        return this.word.equalsIgnoreCase(word.word) && isEqualList(this.translate, word.translate);
    }

    private boolean isEqualList(List<String> listOne, List<String> listTwo){
        return listOne.containsAll(listTwo);
    }

    public String toString(){
        return  "слово " + word +
                "\nперевод " + translate +
                "\nбаллы " + assessment +
                "\nпоказы " + wordShow;
    }
}
