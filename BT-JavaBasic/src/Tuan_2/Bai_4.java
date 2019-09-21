/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan_2;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame; 
import javax.swing.JPanel; 
 

/**
 *
 * @author DELL
 */
public class Bai_4 extends JFrame {
    public Bai_4(){
        super("Border Layout");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        JPanel pnBorder=new JPanel();
            pnBorder.setLayout(new BorderLayout());
            
        JPanel pnNorth=new JPanel();
  
        pnNorth.setBackground(Color.RED);
            pnBorder.add(pnNorth,BorderLayout.NORTH);
                    
        JPanel pnSouth=new JPanel();
        pnSouth.setBackground(Color.RED);
            pnBorder.add(pnSouth,BorderLayout.SOUTH);
            
        JPanel pnWest=new JPanel();
        pnWest.setBackground(Color.BLUE);
            pnBorder.add(pnWest,BorderLayout.WEST);
            
        JPanel pnEast=new JPanel();
        pnEast.setBackground(Color.BLUE);
            pnBorder.add(pnEast,BorderLayout.EAST);
            
        JPanel pnCenter=new JPanel();
        pnCenter.setBackground(Color.YELLOW);
            pnBorder.add(pnWest,BorderLayout.CENTER);
        
        getContentPane().add(pnBorder);
 
        
        
    }
    public static void main(String[] args) {
        new Bai_4();
    }
    
}
