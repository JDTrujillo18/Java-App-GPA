package GPACalculator;

import GPACalculator.frames.MainFrame;
import GPACalculator.student.Student;

import java.awt.Dimension;
import java.awt.List;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		System.out.println("Hello");
		//Initiate Main Frame.
		MainFrame mainFrame = new MainFrame();
		mainFrame.showWelcomePanel();
		mainFrame.makeVisible();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		double height = screenSize.getHeight();
		System.out.println("Screen height: " + height);
		System.out.println("Screen width: " + width);
		
		Student student = new Student("default");
		student.setFirstName("Jered");
		System.out.println(student.toString());
	}
}