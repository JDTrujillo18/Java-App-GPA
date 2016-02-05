package GPACalculator.studentpanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;

import GPACalculator.frames.MainFrame;


public class StudentPanel extends JTabbedPane {

	public StudentPanel() {
		//Define Layout of frame
		//super(new GridLayout(1, 1));
				
		//Initialize fonts
		Font f = new Font("serif", Font.PLAIN, 24);
				
		//Initialize tabbed pane
		//tabbedPane = new JTabbedPane();
				
		// The following line enables to use scrolling tabs.
		this.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
				
		//Set tabbed pane font
		this.setFont(f);
				//Initialize panels, add panels and set panel fonts
		//Initialize panel that the Semester 1 tab will hold
		//Call makeTextPanel for this panel
		JComponent pnlSemester1 = new tabStudentPanel("Student 1");
		
		JButton btn1 = new JButton();
		btn1.setText("Click me");
		btn1.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                MainFrame.showSemesterPanel();
            }
        }); 
		
		pnlSemester1.add(btn1);
		//Add tab with panel
		this.addTab("Semester 1", pnlSemester1);
		//Set tab mnemonic
		this.setMnemonicAt(0, KeyEvent.VK_1);
	}
}

