package GPACalculator.frames;



import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;

import GPACalculator.classpanel.ClassPanel;
import GPACalculator.semesterpanel.SemesterPanel;
import GPACalculator.studentpanel.StudentPanel;
import GPACalculator.welcomepanel.WelcomePanel;

public class MainFrame extends JFrame {
	
	private static JFrame frame;
	
	public MainFrame() {
		// Create and set up the window.
		super();
		frame = new JFrame("GPA Calculator");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = frame.getContentPane();
		// adjust to need.
		Dimension d = new Dimension(1500, 800);
		c.setPreferredSize(d);
		
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icon.png")));
		// Add content to the window.
		//frame.add(new GPA_Gui(), BorderLayout.NORTH);
		
		//frame.setJMenuBar(new Menu_GPA_Gui());
		// Add Panel to Frame
		// Display the window.

	}
	
	public void showWelcomePanel(){
		 frame.add(new WelcomePanel(), BorderLayout.NORTH);
		 frame.pack();
		 frame.setVisible(true);
	}
	
	public static void showStudentPanel(){
		frame.getContentPane().removeAll();
		frame.add(new StudentPanel(), BorderLayout.NORTH);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void showSemesterPanel() {
		String s = new String();
		s = "Semester 1";
		frame.getContentPane().removeAll();
		frame.add(new SemesterPanel(s), BorderLayout.NORTH);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void showClassPanel() {
		String s = new String();
		s = "Class 1";
		frame.getContentPane().removeAll();
		frame.add(new ClassPanel(s), BorderLayout.NORTH);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void makeVisible(){
		frame.pack();
		frame.setVisible(true);
	}
}
