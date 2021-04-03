import java.awt.*;

import javax.swing.*;


public class Loading extends JFrame implements Runnable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JProgressBar p;
	Thread t;
	 String username;
	
	public void run(){
		try{
			for(int i=1;i<101;i++)
			{
				int m=p.getMaximum();
				int n=p.getValue();
				if(n<m)
				{
					p.setValue(p.getValue()+i);
				}
				else{
					i=101;
					setVisible(false);
					new Dashboard(username).setVisible(true);			
					}
				Thread.sleep(50);
			}
			
		}catch(Exception e){
			
		}
		
	}
	
	Loading(String user){
		username=user;
		t=new Thread(this);
		setBounds(225,150,900,450);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel l1=new JLabel("Travel and Tourism Application");
		l1.setBounds(100, 25, 750, 60);
		l1.setFont(new Font("Railway",Font.BOLD,45));
		l1.setForeground(Color.BLUE);
		add(l1);
		
		p=new JProgressBar();
		p.setStringPainted(true);
		p.setBounds(285,125,300,25);
		add(p);
		
		JLabel l2=new JLabel("Please Wait....");
		l2.setBounds(365, 150, 150, 50);
		l2.setFont(new Font("Tahoma",Font.BOLD,20));
		l2.setForeground(Color.RED);
		add(l2);
		
		JLabel l3=new JLabel("Welcome "+username);
		l3.setBounds(40, 300, 250, 100);
		l3.setFont(new Font("Railway",Font.BOLD,25));
		l3.setForeground(Color.RED);
		add(l3);
		
		t.start();
	}
	

	public static void main(String ar[])
	{
		new Loading("").setVisible(true);
	}
}
