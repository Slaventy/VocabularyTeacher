package ver0.Interface;

import java.io.IOException;
import java.util.Scanner;
/**Класс объединяет инструменты для работы с консолью*/
 class Consol {
     private Scanner scanner = new Scanner(System.in);
     private static Consol consol;

     private Consol(){}

    /**получение объекта класса*/
    static Consol getConsole(){
         if (consol == null){
             consol = new Consol();
         }
        return consol;
    }

    /**получение строки*/
    String getConsoleString(){
         return consol.scanner.next();
    }

    /**вывод на печать*/
    void sendConsole(String string){
        System.out.println(string);
    }
    /**Очистка консоли*/
    void clsConsole(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }
}