package GPACalculator.welcomepanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import GPACalculator.frames.MainFrame;

public class WelcomePanel extends JPanel {

	public WelcomePanel(){
		Font f = new Font("serif", Font.PLAIN, 24);
		
		//Initialize tabbed pane
		//tabbedPane = new JTabbedPane();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		//Set tabbed pane font
		this.setFont(f);
		JButton btn1 = new JButton();
		btn1.setText("Welcome");
		btn1.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                MainFrame.showStudentPanel();
            }
        });  
		this.add(btn1);
	}
}
