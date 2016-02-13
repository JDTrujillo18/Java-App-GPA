package GPACalculator.studentpanel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import GPACalculator.frames.MainFrame;
import GPACalculator.student.Student;

public class tabStudentPanel extends JPanel {

	public tabStudentPanel(Student student){
		//Initialize fonts
		Font f1 = new Font("serif", Font.PLAIN, 36);
		Font f2 = new Font("serif", Font.PLAIN, 24);
		
		//Initialize borders
		Border paddingBorder1 = BorderFactory.createEmptyBorder(10, 40, 10, 40);
		Border paddingBorder2 = BorderFactory.createEmptyBorder(10, 600, 10, 40);
		Border paddingBorder3 = BorderFactory.createEmptyBorder(10, 0, 10, 1435);
		Border paddingBorder5 = BorderFactory.createEmptyBorder(10, 0, 10, 10);
		Border paddingBorder6 = BorderFactory.createEmptyBorder(10, 1250, 10, 50);

		//Set Layout to a BoxLayout along the Y-Axis(vertical)
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		double[] semesterGrades = student.getSemesterGrades();
		System.out.println((semesterGrades.length));
		
		String[] semesterNames = student.getSemesterNames();
		
		JPanel pnlStudent = new JPanel();
		
		JPanel gpaSemester = new JPanel();
		//Set panel layout to BoxLayout along the X-Axis(horizontal)
		gpaSemester.setLayout(new BoxLayout(gpaSemester, BoxLayout.X_AXIS));
		
		//Initialize panel that will hold the Total GPA
		JPanel gpaTotal = new JPanel();
		//Set panel layout to BoxLayout along the X-Axis(horizontal)
		gpaTotal.setLayout(new BoxLayout(gpaTotal, BoxLayout.X_AXIS));
		
		JLabel lblStudent = new JLabel(student.getFirstName() + " " + student.getLastName());
		lblStudent.setFont(f1);
		pnlStudent.add(lblStudent);
		JLabel totalGPA = new JLabel("Total GPA: " + student.getTotalGPA());
		totalGPA.setFont(f1);
		totalGPA.setBorder(paddingBorder6);
		gpaTotal.add(totalGPA);
		//Initialize the panel that will hold the semester header
		JButton btn1 = new JButton();
		btn1.setText("Next");
		btn1.setFont(f1);
		btn1.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                MainFrame.showSemesterPanel();
            }
        }); 
		this.add(pnlStudent);
		
		for (int i = 0; i < semesterGrades.length; i++) {
			JPanel semester = new JPanel();
			semester.setLayout(new BoxLayout(semester, BoxLayout.X_AXIS));
			JLabel semesterName = new JLabel(semesterNames[i]);
			semesterName.setFont(f1);
			semesterName.setBorder(paddingBorder1);
			JLabel semesterGrade = new JLabel(Double.toString(semesterGrades[i]));
			semesterGrade.setFont(f1);
			semesterGrade.setBorder(paddingBorder1);
			semester.add(semesterName);
			semester.add(semesterGrade);
			this.add(semester);
		}

		this.add(gpaTotal);
		this.add(btn1);
	}
}
