package university.management.system;

import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new AboutUs().setVisible(true);			
	}
    
        public AboutUs() {
            
            super("About Project");
            setBackground(new Color(173, 216, 230));
            setBounds(501, 260, 753, 505);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/logo.png"));
            Image i2 = i1.getImage().getScaledInstance(180, 150,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(405, 45, 255, 150);
            contentPane.add(l1);


            JLabel l3 = new JLabel("University");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(145, 45, 205, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(75, 95, 410, 45);
            contentPane.add(l4);

            JLabel l5 = new JLabel("Using Java And MySQL");
            l5.setForeground(new Color(30, 144, 255));
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l5.setBounds(155, 145, 505, 51);
            contentPane.add(l5);


            JLabel l6 = new JLabel("Project Made By");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(75, 200, 605, 38);
            contentPane.add(l6);

            JLabel l7 = new JLabel("Deepak Sahu");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(75, 265, 600, 34);
            contentPane.add(l7);


            
                
            contentPane.setBackground(Color.WHITE);
	}
        

}


