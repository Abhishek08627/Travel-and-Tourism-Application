import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;


public class ViewPackage extends JFrame implements ActionListener{
	/**
	 * 
	 */
	JButton b=new JButton();
	private static final long serialVersionUID = 1L;
	ViewPackage(String username){
		setBounds(350,185,850,550);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		JLabel heading =new JLabel("VIEW PACKAGE DETAILS");
		heading.setBounds(100, 10, 300, 30);
		heading.setFont(new Font("Tahoma",Font.PLAIN,20));
		add(heading);
		
		JLabel l1=new JLabel("Username : ");
		l1.setBounds(50, 80, 70, 30);
		add(l1);
		
		JLabel l11=new JLabel();
		l11.setBounds(250, 70, 70, 50);
		add(l11);
		
		JLabel l2=new JLabel("Package : ");
		l2.setBounds(50, 140, 70, 30);
		add(l2);
		
		JLabel l12=new JLabel();
		l12.setBounds(250, 130, 150, 50);
		add(l12);
		
		JLabel l3=new JLabel("Total Persons : ");
		l3.setBounds(50, 210, 100, 30);
		add(l3);
		
		JLabel l13=new JLabel();
		l13.setBounds(250, 200, 70, 50);
		add(l13);
		
		JLabel l4=new JLabel("ID : ");
		l4.setBounds(50, 260, 70, 30);
		add(l4);
		
		JLabel l15=new JLabel();
		l15.setBounds(250, 250, 70, 50);
		add(l15);
		
		JLabel l6=new JLabel("number : ");
		l6.setBounds(50, 310, 70, 30);
		add(l6);
		
		JLabel l16=new JLabel();
		l16.setBounds(250, 300, 120, 50);
		add(l16);
		
		JLabel l7=new JLabel("Phone : ");
		l7.setBounds(50, 360, 70, 30);
		add(l7);
		
		JLabel l17=new JLabel();
		l17.setBounds(250, 350, 70, 50);
		add(l17);
		
		JLabel l8=new JLabel("Price : ");
		l8.setBounds(50, 410, 70, 30);
		add(l8);
		
		JLabel l18=new JLabel();
		l18.setBounds(250, 400, 70, 50);
		add(l18);
		
		b=new JButton("Back");
		b.setBackground(Color.BLACK);
		b.setForeground(Color.WHITE);
		b.setBounds(150, 470, 100, 30);
		b.addActionListener(this);
		add(b);
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
		JLabel l10=new JLabel(i1);
		l10.setBounds(400,50,400,400);
		add(l10);
		
		try{
			Conn c=new Conn();
			ResultSet rs=c.s.executeQuery("select * from bookpackage where username = '"+username+"'");
			while(rs.next())
			{
				l11.setText(rs.getString(1));
				l12.setText(rs.getString(2));
				l13.setText(rs.getString(3));
				l15.setText(rs.getString(4));
				l16.setText(rs.getString(5));
				l17.setText(rs.getString(6));
				l18.setText(rs.getString(7));
				
			}
		}catch(Exception e)
		{
			
		}
		
		
	}
	public static void main(String ar[])
	{
		new ViewPackage("").setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		
		try{
			if(ae.getSource()==b)
			{
				this.setVisible(false);
			}
		}catch(Exception e)
		{
			
		}
	}
}
