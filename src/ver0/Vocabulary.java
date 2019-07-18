package ver0;

/**
 * Абстрактный словарь любого языка
 */
abstract class Vocabulary  implements Book{

    //словарь в виде массива строк
    String[][] VocStrings;

    //установка словаря
    abstract void setVoc(String[][] voc);

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for (String[] vocString : VocStrings) {
            for (String s : vocString) {
                out.append(s).append(" ");
            }
            out.append("\n");
        }
        return out.toString();
    }
}
