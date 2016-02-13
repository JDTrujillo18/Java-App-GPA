package GPACalculator.studentpanel;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTabbedPane;

import GPACalculator.buttontabcomponents.ButtonTabComponent3;
import GPACalculator.buttontabcomponents.ButtonTabComponent6;
import GPACalculator.frames.MainFrame;
import GPACalculator.student.Student;


public class StudentPanel extends JTabbedPane {
	
	public StudentPanel(Student student) {
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
		JComponent pnlSemester1 = new tabStudentPanel(student);
		
		//Add tab with panel
		this.addTab("Student: " + student.getFirstName() + " " + student.getLastName(), pnlSemester1);
		//Set tab mnemonic
		this.setMnemonicAt(0, KeyEvent.VK_1);
		initTabComponent(0);
		
		Font f1 = new Font("serif", Font.PLAIN, 54);
		Font f2 = new Font("serif", Font.PLAIN, 36);
		
	}
	
	private void initTabComponent(int i) {
		this.setTabComponentAt(i, new ButtonTabComponent3(this));
	}
	
	public static BufferedImage resize(BufferedImage img, int newW, int newH) {  
		int w = img.getWidth();  
	    int h = img.getHeight();  
	    BufferedImage dimg = new BufferedImage(newW, newH, img.getType());  
	    Graphics2D g = dimg.createGraphics();  
	    g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
	    RenderingHints.VALUE_INTERPOLATION_BILINEAR);  
	    g.drawImage(img, 0, 0, newW, newH, 0, 0, w, h, null);  
	    g.dispose();  
	    return dimg;  
		}  
}

