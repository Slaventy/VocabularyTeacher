package ver0.Vocabulary;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/***/
public class EnglishVocabulary extends Vocabulary implements Serializable {

    /**конструктор для массива строк*/
    public EnglishVocabulary(String[][] Dic) {
        Map<String, String > map = new HashMap<>();
        for (int i = 0, j = 0; i < Dic.length; i++){
            map.put(Dic[i][j], Dic[i][j+1]);
            j = 0;
        }
        setVocabulary(map);
    }

//    /**конструктор для коллекции*/
//    EnglishVocabulary(Map<String, String> map) {
//        setVocabulary(map);
//    }

//    /**при использовании конструктора без параметров
//     * он запрашивает путь откуда загрузить словарь*/
//    EnglishVocabulary(){
//        Consol consol = new Consol();
//        consol.sendConsole("Введите путь и название словаря");
//        String thePathToFile = consol.getConsole();
//        StringBuffer str = new StringBuffer();
//        try {
//            FileReader fr = new FileReader(thePathToFile);
//            while (fr.ready()){
//                str.append((char)fr.read());
//            }
//            fr.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        /*имеем строку с данными*/
//        System.out.println(str);//OK
//        //для формирования массива строк нужно подсчитать
//        //количество пробелов(столбцы) и переносов(строки)
//        int col = 0, row = 0;
//        for (int i = 0; i < str.length(); i++){
//            if (str.charAt(i) == ' '){
//                col++;
//            }
//            if (str.charAt(i) == '\n'){
//                row++;
//            }
//        }
//        if (str.charAt(str.length()-1) !=  '\n'){
//            row++;
//        }
//        System.out.println("col1 " + col + " row " + row);
//
//        String [][] mass = new String[col][row];
//        col = row = 0;
//        StringBuffer stringBuffer = new StringBuffer();
//        for (int i = 0; i < str.length(); i++){
//            stringBuffer.append(str.charAt(i));
//            if (str.charAt(i) == ' '){
//                mass[col][row] = stringBuffer.toString();
//                col++;
//                stringBuffer.setLength(0);
//            }
//            if (str.charAt(i) == '\n'){
//                mass[col][row] = stringBuffer.toString();
//                row++;
//                stringBuffer.setLength(0);
//            }
//        }
//        System.out.println("col " + col + " row " + row);
//        for (int i = 0; i < mass.length; i++){
//            for (int j = 0; j < mass[i].length; j++){
//                System.out.println(mass[i][j] + " ");
//            }
//            System.out.println();
//        }
        //сформировать массив строк
        //скопировать из буфкра данные в массив
//
//    }


}
