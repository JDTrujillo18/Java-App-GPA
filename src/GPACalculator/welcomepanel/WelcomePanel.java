package GPACalculator.welcomepanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import GPACalculator.frames.MainFrame;

public class WelcomePanel extends JPanel {

	public WelcomePanel(){
		Font f = new Font("serif", Font.PLAIN, 36);
		Font f2 = new Font("serif", Font.PLAIN, 48);
		//Initialize tabbed pane
		//tabbedPane = new JTabbedPane();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		//Set tabbed pane fontj
		this.setFont(f);
		JLabel lblWelcome = new JLabel("GPA Calculator");
		lblWelcome.setFont(f2);
		JButton btn1 = new JButton();
		btn1.setText("Begin");
		btn1.setFont(f2);
		btn1.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                MainFrame.showStudentPanel();
            }
        });  
		this.add(lblWelcome);
		this.add(btn1);
	}
}
