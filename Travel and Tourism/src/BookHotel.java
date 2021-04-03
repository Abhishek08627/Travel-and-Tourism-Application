import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;
public class BookHotel extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Choice c1,c2,c3;
	JLabel l11,l12,l13,l14,l15;
	JButton b1,b2,b3;
	JTextField t1,t2;
	BookHotel(String username){
		setBounds(350,185,850,550);
		setLayout(null);
		getContentPane().setBackground(Color.WHITE);
		
		JLabel l1=new JLabel("BOOK HOTEL");
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
		try{
			Conn c=new Conn();
			ResultSet rs=c.s.executeQuery("select * from hotel");
			while(rs.next())
			{
				c1.add(rs.getString("name"));
			}
		}catch(Exception e)
		{
			}
//		c1.add("Taj Rambagh Palace");
//		c1.add("Taj Mahal Palace");
//		c1.add("Hotel Gajner Palace");
//		c1.add("Ferrnhills Royale Palace");
//		c1.add("Hotel Taj Hari Mahal");
//		c1.add("Taj Falaknuma Palace");
//		c1.add("Taj Lake Palace");
//		c1.add("The Imperial Hotel");
//		c1.add("The Oberoi Grand");
		c1.setBounds(180,155,150,30);
		add(c1);
		

		JLabel l4=new JLabel("Total Persons");
		l4.setBounds(35,200, 100, 30);
		l4.setFont(new Font("Tahoma",Font.PLAIN,15));
		add(l4);
		
		t1=new JTextField("1");
		t1.setBounds(180, 200, 150, 25);
		add(t1);
		
		JLabel l5=new JLabel("No. of Days : ");
		l5.setBounds(35,250, 100, 30);
		l5.setFont(new Font("Tahoma",Font.PLAIN,15));
		add(l5);
		
		t2=new JTextField("1");
		t2.setBounds(180, 250, 150, 25);
		add(t2);
		
		
		JLabel l6=new JLabel("AC/Non-AC : ");
		l6.setBounds(35,300, 100, 30);
		l6.setFont(new Font("Tahoma",Font.PLAIN,15));
		add(l6);
		
		
		c2=new Choice();
		c2.add("AC");
		c2.add("Non-AC");
		c2.setBounds(180,300, 150, 30);
		add(c2);
		
		JLabel l7=new JLabel("Food Included");
		l7.setBounds(35,350, 100, 30);
		l7.setFont(new Font("Tahoma",Font.PLAIN,15));
		add(l7);
		
		c3=new Choice();
		c3.add("Yes");
		c3.add("No");
		c3.setBounds(180,350, 150, 30);
		add(c3);
		
		JLabel l8=new JLabel("Total Price : ");
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
			ResultSet rs=c.s.executeQuery("select * from customer where username = '"+username+"'");
			while(rs.next())
			{
				l11.setText(rs.getString("username"));
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
		
		b2=new JButton("Book Hotel");
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
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
		JLabel l9=new JLabel(i1);
		l9.setBounds(360, 20, 450, 420);
		add(l9);
	}
	public static void main(String ar[])
	{
		new BookHotel("").setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1)
		try{
			{
				Conn c=new Conn();
				ResultSet rs=c.s.executeQuery("select * from hotel where name='"+c1.getSelectedItem()+"'");
				if(rs.next()){
                    
                    int cost = Integer.parseInt(rs.getString("cost_per_day"));
                    int food = Integer.parseInt(rs.getString("food_charges"));
                    int ac = Integer.parseInt(rs.getString("ac_charges"));
                    
                    int persons = Integer.parseInt(t1.getText());
                    int days = Integer.parseInt(t2.getText());
                    
                    String acprice = c2.getSelectedItem();
                    String foodprice = c3.getSelectedItem();
                    
                    
                    if(persons * days > 0) {
                        int total = 0;
                        total += acprice.equals("AC") ? ac : 0;
                        total += foodprice.equals("Yes") ? food : 0;
                        total += cost;
                        total = total * persons * days;
                        l15.setText("Rs "+total);
                    }
                    
                    
                }
                
				
				
			}
		}catch(Exception e){
			
		}
		else if(ae.getSource()==b2)
		{
			try{
				Conn c=new Conn();
				c.s.executeUpdate("insert into bookHotel values ('"+l11.getText()+"','"+c1.getSelectedItem()+"','"+t1.getText()+"','"+t2.getText()+"','"+c2.getSelectedItem()+"','"+c3.getSelectedItem()+"','"+l15.getText()+"')");
				JOptionPane.showMessageDialog(null, "Hotel Booked Sucessfully");
				this.setVisible(false);
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}else if(ae.getSource()==b3)
		{
			this.setVisible(false);
		}
		
	}
	
}
