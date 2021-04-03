import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;


public class CheckPackage extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String username;
	JButton b1,b2,b3;
	CheckPackage(String username){
		this.username=username;
		setBounds(350,185,850,550);
		getContentPane().setBackground(Color.WHITE);
		
		String[] package1=new String[]{"GOLD PACKAGE","6 DAYS and 7 NIGHTS",">    Airport Assitance",">    Half Day City Tour",
				">    Daily Buffet",">    Welcome Day on Arrival",">    Full Day 3 Island Cruise","BOOK NOW","Rs.  12000/Per Person","package1.jpg"};
		
		String[] package2=new String[]{"SILVER PACKAGE","5 DAYS and 5 NIGHTS",">    Entrance Free Tickets",">    Meet and Greet at Airport",
				">    Daily Buffet",">    Welcome Drinks on Arrival",">    Full Day 3 Island Cruise","BOOK NOW","Rs.  24000/Per Person","package2.jpg"};
		
		String[] package3=new String[]{"BRONZE PACKAGE","6 DAYS and 5 NIGHTS",">    Return Airfare",">    Free Clubbing",
				">    Stay in 5 Star Hotel",">    BBQ Dinner",">    Full Day 3 Island Cruise","BOOK NOW","Rs.  32000/Per Person","package3.jpg"}; 
		
		JTabbedPane pane=new JTabbedPane();
		
		JPanel p1=createPackage(package1);
		pane.addTab("Package 1", null, p1);
		add(pane,BorderLayout.CENTER);
		b1=new JButton("BOOK NOW");
		b1.setBounds(50, 410, 250, 30);
		b1.setBorder(null);
		b1.setFont(new Font("Tahoma",Font.PLAIN,30));
		b1.setForeground(Color.RED);
		b1.addActionListener(this);
		p1.add(b1);
		
		JPanel p2=createPackage(package2);
		pane.addTab("Package 2", null, p2);
		add(pane,BorderLayout.CENTER);
		b2=new JButton("BOOK NOW");
		b2.setBounds(50, 410, 250, 30);
		b2.setBorder(null);
		b2.setFont(new Font("Tahoma",Font.PLAIN,30));
		b2.setForeground(Color.RED);
		b2.addActionListener(this);
		p2.add(b2);
		
		JPanel p3=createPackage(package3);
		pane.addTab("Package 3", null, p3);
		add(pane,BorderLayout.CENTER);
		b3=new JButton("BOOK NOW");
		b3.setBounds(50, 410, 250, 30);
		b3.setBorder(null);
		b3.setFont(new Font("Tahoma",Font.PLAIN,30));
		b3.setForeground(Color.RED);
		b3.addActionListener(this);
		p3.add(b3);
	}
	private JPanel createPackage(String pack[]) {
		JPanel p1= new JPanel();
		p1.setLayout(null);
		p1.setBackground(Color.WHITE);
		
		JLabel l1=new JLabel(pack[0]);
		l1.setBounds(50,25, 300, 30);
		l1.setFont(new Font("Tahoma",Font.PLAIN,30));
		p1.add(l1);
		
		JLabel l2=new JLabel(pack[1]);
		l2.setBounds(30, 100, 300, 30);
		l2.setFont(new Font("Tahoma",Font.PLAIN,20));
		l2.setForeground(Color.RED);
		p1.add(l2);
		
		JLabel l3=new JLabel(pack[2]);
		l3.setBounds(50, 150, 300, 30);
		l3.setFont(new Font("Tahoma",Font.PLAIN,20));
		l3.setForeground(Color.BLUE);
		p1.add(l3);
		
		JLabel l4=new JLabel(pack[3]);
		l4.setBounds(50, 200, 300, 30);
		l4.setFont(new Font("Tahoma",Font.PLAIN,20));
		l4.setForeground(Color.BLUE);
		p1.add(l4);
		
		JLabel l5=new JLabel(pack[4]);
		l5.setBounds(50, 250, 300, 30);
		l5.setFont(new Font("Tahoma",Font.PLAIN,20));
		l5.setForeground(Color.BLUE);
		p1.add(l5);
		
		JLabel l6=new JLabel(pack[5]);
		l6.setBounds(50,300, 300, 30);
		l6.setFont(new Font("Tahoma",Font.PLAIN,20));
		l6.setForeground(Color.BLUE);
		p1.add(l6);
		
		JLabel l7=new JLabel(pack[6]);
		l7.setBounds(50, 350, 300, 30);
		l7.setFont(new Font("Tahoma",Font.PLAIN,20));
		l7.setForeground(Color.BLUE);
		p1.add(l7);
		
		JLabel l9=new JLabel(pack[8]);
		l9.setBounds(500,385, 300, 100);
		l9.setFont(new Font("Tahoma",Font.PLAIN,30));
		l9.setForeground(Color.RED);
		p1.add(l9);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[9]));
		JLabel l10=new JLabel(i1);
		l10.setBounds(320, 15, 500, 300);
		p1.add(l10);
		
		return p1;
	}
	public static void main(String ar[])
	{
		new CheckPackage("").setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		try{
			if(ae.getSource()==b1)
			{
				this.setVisible(false);
				new BookPackage(username).setVisible(true);
			}
			else if(ae.getSource()==b2)
			{
				this.setVisible(false);
				new BookPackage(username).setVisible(true);
			}
			else if(ae.getSource()==b3)
			{
				this.setVisible(false);
				new BookPackage(username).setVisible(true);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
