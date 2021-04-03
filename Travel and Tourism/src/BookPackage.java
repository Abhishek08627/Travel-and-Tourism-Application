import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

import java.sql.*;
public class BookPackage extends JFrame implements ActionListener{
	Choice c1;
	JLabel l11,l12,l13,l14,l15;
	JButton b1,b2,b3;
	JTextField t1,t2,t3,t4;
	BookPackage(String username){
		setBounds(350,185,850,550);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		JLabel l1=new JLabel("BOOK PACKAGE");
		l1.setBounds(50,25, 300, 30);
		l1.setFont(new Font("Tahoma",Font.PLAIN,30));
		add(l1);
		
		JLabel l2=new JLabel("Username");
		l2.setBounds(35,100, 100, 30);
		l2.setFont(new Font("Tahoma",Font.PLAIN,15));
		add(l2);
		
		l11=new JLabel();
		l11.setBounds(180,100, 150, 30);
		l11.setFont(new Font("Tahoma",Font.PLAIN,15));
		add(l11);
		
		JLabel l3=new JLabel("Select Package");
		l3.setBounds(35,150, 100, 30);
		l3.setFont(new Font("Tahoma",Font.PLAIN,15));
		add(l3);
		
		c1=new Choice();
		c1.add("GOLD PACKAGE");
		c1.add("SILVER PACKAGE");
		c1.add("BRONZE PACKAGE");
		c1.setBounds(180,155,150,30);
		add(c1);
		

		JLabel l4=new JLabel("Total Persons");
		l4.setBounds(35,200, 100, 30);
		l4.setFont(new Font("Tahoma",Font.PLAIN,15));
		add(l4);
		
		t1=new JTextField("1");
		t1.setBounds(180, 200, 150, 25);
		add(t1);
		
		JLabel l5=new JLabel("ID : ");
		l5.setBounds(35,250, 100, 30);
		l5.setFont(new Font("Tahoma",Font.PLAIN,15));
		add(l5);
		
		l12=new JLabel();
		l12.setBounds(180,250, 150, 30);
		l12.setFont(new Font("Tahoma",Font.PLAIN,15));
		add(l12);
		
		JLabel l6=new JLabel("Number ");
		l6.setBounds(35,300, 100, 30);
		l6.setFont(new Font("Tahoma",Font.PLAIN,15));
		add(l6);
		
		l13=new JLabel();
		l13.setBounds(180,300, 150, 30);
		l13.setFont(new Font("Tahoma",Font.PLAIN,15));
		add(l13);
		
		JLabel l7=new JLabel("Phone");
		l7.setBounds(35,350, 100, 30);
		l7.setFont(new Font("Tahoma",Font.PLAIN,15));
		add(l7);
		
		l14=new JLabel();
		l14.setBounds(180,350, 150, 30);
		l14.setFont(new Font("Tahoma",Font.PLAIN,15));
		add(l14);
		
		JLabel l8=new JLabel("Total Price");
		l8.setBounds(35,400, 100, 30);
		l8.setFont(new Font("Tahoma",Font.PLAIN,15));
		add(l8);
		
		l15=new JLabel();
		l15.setBounds(180,400, 150, 30);
		l15.setFont(new Font("Tahoma",Font.PLAIN,15));
		l15.setForeground(Color.RED);
		add(l15);
		
		try{
			Conn c=new Conn();
			ResultSet rs=c.s.executeQuery("select * from customer where username = 'Abhishek28'");
			while(rs.next())
			{
				l11.setText(rs.getString("username"));
				l12.setText(rs.getString("id"));
				l13.setText(rs.getString("number"));
				l14.setText(rs.getString("phone"));
				
			}
		}catch(Exception e)
		{
			}
		
		b1=new JButton("Check Price");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.setBounds(50,470,120,25);
		b1.addActionListener(this);
		add(b1);
		
		b2=new JButton("Book Package");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setBounds(200,470,120,25);
		b2.addActionListener(this);
		add(b2);
		
		b3=new JButton("Back");
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		b3.setBounds(350,470,120,25);
		b3.addActionListener(this);
		add(b3);
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
		JLabel l9=new JLabel(i1);
		l9.setBounds(360, 20, 450, 420);
		add(l9);
	}
	public static void main(String ar[])
	{
		new BookPackage("").setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1){
			String p=c1.getSelectedItem();
			int cost=0;
			if(p.equals("GOLD PACKAGE")){
				cost+=12000;
			}
			else if(p.equals("SILVER PACKAGE"))
			{
				cost+=25000;
			}
			else if(p.equals("BRONZE PACKAGE"))
			{
				cost+=32000;
			}
			int persons=Integer.parseInt(t1.getText());
			cost*=persons;
			
			l15.setText("Rs. "+cost );
		}
		else if(ae.getSource()==b2)
		{
			try{
				Conn c=new Conn();
				c.s.executeUpdate("insert into bookPackage values ('"+l11.getText()+"','"+c1.getSelectedItem()+"','"+t1.getText()+"','"+l12.getText()+"','"+l13.getText()+"','"+l14.getText()+"','"+l15.getText()+"')");
				JOptionPane.showMessageDialog(null, "Package Booked Sucessfully");
				this.setVisible(false);
			}catch(Exception e)
			{
				
			}
		}else if(ae.getSource()==b3)
		{
			this.setVisible(false);
		}
		
	}
	
}
