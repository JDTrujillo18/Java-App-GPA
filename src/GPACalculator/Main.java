package GPACalculator;

import GPACalculator.frames.MainFrame;
import GPACalculator.student.Student;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		System.out.println("Hello");
		//Initiate Main Frame.
		MainFrame mainFrame = new MainFrame();
		mainFrame.showWelcomePanel();
		mainFrame.makeVisible();


	}
}