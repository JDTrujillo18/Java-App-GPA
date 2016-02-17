package GPACalculator;
import GPACalculator.frames.MainFrame;
import GPACalculator.student.Student;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

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
		
		//Student student = new Student("default");
		//student.setFirstName("Jered");
		//System.out.println(student.toString());
		
		
	}
}