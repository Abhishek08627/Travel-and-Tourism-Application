import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;


public class Dashboard extends JFrame implements ActionListener {
	/**
	 * 
	 */
	String username;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	private static final long serialVersionUID = 1L;
	Dashboard(String username){
		this.username=username;
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		JPanel p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(0, 0, 1400, 80);
		p1.setBackground(new Color(0,0,102));
		add(p1);
		
		JLabel l3=new JLabel("Dashboard");
		l3.setFont(new Font("Tahoma",Font.BOLD,30));
		l3.setForeground(Color.WHITE);
		l3.setBounds(90, 20, 300, 40);
		p1.add(l3);
		
		JPanel p2=new JPanel();
		p2.setLayout(null);
		p2.setBounds(0, 80, 225, 700);
		p2.setBackground(new Color(188,223,235));
		add(p2);
		
		b1=new JButton("Add Personal Details");
		b1.setBackground(new Color(0,0,102));
		b1.setFont(new Font("Tahoma",Font.PLAIN,15));
		b1.setForeground(Color.WHITE);
		b1.setBorder(BorderFactory.createEmptyBorder());
		b1.setBounds(0, 0, 225, 50);
		b1.addActionListener(this);
		p2.add(b1);
		
		b2=new JButton("Update Personal Details");
		b2.setBackground(new Color(0,0,102));
		b2.setFont(new Font("Tahoma",Font.PLAIN,15));
		b2.setForeground(Color.WHITE);
		b2.setBorder(BorderFactory.createEmptyBorder());
		b2.setBounds(0, 55, 225, 50);
		b2.addActionListener(this);
		p2.add(b2);
		
		b3=new JButton("View Details");
		b3.setBackground(new Color(0,0,102));
		b3.setFont(new Font("Tahoma",Font.PLAIN,15));
		b3.setForeground(Color.WHITE);
		b3.setBorder(BorderFactory.createEmptyBorder());
		b3.setBounds(0, 110, 225, 50);
		b3.addActionListener(this);
		p2.add(b3);
		
		b4=new JButton("Delete Personal Details");
		b4.setBackground(new Color(0,0,102));
		b4.setFont(new Font("Tahoma",Font.PLAIN,15));
		b4.setForeground(Color.WHITE);
		b4.setBorder(BorderFactory.createEmptyBorder());
		b4.setBounds(0, 165, 225, 50);
		b4.addActionListener(this);
		p2.add(b4);
		
		b5=new JButton("Check Package");
		b5.setBackground(new Color(0,0,102));
		b5.setFont(new Font("Tahoma",Font.PLAIN,15));
		b5.setForeground(Color.WHITE);
		b5.setBorder(BorderFactory.createEmptyBorder());
		b5.setBounds(0, 220, 225, 50);
		b5.addActionListener(this);
		p2.add(b5);
		
		b6=new JButton("View Booked Package");
		b6.setBackground(new Color(0,0,102));
		b6.setFont(new Font("Tahoma",Font.PLAIN,15));
		b6.setForeground(Color.WHITE);
		b6.setBorder(BorderFactory.createEmptyBorder());
		b6.setBounds(0, 275, 225,50);
		b6.addActionListener(this);
		p2.add(b6);
		
		b7=new JButton("View Hotels");
		b7.setBackground(new Color(0,0,102));
		b7.setFont(new Font("Tahoma",Font.PLAIN,15));
		b7.setForeground(Color.WHITE);
		b7.setBorder(BorderFactory.createEmptyBorder());
		b7.setBounds(0, 330, 225, 50);
		b7.addActionListener(this);
		p2.add(b7);
		
		b8=new JButton("Book Hotel");
		b8.setBackground(new Color(0,0,102));
		b8.setFont(new Font("Tahoma",Font.PLAIN,15));
		b8.setForeground(Color.WHITE);
		b8.setBorder(BorderFactory.createEmptyBorder());
		b8.setBounds(0,385, 225, 50);
		b8.addActionListener(this);
		p2.add(b8);
		
		b9=new JButton("Destinations");
		b9.setBackground(new Color(0,0,102));
		b9.setFont(new Font("Tahoma",Font.PLAIN,15));
		b9.setForeground(Color.WHITE);
		b9.setBorder(BorderFactory.createEmptyBorder());
		b9.setBounds(0,440, 225, 50);
		b9.addActionListener(this);
		p2.add(b9);
		
		b10=new JButton("Payment");
		b10.setBackground(new Color(0,0,102));
		b10.setFont(new Font("Tahoma",Font.PLAIN,15));
		b10.setForeground(Color.WHITE);
		b10.setBorder(BorderFactory.createEmptyBorder());
		b10.setBounds(0, 495, 225, 50);
		b10.addActionListener(this);
		p2.add(b10);
		
		b11=new JButton("About");
		b11.setBackground(new Color(0,0,102));
		b11.setFont(new Font("Tahoma",Font.PLAIN,15));
		b11.setForeground(Color.WHITE);
		b11.setBorder(BorderFactory.createEmptyBorder());
		b11.setBounds(0, 550, 225, 50);
		b11.addActionListener(this);
		p2.add(b11);
		
		ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.jpg"));
		Image i5=i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
		ImageIcon i6=new ImageIcon(i5);
		JLabel l2=new JLabel(i6);
		l2.setBounds(5	, 	5, 70, 70);
		p1.add(l2);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard1.jpg"));
		Image i2=i1.getImage().getScaledInstance(1400, 700, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel l1=new JLabel(i3);
		l1.setBounds(0, 0, 1400, 700);
		add(l1);
		
		JLabel l4 = new JLabel("Travel and Tourism Application");
		l4.setBounds(450, 85, 800, 80);
		l4.setForeground(Color.WHITE);
		l4.setFont(new Font("Tahoma",Font.PLAIN,50));
		l1.add(l4);
		
		
	}
	public static void main(String ar[])
	{
		new Dashboard("").setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1)
		{
			new AddCustomer(username).setVisible(true);
		}else if(ae.getSource()==b2)
		{
			new UpdateCustomer(username).setVisible(true);
		}
		else if(ae.getSource()==b3){
			new  ViewCustomer(username).setVisible(true);
		}
		else if(ae.getSource()==b4){
			try {
				new  DeleteCustomer(username).setVisible(true);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(ae.getSource()==b5){
			new CheckPackage(username).setVisible(true);
		}
		else if(ae.getSource()==b6)
		{
			new ViewPackage(username).setVisible(true);
		}
		else if(ae.getSource()==b7)
		{
			new CheckHotels().setVisible(true);
		}
		else if(ae.getSource()==b8)
		{
			new BookHotel(username).setVisible(true);
		}
		else if(ae.getSource()==b9)
		{
			new Destinations().setVisible(true);
		}
		else if(ae.getSource()==b10)
		{
			new Payment().setVisible(true);
		}
		else if(ae.getSource()==b11)
		{
			new About().setVisible(true);
		}
		
	}
}
