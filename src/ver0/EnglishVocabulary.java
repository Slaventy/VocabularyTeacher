package ver0;

class EnglishVocabulary extends Vocabulary {

    EnglishVocabulary() {
        //мой словарик слов
        String[][] Dic = {{"boy", "мальчик"},
                {"men", "человек"},
                {"port", "порт"},
                {"set", "установка"},
                {"reset", "сброс"},
                {"camera", "камера"},
                {"number", "число"},
                {"foot", "нога"},
                {"black", "черный"},
                {"white", "белый"}
        };

        setVoc(Dic);
    }

    //установка словаря
    void setVoc(String[][] voc) {
        VocStrings = voc.clone();
    }
}
