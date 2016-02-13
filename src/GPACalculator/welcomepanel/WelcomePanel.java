package GPACalculator.welcomepanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.FontUIResource;

import GPACalculator.TextPrompt;
import GPACalculator.frames.MainFrame;
import GPACalculator.student.Student;

public class WelcomePanel extends JPanel {

	public WelcomePanel(JFrame frame){
		Color backgroundColor = Color.WHITE;
		this.setBackground(backgroundColor);
		Font f = new Font("serif", Font.PLAIN, 36);
		Font f2 = new Font("serif", Font.PLAIN, 48);
		
		//Initialize tabbed pane
		//tabbedPane = new JTabbedPane();
		Border paddingBorder1 = BorderFactory.createEmptyBorder(50, 50, 50, 50);
		Border paddingBorder2 = BorderFactory.createEmptyBorder(30, 30, 30, 30);
		JLabel lblWelcome = new JLabel("Welcome To The GPA Calculator App");
		lblWelcome.setFont(f2);
		lblWelcome.setBorder(paddingBorder1);
		
		JLabel lblEnterName = new JLabel("Enter Name");
		lblEnterName.setFont(f);
		lblEnterName.setBorder(paddingBorder2);
		
		JLabel lblFirstName = new JLabel("First Name: ");
		lblFirstName.setFont(f);
		lblFirstName.setBorder(paddingBorder2);
		
		JLabel lblLastName = new JLabel("Last Name: ");
		lblLastName.setFont(f);
		lblLastName.setBorder(paddingBorder2);
		
		JTextField firstName = new JTextField(30);
		firstName.setFont(f);
		TextPrompt firstNamePrompt = new TextPrompt("First Name", firstName);
		firstNamePrompt.setForeground( Color.GRAY );
		firstNamePrompt.changeAlpha(0.5f);
		firstNamePrompt.changeStyle(Font.BOLD + Font.ITALIC);
		firstName.setMaximumSize(new Dimension(300, 60));
		
		JTextField lastName = new JTextField(30);
		lastName.setFont(f);
		TextPrompt lastNamePrompt = new TextPrompt("Last Name", lastName);
		lastNamePrompt.setForeground( Color.GRAY );
		lastNamePrompt.changeAlpha(0.5f);
		lastNamePrompt.changeStyle(Font.BOLD + Font.ITALIC);
		lastName.setMaximumSize(new Dimension(300, 60));
		
		JButton btn1 = new JButton();
		btn1.setText("Create Default Student");
		btn1.setFont(f);
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.BLACK);
		frame.getRootPane().setDefaultButton(btn1);
		btn1.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
            	if (firstName.getText().trim().isEmpty() || lastName.getText().trim().isEmpty()){
            		System.out.println("Empty");
            		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("serif", Font.PLAIN, 32)));
            		UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("sans-serif", Font.PLAIN, 28)));
            		JOptionPane.showMessageDialog(frame, "Please enter a first and last name.", "Enter Full Name", JOptionPane.INFORMATION_MESSAGE);
            	}
            	else {
            	Student student = new Student("default");
                student.setFirstName(firstName.getText());
                student.setLastName(lastName.getText());
                MainFrame.showStudentPanel(student);
                
            	}
            }
        });
		
		JButton btn2 = new JButton();
		btn2.setText("Create Custom Student");
		btn2.setFont(f);
		btn2.setForeground(Color.WHITE);
		btn2.setBackground(Color.BLUE);
		btn2.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
            	if (firstName.getText().trim().isEmpty() || lastName.getText().trim().isEmpty()){
            		System.out.println("Empty");
            		UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("serif", Font.PLAIN, 32)));
            		UIManager.put("OptionPane.buttonFont", new FontUIResource(new Font("sans-serif", Font.PLAIN, 28)));
            		JOptionPane.showMessageDialog(frame, "Please enter a first and last name.", "Enter Full Name", JOptionPane.INFORMATION_MESSAGE);
            	}
            	else{
                Student student = new Student("custom");
                student.setFirstName(firstName.getText());
                student.setLastName(lastName.getText());
                MainFrame.showStudentPanel(student);

            	}
            }
        });
		
		BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
		this.setLayout(layout);
		
		JPanel pnlWelcome = new JPanel();
		pnlWelcome.setLayout(new BoxLayout(pnlWelcome, BoxLayout.X_AXIS));
		pnlWelcome.add(lblWelcome);
		pnlWelcome.setBackground(backgroundColor);
		
		JPanel pnlFirstName = new JPanel();
		pnlFirstName.setLayout(new BoxLayout(pnlFirstName, BoxLayout.X_AXIS));
		pnlFirstName.add(lblFirstName);
		pnlFirstName.add(firstName);
		pnlFirstName.setBackground(backgroundColor);
		
		JPanel pnlLastName = new JPanel();
		pnlLastName.setLayout(new BoxLayout(pnlLastName, BoxLayout.X_AXIS));
		pnlLastName.add(lblLastName);
		pnlLastName.add(lastName);
		pnlLastName.setBackground(backgroundColor);
		
		JPanel pnlAllName = new JPanel();
		pnlAllName.setLayout(new BoxLayout(pnlAllName, BoxLayout.Y_AXIS));
		pnlAllName.add(pnlFirstName);
		pnlAllName.add(pnlLastName);
		pnlAllName.setBackground(backgroundColor);

		JPanel pnlEnter = new JPanel();
		pnlEnter.setBackground(backgroundColor);
		GroupLayout layout1 = new GroupLayout(pnlEnter);
		pnlEnter.setLayout(layout1);
		layout1.setAutoCreateGaps(true);
		layout1.setAutoCreateContainerGaps(true);
		
		layout1.setHorizontalGroup(layout1.createSequentialGroup()
				.addComponent(btn2)
				.addComponent(btn1)
				);
		
		layout1.setVerticalGroup(layout1.createParallelGroup()
				.addComponent(btn2)
				.addComponent(btn1)
				);
		
		//pnlEnter.add(btn2);
		//pnlEnter.add(btn1);
		
		
		this.add(pnlWelcome);
		this.add(pnlAllName);
		this.add(pnlEnter);
	}
}
