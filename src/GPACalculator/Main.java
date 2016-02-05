package GPACalculator;

import GPACalculator.frames.MainFrame;
import GPACalculator.Student;

public class Main {
	public static void main(String[] args){
		System.out.println("Hello");
		//Initiate Main Frame.
		MainFrame mainFrame = new MainFrame();
		mainFrame.showWelcomePanel();
		mainFrame.makeVisible();
		Student student = new Student("default");
		System.out.println(student);
		System.out.println(student.getSemester(1));
		student.addSemester();
		System.out.println(student);
		System.out.println(student.getSemester(9));
		
	}
}