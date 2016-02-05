package GPACalculator.studentpanel;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class tabStudentPanel extends JPanel {

	public tabStudentPanel(String text){
		//Initialize fonts
		Font f1 = new Font("serif", Font.PLAIN, 36);
		Font f2 = new Font("serif", Font.PLAIN, 24);
		
		//Initialize borders
		Border paddingBorder1 = BorderFactory.createEmptyBorder(10, 40, 10, 40);
		Border paddingBorder2 = BorderFactory.createEmptyBorder(10, 600, 10, 40);
		Border paddingBorder3 = BorderFactory.createEmptyBorder(10, 0, 10, 1435);
		Border paddingBorder5 = BorderFactory.createEmptyBorder(10, 0, 10, 10);
		Border paddingBorder6 = BorderFactory.createEmptyBorder(10, 1260, 10, 0);

		//Set Layout to a BoxLayout along the Y-Axis(vertical)
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		JPanel gpaSemester = new JPanel();
		//Set panel layout to BoxLayout along the X-Axis(horizontal)
		gpaSemester.setLayout(new BoxLayout(gpaSemester, BoxLayout.X_AXIS));
		
		//Initialize panel that will hold the Total GPA
		JPanel gpaTotal = new JPanel();
		//Set panel layout to BoxLayout along the X-Axis(horizontal)
		gpaTotal.setLayout(new BoxLayout(gpaTotal, BoxLayout.X_AXIS));
		
		JLabel semesterGPA = new JLabel("Semester GPA: 0.00");
		semesterGPA.setFont(f2);
		semesterGPA.setBorder(paddingBorder6);
		gpaSemester.add(semesterGPA);

		JLabel totalGPA = new JLabel("Total GPA: 0.00");
		totalGPA.setFont(f2);
		totalGPA.setBorder(paddingBorder6);
		gpaTotal.add(totalGPA);
		//Initialize the panel that will hold the semester header

		this.add(gpaSemester);
		this.add(gpaTotal);
	}
}
