package university.management.system;

import javax.swing.*;
import java.awt.*;


public class FeeStructure extends JFrame{
    
    
    
    public FeeStructure(){
        setSize(1000,600); 
        setLocation(450,150);
        
        ImageIcon ic =  new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/fees.jpeg"));
        Image i3 = ic.getImage().getScaledInstance(1000, 600,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        JLabel l1 = new JLabel(icc3);
        
        add(l1);
        
    }
    
    public static void main(String[] args){
        new FeeStructure().setVisible(true);
    }
}
