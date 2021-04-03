import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;


public class ForgotPassword extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3;
	ForgotPassword(){
		setBounds(225,150,900,450);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JPanel p=new JPanel();
		p.setLayout(null);
		p.setBounds(0,0,550,410);
		add(p);
		
		JLabel l1=new JLabel("Username");
		l1.setFont(new Font("Tahoma",Font.BOLD,15));
		l1.setBounds(20,30,100,25);
		p.add(l1);
		
		t1=new JTextField();
		t1.setBounds(200,30,225,25);
		t1.setBorder(BorderFactory.createEmptyBorder());
		p.add(t1);
		
		b1=new JButton("Search");
		b1.setBackground(Color.GRAY);
		b1.setForeground(Color.WHITE);
		b1.setBounds(440,30,100,25);
		b1.addActionListener(this);
		p.add(b1);
		
		
		JLabel l2=new JLabel("Name");
		l2.setFont(new Font("Tahoma",Font.BOLD,15));
		l2.setBounds(20,85,100,25);
		p.add(l2);
		
		t2=new JTextField();
		t2.setBounds(200,85,225,25);
		t2.setBorder(BorderFactory.createEmptyBorder());
		p.add(t2);
		
		JLabel l3=new JLabel("Your Security Question");
		l3.setFont(new Font("Tahoma",Font.BOLD,15));
		l3.setBounds(20,140,175,25);
		p.add(l3);
		
		t3=new JTextField();
		t3.setBounds(200,140,225,25);
		t3.setBorder(BorderFactory.createEmptyBorder());
		p.add(t3);
		
		JLabel l4=new JLabel("Answer");
		l4.setFont(new Font("Tahoma",Font.BOLD,15));
		l4.setBounds(20,195,100,25);
		p.add(l4);
		
		t4=new JTextField();
		t4.setBounds(200,195,225,25);
		t4.setBorder(BorderFactory.createEmptyBorder());
		p.add(t4);
		
		b2=new JButton("Retrieve");
		b2.setBackground(Color.GRAY);
		b2.setForeground(Color.WHITE);
		b2.setBounds(440,195,100,25);
		b2.addActionListener(this);
		p.add(b2);
		
		JLabel l5=new JLabel("Password");
		l5.setFont(new Font("Tahoma",Font.BOLD,15));
		l5.setBounds(20,250,100,25);
		p.add(l5);
		
		t5=new JTextField();
		t5.setBounds(200,250,225,25);
		t5.setBorder(BorderFactory.createEmptyBorder());
		p.add(t5);
		
		b3=new JButton("Back");
		b3.setBackground(Color.GRAY);
		b3.setForeground(Color.WHITE);
		b3.setBounds(150,315,100,25);
		b3.addActionListener(this);
		p.add(b3);
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
		Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l6=new JLabel(i3);
		l6.setBounds(550,0,350,410);
		add(l6);
		
	}
	public static void main(String ar[])
	{
		new ForgotPassword().setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		Conn c=new Conn();
		if(ae.getSource()==b1){
			try{
			String sql="select * from account where username = '"+t1.getText()+"'";
			ResultSet rs=c.s.executeQuery(sql);
			while(rs.next())
			{
				t2.setText(rs.getString("name"));
				t3.setText(rs.getString("security"));
			}
			}catch(Exception e){
				
			}
		}
		else if(ae.getSource()==b2){
			try{
				String sql="select * from account where answer = '"+t4.getText()+"' AND username = '"+t1.getText()+"'";
				ResultSet rs=c.s.executeQuery(sql);
				while(rs.next())
				{
					t5.setText(rs.getString("password"));
					t5.setForeground(Color.BLUE);
				}
				}catch(Exception e){
					
				}
		}
		else if(ae.getSource()==b3){
			this.setVisible(false);
			new Login().setVisible(true);
		}
		
	}
}
