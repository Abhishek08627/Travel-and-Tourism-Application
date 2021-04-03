import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;


public class ViewCustomer extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel l12,l13,l14,l15,l16,l17,l18,l19,l20;
	JButton b2;
	ViewCustomer(String username){
		setBounds(350,185,850,550);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel l1=new JLabel("Username : ");
		l1.setBounds(30,50,150,25);
		add(l1);
		
		l12=new JLabel();
		l12.setBounds(220, 50, 150, 25);
		add(l12);
		
		JLabel l2=new JLabel("ID  : ");
		l2.setBounds(30,95,150,25);
		add(l2);
		
		l13=new JLabel();
		l13.setBounds(220, 95, 150, 25);
		add(l13);
		
		JLabel l3=new JLabel("Number : ");
		l3.setBounds(30,140,150,25);
		add(l3);
		
		l14=new JLabel();
		l14.setBounds(220, 140, 150, 25);
		add(l14);
		
		JLabel l4=new JLabel("Name : ");
		l4.setBounds(30,185,150,25);
		add(l4);
		
		l15=new JLabel();
		l15.setBounds(220, 185, 150, 25);
		add(l15);
		
		JLabel l5=new JLabel("Gender : ");
		l5.setBounds(30,230,150,25);
		add(l5);
		
		l16=new JLabel();
		l16.setBounds(220, 230, 150, 25);
		add(l16);
		
		JLabel l6=new JLabel("Country : ");
		l6.setBounds(400,50,150,25);
		add(l6);
		
		l17=new JLabel();
		l17.setBounds(590, 50, 150, 25);
		add(l17);
		
		JLabel l7=new JLabel("Address : ");
		l7.setBounds(400,95,150,25);
		add(l7);
		
		l18=new JLabel();
		l18.setBounds(590, 95, 150, 25);
		add(l18);
		
		JLabel l8=new JLabel("Phone No. : ");
		l8.setBounds(400,140,150,25);
		add(l8);
		
		l19=new JLabel();
		l19.setBounds(590, 140, 150, 25);
		add(l19);
		
		JLabel l9=new JLabel("Email : ");
		l9.setBounds(400,185,150,25);
		add(l9);
		
		l20=new JLabel();
		l20.setBounds(590,185, 150, 25);
		add(l20);
		
		b2=new JButton("Back");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.setBounds(325,260, 100, 25);
		b2.addActionListener(this);
		add(b2);
		
		JLabel l11=new JLabel( "CUSTOMER DETAILS");
		l11.setBounds(70, 0, 300, 25);
		l11.setFont(new Font("Tahoma",Font.PLAIN,20));
		l11.setForeground(Color.BLUE);
		add(l11);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
		Image i2=i1.getImage().getScaledInstance(800, 400, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l10=new JLabel(i3);
		l10.setBounds(20, 300, 800	, 340);
		add(l10);
		
		try{
			Conn c= new Conn();
			ResultSet rs=c.s.executeQuery("select * from customer where username = '"+username+"'");
			while(rs.next()){
				l12.setText(rs.getString("username"));
				l14.setText(rs.getString("number"));
				l16.setText(rs.getString("gender"));
				l17.setText(rs.getString("country"));
				l18.setText(rs.getString("address"));
				
				l19.setText(rs.getString("phone"));
				l20.setText(rs.getString("email"));
				l13.setText(rs.getString("id"));
				
				l15.setText(rs.getString("name"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static void main(String ar[])
	{
		new ViewCustomer("").setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b2)
		{
			this.setVisible(false);
		}
	}
}
