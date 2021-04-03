import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Payment extends JFrame implements ActionListener{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton pay1,pay2;
	public Payment(){
        
        setLayout(null);
        setBounds(350,185,850,550);
        
        JLabel label=new JLabel("Pay using ");
        label.setFont(new Font("Raleway", Font.BOLD, 40));
        label.setBounds(50, 20, 350, 45);
        add(label);
        
        JLabel label1=new JLabel("Paytm ");
        label1.setFont(new Font("Raleway", Font.BOLD, 40));
        label1.setBounds(150, 110, 150, 45);
        add(label1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm1.png"));
        Image i2 = i1.getImage().getScaledInstance(400, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l4 = new JLabel(i3);
        l4.setBounds(20, 210, 400, 200);
        add(l4);
        
        JLabel label2=new JLabel("PhonePay ");
        label2.setFont(new Font("Raleway", Font.BOLD, 40));
        label2.setBounds(500, 110, 250, 45);
        add(label2);
        
        ImageIcon i8 = new ImageIcon(ClassLoader.getSystemResource("icons/phonepay.jpg"));
        Image i9 = i8.getImage().getScaledInstance(400, 200, Image.SCALE_DEFAULT);
        ImageIcon i10 = new ImageIcon(i9);
        JLabel l5 = new JLabel(i10);
        l5.setBounds(450, 210, 400, 200);
        add(l5);
        
        pay1 = new JButton("Pay");
        pay1.setBounds(150, 450, 150, 30);
        pay1.setBackground(Color.BLUE);
        pay1.setForeground(Color.WHITE);
        pay1.addActionListener(this);
        add(pay1);
        
        pay2 = new JButton("Pay");
        pay2.setBounds(550, 450, 150, 30);
        pay2.setBackground(Color.BLUE);
        pay2.setForeground(Color.WHITE);
        pay2.addActionListener(this);
        add(pay2);
        
        JButton back=new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        back.setBounds(740, 20, 80, 30);
        back.setBackground(Color.RED);
        back.setForeground(Color.WHITE);
        add(back);
        
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);

    }

    public static void main(String[] args){
        new Payment().setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()== pay1)
		{
			this.setVisible(false);
			new Paytm().setVisible(true);
		}
		else if(ae.getSource()==pay2)
		{
			this.setVisible(false);
			new Phonepay().setVisible(true);
		}
		
	}
}
    