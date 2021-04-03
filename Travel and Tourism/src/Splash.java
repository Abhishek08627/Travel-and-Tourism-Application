import javax.swing.*;
public class Splash {
	public static void main(String ar[])
	{
		SplashFrame frame =new SplashFrame();
		frame.setVisible(true);
		int x=1;
		for(int i=1;i<=625;i+=5,x+=4)
		{
			frame.setLocation(700 - ((x+i)/(2)), 275-(i/(3)));
			frame.setSize(x+i,i);
			try{
				Thread.sleep(10);
			}catch(Exception e){
				
			}
		}
		
		frame.setVisible(true);
	}
}
class SplashFrame extends JFrame implements Runnable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Thread t1;
	SplashFrame(){
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
		JLabel l1=new JLabel(i1);
		add(l1);
		setUndecorated(true);
		t1=new Thread(this);
		t1.start();
		
	}
	public void run(){
		try{
			Thread.sleep(7000);
			this.setVisible(false);
			
			new Login().setVisible(true);
		}catch(Exception e){
			
		}
	}
}
