import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class Login extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton b1,b2,b3;
	JTextField t1;
	JPasswordField t2;
	Login(){
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		setBounds(225,150,900,475);
		JPanel p1=new JPanel();
		p1.setBackground(new Color(131,193,233));
		p1.setBounds(0, 0, 400, 475);
		p1.setLayout(null);
		
		add(p1);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
		Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l1=new JLabel(i3);
		l1.setBounds(100,120,200,200);
		p1.add(l1);
		
		JPanel p2=new JPanel();
		p2.setLayout(null);
		p2.setBounds(400,30,450,400);
		add(p2);
		
		JLabel l2 =new JLabel("Username");
		l2.setBounds(60,40,150,25);
		l2.setFont(new Font("SAN_SERIF",Font.PLAIN,25));
		p2.add(l2);
		
		t1=new JTextField();
		t1.setBounds(60,90,350,35);
		t1.setBorder(BorderFactory.createEmptyBorder());
		p2.add(t1);
		
		JLabel l3 =new JLabel("Password");
		l3.setBounds(60,160,150,25);
		l3.setFont(new Font("SAN_SERIF",Font.PLAIN,25));
		p2.add(l3);
		
		t2=new JPasswordField();
		t2.setBounds(60,210,350,35);
		t2.setBorder(BorderFactory.createEmptyBorder());
		p2.add(t2);
		
		b1=new JButton("Login");
		b1.setBounds(60,285,150,40);
		b1.setBackground(new Color(133,192,233));
		b1.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		b1.setForeground(Color.WHITE);
		b1.setBorder(BorderFactory.createEmptyBorder());
		b1.addActionListener(this);
		p2.add(b1);
		
		b2=new JButton("SignUp");
		b2.setBounds(260,285,150,40);
		b2.setForeground(new Color(133,192,233));
		b2.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		b2.setBackground(Color.WHITE);
		b2.setBorder(new LineBorder(new Color(133,192,233)));
		b2.addActionListener(this);
		p2.add(b2);
		
		b3=new JButton("Forget Password");
		b3.setBounds(100,345,200,40);
		b3.setForeground(new Color(133,192,233));
		b3.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		b3.setBackground(Color.WHITE);
		b3.setBorder(new LineBorder(new Color(133,192,233)));
		b3.addActionListener(this);
		p2.add(b3);
		
		JLabel l4=new JLabel("Trouble in Login....");
		l4.setForeground(Color.RED);
		l4.setBounds(310,355,100,20);
		p2.add(l4);
		
		
		//setUndecorated(true);
		setVisible(true);
	}
	public static void main(String ar[])
	{
		new Login();
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b1)
		{
			try{
				String username=t1.getText();
				@SuppressWarnings("deprecation")
				String password=t2.getText();
				String sql="select * from account where username= '"+username+"'AND password='"+password+"'";
				Conn c=new Conn();
				ResultSet rs=c.s.executeQuery(sql);
				if(rs.next())
				{
					this.setVisible(false);
					new Loading(username).setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Invalid Login");
				}
			}catch(Exception e){
				
			}
		}
		else if(ae.getSource() == b2)
		{
			this.setVisible(false);
			new Signup().setVisible(true);
			
		}
		else if(ae.getSource() == b3)
		{
			this.setVisible(false);
			new ForgotPassword().setVisible(true);
		}
		
	}
}
