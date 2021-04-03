import java.awt.*;
import java.sql.*;	

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class DeleteCustomer extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
        Choice c1;
       public static void main(String[] args) throws SQLException {
			new DeleteCustomer("").setVisible(true);
		}

	public DeleteCustomer(String username) throws SQLException {
		
		
		
		setBounds(350,185,850,550);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
		JLabel heading =new JLabel("DELETE CUSTOMER DETAILS");
		heading.setBounds(100, 10, 300, 30);
		heading.setFont(new Font("Tahoma",Font.PLAIN,20));
		add(heading);
		
		JLabel l1=new JLabel("Username : ");
		l1.setBounds(50, 80, 70, 30);
		add(l1);
		
		JLabel l11=new JLabel();
		l11.setBounds(250, 80, 150, 30);
		add(l11);
		
		JLabel l2=new JLabel("ID : ");
		l2.setBounds(50, 120, 70, 30);
		add(l2);
		
		JLabel l12=new JLabel();
		l12.setBounds(250, 120, 150, 30);
		add(l12);
		
		JLabel l3=new JLabel("Number : ");
		l3.setBounds(50, 170, 150, 30);
		add(l3);
		
		JLabel l13=new JLabel();
		l13.setBounds(250, 170, 150, 30);
		add(l13);
		
		JLabel l4=new JLabel("Name : ");
		l4.setBounds(50, 220, 70, 30);
		add(l4);
		
		JLabel l15=new JLabel();
		l15.setBounds(250, 220, 150, 30);
		add(l15);
		
		JLabel l6=new JLabel("Gender : ");
		l6.setBounds(50, 270, 70, 30);
		add(l6);
		
		JLabel l16=new JLabel();
		l16.setBounds(250, 270, 150, 30);
		add(l16);
		
		JLabel l7=new JLabel("Country : ");
		l7.setBounds(50, 320, 70, 30);
		add(l7);
		
		JLabel l17=new JLabel();
		l17.setBounds(250, 320, 150, 30);
		add(l17);
		
		JLabel l8=new JLabel("address : ");
		l8.setBounds(50, 370, 70, 30);
		add(l8);
		
		JLabel l18=new JLabel();
		l18.setBounds(250, 370, 150, 30);
		add(l18);
		
		JLabel l9=new JLabel("Phone : ");
		l9.setBounds(50, 410, 70, 30);
		add(l9);
		
		JLabel l19=new JLabel();
		l19.setBounds(250, 410, 150, 30);
		add(l19);
		
		JLabel l21=new JLabel("Email : ");
		l21.setBounds(50, 440, 70, 30);
		add(l21);
		
		JLabel l20=new JLabel();
		l20.setBounds(250, 440, 150, 30);
		add(l20);
				
		
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/delete.png"));
		JLabel l10=new JLabel(i1);
		l10.setBounds(400,50,400,400);
		add(l10);

		
		JButton b1 = new JButton("Check");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            Conn c = new Conn();
                           
                            try{
                                ResultSet rs = c.s.executeQuery("select * from customer where username = 'Abhishek28'");
                                if(rs.next()){
                                    l11.setText(rs.getString(1));
                                    l12.setText(rs.getString(2));
                                    l13.setText(rs.getString(3));
                                    l15.setText(rs.getString(4));
                                    l16.setText(rs.getString(5));
                                    l17.setText(rs.getString(6));
                                    l18.setText(rs.getString(7));
                                    l19.setText(rs.getString(8));
                                    l20.setText(rs.getString(9));
                                    
                                    
                                   
                                }
                            }catch(Exception ee){ }
                        }
		});
		b1.setBounds(400, 90, 80, 22);
                b1.setBackground(Color.BLACK);
                b1.setForeground(Color.WHITE);
		contentPane.add(b1);
		

		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            Conn c = new Conn();
                           
                          
                            try{
	    			
                                
                                
         c.s.executeUpdate("delete from account where username = '"+username+"'");
         c.s.executeUpdate("delete from bookHotel where username = '"+username+"'");
         c.s.executeUpdate("delete from bookpackage where username = '"+username+"'");
         c.s.executeUpdate("delete from customer where username = '"+username+"'");
                                
	    			JOptionPane.showMessageDialog(null, "Customer Detail Deleted Successfully");
                                System.exit(0);
	    		}catch(SQLException e1){
	    			System.out.println(e1.getMessage());
	    		}
		    		catch(NumberFormatException s){
		    			JOptionPane.showMessageDialog(null, "Please enter a valid Number");
			}
			}
		});
		btnNewButton.setBounds(150, 470, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            setVisible(false);
			}
		}); 
		btnExit.setBounds(310, 470, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
	}
}