import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;


public class Phonepay extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Phonepay(){
		JEditorPane j = new JEditorPane();
        j.setEditable(false);   

        try {
            j.setPage("https://www.bhimupi.org.in");
        }catch (Exception e) {
            j.setContentType("text/html");
            j.setText("<html>Could not load</html>");
        } 

        JScrollPane scrollPane = new JScrollPane(j);     
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(scrollPane);
        setPreferredSize(new Dimension(850,550));
		
        JButton back=new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Payment().setVisible(true);
            }
        });
        back.setBounds(740, 20, 80, 30);
        j.add(back);
        
        setSize(850,850);
        setLocation(350,185);
        setVisible(true);
	}
	
public static void main(String ar[])
{
	new Phonepay().setVisible(true);
	}

@Override
public void actionPerformed(ActionEvent arg0) {
	
}
}
