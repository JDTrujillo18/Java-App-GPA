package GPACalculator;

import GPACalculator.frames.MainFrame;

import java.util.Arrays;

import GPACalculator.Student;

public class Main {
	public static void main(String[] args){
		System.out.println("Hello");
		//Initiate Main Frame.
		MainFrame mainFrame = new MainFrame();
		mainFrame.showWelcomePanel();
		mainFrame.makeVisible();
		Student student = new Student("default");
		student.setFirstName("Jered");
		student.setLastName("Trujillo");
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		student.addSemester();
		student.addSemester();
		student.renameSemester("Fall", 10);
		student.renameSemester("Mine", 2);
		student.removeSemester(3);
		student.removeSemester(9);
		student.removeSemester(1);
		student.addSemester();
		System.out.println(student);
		
		
		System.out.println(student.getMapSemesters());
		System.out.println(student.getMapSemesterObjects());
		
		System.out.println(Arrays.toString(student.getSemesterGrades()));
		System.out.println(Arrays.toString(student.getSemesterHours()));
		System.out.println(Arrays.toString(student.getSemesterNames()));
		System.out.println(student.getQualityPoints());
		
		System.out.println(student.getTotalHours());
		System.out.println(student.getTotalGPA());
		System.out.println(student.getNumberOfSemesters());
		
		System.out.println(student.getSemester(1));
		System.out.println(student.getSemester(2));
		System.out.println(student.getSemester(3));
		System.out.println(student.getSemester(4));
		System.out.println(student.getSemester(5));
		System.out.println(student.getSemester(6));
		System.out.println(student.getSemester(7));
		System.out.println(student.getSemester(8));
		System.out.println(student.getSemester(9));
		System.out.println(student.getSemester(10));
		System.out.println(student.getSemester(11));
		
		student.getSemesterObject(1);
		student.getSemesterObject(2);
		student.getSemesterObject(3);
		student.getSemesterObject(4);
		student.getSemesterObject(5);
		student.getSemesterObject(6);
		student.getSemesterObject(7);
		student.getSemesterObject(8);
		student.getSemesterObject(9);
		student.getSemesterObject(10);
		student.getSemesterObject(11);

	}
}