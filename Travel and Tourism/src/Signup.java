import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;


public class Signup extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton b1,b2;
	JTextField t1,t2,t3,t4;
	Choice c1;
	Signup(){
		setLayout(null);
		setBounds(225,150,900,450);
		getContentPane().setBackground(Color.WHITE);
		
		
		JPanel p1=new JPanel();
		p1.setBackground(new Color(133,193,233));
		p1.setBounds(0,0,500,475);
		p1.setLayout(null);
		add(p1);
		
		JLabel l1=new JLabel("Username");
		l1.setFont(new Font("Tahoma",Font.BOLD,15));
		l1.setBounds(35,30,100,25);
		p1.add(l1);
		
		t1=new JTextField();
		t1.setBounds(225,30,225,25);
		t1.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t1);
		
		JLabel l2=new JLabel("Name");
		l2.setFont(new Font("Tahoma",Font.BOLD,15));
		l2.setBounds(35,75,100,25);
		p1.add(l2);
		
		t2=new JTextField();
		t2.setBounds(225,75,225,25);
		t2.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t2);
		
		JLabel l3=new JLabel("Password");
		l3.setFont(new Font("Tahoma",Font.BOLD,15));
		l3.setBounds(35,120,100,25);
		p1.add(l3);
		
		t3=new JPasswordField();
		t3.setBounds(225,120,225,25);
		t3.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t3);
		
		JLabel l4=new JLabel("Your Security Question");
		l4.setFont(new Font("Tahoma",Font.BOLD,15));
		l4.setBounds(35,170,175,25);
		p1.add(l4);
		
		c1=new Choice();
		c1.add("Your Birth Place?");
		c1.add("Your Lucky Number?");
		c1.add("Your First School?");
		c1.add("Your Mother Name?");
		c1.setBounds(225,170,225,30);
		p1.add(c1);
		
		JLabel l5=new JLabel("Answer");
		l5.setFont(new Font("Tahoma",Font.BOLD,15));
		l5.setBounds(35,220,100,25);
		p1.add(l5);
		
		t4=new JTextField();
		t4.setBounds(225,220,225,25);
		t4.setBorder(BorderFactory.createEmptyBorder());
		p1.add(t4);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
		Image i2=i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l6=new JLabel(i3);
		l6.setBounds(575,70,250,250);
		add(l6);
		
		b1=new JButton("Create");
		b1.setBounds(100, 300, 100, 35);
		b1.setForeground(new Color(133,192,233));
		b1.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		b1.setBackground(Color.WHITE);
		b1.setBorder(new LineBorder(new Color(133,192,233)));
		b1.addActionListener(this);
		p1.add(b1);
		
		b2=new JButton("Back");
		b2.setBounds(250, 300, 100, 35);
		b2.setForeground(new Color(133,192,233));
		b2.setFont(new Font("SAN_SERIF",Font.BOLD,20));
		b2.setBackground(Color.WHITE);
		b2.setBorder(new LineBorder(new Color(133,192,233)));
		b2.addActionListener(this);
		p1.add(b2);
		
		
	}
	public static void main(String ar[])
	{
		new Signup().setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1)
		{
			String username = t1.getText();
			String name = t2.getText();
			String password = t3.getText();
			String security = c1.getSelectedItem();
			String answer=t4.getText();
			
			String query="insert into account values('"+username+"','"+name+"','"+password+"','"+security+"','"+answer+"')";
			try{
				Conn c=new Conn();
				c.s.executeUpdate(query);
				JOptionPane .showMessageDialog(null, "Account Created Sucessfully");
				this.setVisible(false);
				new Login().setVisible(true);
			}
			catch(Exception e){
				
			}
		}
		else if(ae.getSource()==b2)
		{
			new Login().setVisible(true);
			this.setVisible(false);
		}
		
	}
}
