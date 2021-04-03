import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.border.Border;

public class About extends JFrame implements ActionListener {

    JButton b1;
    JLabel l1;
    Font f, f1, f2;
    TextArea t1;
    String s;

    public About() {
    	
    	 JLabel l1 = new JLabel("About Project");
         add(l1);
         l1.setBounds(250,25,400,50);
         l1.setForeground(Color.red);

         Font f2 = new Font("RALEWAY", Font.BOLD, 40);
         l1.setFont(f2);

        
        JButton b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(710, 35, 80, 40);
        b1.setBackground(Color.RED);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);

        Font f = new Font("RALEWAY", Font.BOLD, 180);
        setFont(f);

        
                s= "The objective of the Travel and Tourism Application "
                + "project is to develop a Application that automates the processes "
                + "and activities of a travel and the purpose is to design a "
                + "system using which one can perform all operations related to "
                + "traveling.\n\n"
                + "This application will help in accessing the information related "
                + "to the travel to the particular destination with great ease. "
                + "The users can track the information related to their tours with "
                + "great ease through this application. The travel agency information "
                + "can also be obtained through this application.\n\n"
                + "Advantages of Project:\n"
                + "\n     Gives accurate information ."
                + "\n     Simplifies the manual work ."
                + "\n     It minimizes the documentation related work ."
                + "\n     Provides up to date information ."
                + "\n     Friendly Environment by providing warning messages ."
                + "\n     travelers details can be provided ."
                + "\n     booking confirmation notification ."
                ;

        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20, 100, 800, 400);

        add(t1);

        Font f1 = new Font("RALEWAY", Font.BOLD, 16);
        t1.setFont(f1);

        Container contentPane = this.getContentPane();
        t1 = new TextArea();

       

        
        setBounds(350,185,850,550);
        setLayout(null);
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e) {
        dispose();
    }

    public static void main(String args[]) {
        new About().setVisible(true);
    }

}