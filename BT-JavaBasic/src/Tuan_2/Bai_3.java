/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan_2;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.JButton; 

/**
 *
 * @author DELL
 */
public class Bai_3 extends JFrame {
    public Bai_3(){
        super("Box Layout");
        setSize(450,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        JPanel pnBox=new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox,BoxLayout.X_AXIS));
        
        JButton btn1=new JButton("Box Layout");
        btn1.setForeground(Color.RED);
        Font font=new Font("Arial",Font.BOLD | Font.ITALIC,25);
        btn1.setFont(font);pnBox.add(btn1);
       
        JButton btn2=new JButton("X_AXIS");
        btn2.setForeground(Color.BLUE);
        btn2.setFont(font);pnBox.add(btn2);
        
        JButton btn3=new JButton("Y_AXIS");
        btn3.setForeground(Color.ORANGE);
        btn3.setFont(font);pnBox.add(btn3);
        
        Container con=getContentPane();
        con.add(pnBox);
        
    }
    public static void main(String[] args) {
        new Bai_3();
        
    }
    
}
