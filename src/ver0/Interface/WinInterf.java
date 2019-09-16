package ver0.Interface;


import javax.swing.*;
import java.awt.*;

public class WinInterf extends JFrame{
    private JRadioButton JRB_engl_russ_voc = new JRadioButton("англо-русский словарь");
    private JRadioButton JRB_russ_engl_voc = new JRadioButton("русско-английский словарь");
    private JRadioButton JRB_exit = new JRadioButton("русско-английский словарь");

    public void run(){
        Container container = this.getContentPane();
        container.add(JRB_engl_russ_voc);
        container.add(JRB_russ_engl_voc);
        container.add(JRB_exit);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
