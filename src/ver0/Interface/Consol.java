package ver0.Interface;

import java.util.Scanner;

 public class Consol {
     private Scanner scanner = new Scanner(System.in);
    public String getConsole(){
        return scanner.next();
    }
    public void sendConsole(String string){
        System.out.println(string);
    }
}
