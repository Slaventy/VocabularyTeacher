package ver0_1.Interface;

import java.io.IOException;
import java.util.Scanner;

/**Класс объединяет инструменты для работы с консолью*/
 public class Consol {
     private Scanner scanner = new Scanner(System.in);
     private static Consol consol;


     private Consol(){}

    /**получение объекта класса*/
    public static Consol getConsole(){
         if (consol == null){
             consol = new Consol();
         }
        return consol;
    }

    /**получение строки*/
    public String getConsoleString(){
//        StringBuilder string = new StringBuilder();
//        while (consol.scanner.hasNext()){
//            string.append(consol.scanner.next());
//        }
//        return string.toString();
        return consol.scanner.next();//пока только по одному слову
    }

    /**вывод на печать*/
    public void sendConsole(String string){
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
