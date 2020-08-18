package ver0_1;

import ver0_1.Interface.MenuConsole;

public class Main {
    public static void main(String[] args) {
        //если ОС имеет только консоль запускаем в ней
        new MenuConsole().menuConsoleVocabulary();
    }
}
