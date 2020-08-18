package ver0_1.Interface;

import java.io.IOException;
import java.util.Scanner;

/**Класс объединяет инструменты для работы с консолью*/
 public class Console {
     private final Scanner scanner = new Scanner(System.in);
     private static Console console;


     private Console(){}

    /**получение объекта класса*/
    public static Console getConsole(){
         if (console == null){
             console = new Console();
         }
        return console;
    }

    /**получение строки*/
    public String getConsoleString(){
//        StringBuilder string = new StringBuilder();
//        while (console.scanner.hasNext()){
//            string.append(console.scanner.next());
//        }
//        return string.toString();
        return console.scanner.next();//пока только по одному слову
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
