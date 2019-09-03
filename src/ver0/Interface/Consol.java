package ver0.Interface;

import java.util.Scanner;

 class Consol {
     private Scanner scanner = new Scanner(System.in);
     private static Consol consol;

     private Consol(){

     }

    static Consol getConsole(){
         if (consol == null){
             consol = new Consol();
         }
        return consol;
    }

    String getConsoleString(){
         return consol.scanner.next();
    }
    void sendConsole(String string){
        System.out.println(string);
    }
}
