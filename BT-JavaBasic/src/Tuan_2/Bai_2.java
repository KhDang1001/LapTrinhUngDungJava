/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan_2;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.JButton; 


/**
 *
 * @author DELL
 */
public class Bai_2 extends JFrame {
    public Bai_2(){
        super("Flow Layout");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        JPanel pnFlow=new JPanel();
        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.PINK);
        JButton btn1=new JButton("Flow Layout");
        JButton btn2=new JButton("Add các control");
        JButton btn3=new JButton("Trên 1 dòng");
        JButton btn4=new JButton("Hết chỗ chứa");
        JButton btn5=new JButton("Thì xuống dòng");
        pnFlow.add(btn1);pnFlow.add(btn2);
        pnFlow.add(btn3);pnFlow.add(btn4);
        pnFlow.add(btn5);
        Container con=getContentPane();
        con.add(pnFlow);

        

        
        
        
    
}
    public static void main(String[] args) {
        new Bai_2();
        
    }
    
}
