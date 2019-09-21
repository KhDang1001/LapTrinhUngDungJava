/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan_2;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class Bai_1 extends JFrame {
    public Bai_1(){
        super("Demo Windows");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        Bai_1 ui=new Bai_1();
        ui.setSize(400,300);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
        
    }
    
}
