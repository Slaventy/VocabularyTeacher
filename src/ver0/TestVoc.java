package ver0;

import java.util.HashMap;
import java.util.Map;

class TestVoc {

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

    Map<String, String > map = new HashMap<>();

    TestVoc(){
        for (int i = 0, j = 0; i < Dic.length; i++){
            map.put(Dic[i][j], Dic[i][j+1]);
            j = 0;
        }
    }
}
