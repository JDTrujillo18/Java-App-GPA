package GPACalculator.frames;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import GPACalculator.classpanel.ClassPanel;
import GPACalculator.classpanel.classMenu;
import GPACalculator.semesterpanel.SemesterPanel;
import GPACalculator.semesterpanel.semesterMenu;
import GPACalculator.student.Student;
import GPACalculator.studentpanel.StudentPanel;
import GPACalculator.studentpanel.studentMenu;
import GPACalculator.welcomepanel.WelcomePanel;

public class MainFrame extends JFrame {
	static Color backgroundColor = Color.WHITE;
	private static JFrame frame;
	WelcomePanel WelcomePanel;
	static StudentPanel studentPanel;
	static Student currentStudent;
	public MainFrame() {
		// Create and set up the window.
		super();
		frame = new JFrame("GPA Calculator");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font f = new Font("serif", Font.PLAIN, 36);
		frame.setFont(f);
		frame.addWindowListener(new WindowAdapter() {
			@Override
		    public void windowClosing(WindowEvent e) {
		        // Do what you want when the window is closing.
				if (currentStudent != null){
					writeFile(currentStudent);
					System.exit(0);
				}
				else {
					System.exit(0);
				}
		    }
		});
		frame.setBackground(Color.WHITE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icon.png")));
		// Add content to the window.
		//frame.add(new GPA_Gui(), BorderLayout.NORTH);
		
		//frame.setJMenuBar(new Menu_GPA_Gui());
		// Add Panel to Frame
		// Display the window.
		WelcomePanel = new WelcomePanel(frame);

	}
	
	public void showWelcomePanel(){
		Container c = frame.getContentPane();
		frame.setTitle("GPA Calculator - Welcome Panel");
		frame.add(WelcomePanel, BorderLayout.NORTH);
		c.setPreferredSize(WelcomePanel.getPreferredSize());
		c.setBackground(Color.WHITE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void showStudentPanel(Student student){
		studentPanel = new StudentPanel(student);
		Container c = frame.getContentPane();
		frame.getContentPane().removeAll();
		frame.setTitle("GPA Calculator - Student Panel");
		frame.setJMenuBar(new studentMenu(student));
		frame.add(studentPanel, BorderLayout.NORTH);
		// adjust to need.
		setPanelColor(c);
		c.setPreferredSize(studentPanel.getPreferredSize());
		frame.pack();
		frame.setVisible(true);
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("testmyjavacode.txt", "UTF-8");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		writer.println("Student");
		writer.println("First Name " + student.getFirstName());
		writer.println("Last Name " + student.getLastName());
		writer.println("Total Hours " + student.getTotalHours());
		writer.println("Total GPA " + student.getTotalGPA());
		writer.close();
		currentStudent = student;
	}
	
	public static void showSemesterPanel(String s, Student student) {
		frame.getContentPane().removeAll();
		frame.setTitle("GPA Calculator - Semester Panel");
		frame.setJMenuBar(new semesterMenu(student));
		frame.add(new SemesterPanel(s, student), BorderLayout.NORTH);
		Container c = frame.getContentPane();
		setPanelColor(c);
		// adjust to need.
		Dimension d = new Dimension(2250, 1200);
		c.setPreferredSize(d);
		frame.pack();
		frame.setVisible(true);
		currentStudent = student;
	}
	
	public static void showClassPanel(String s, Student student) {
		frame.getContentPane().removeAll();
		frame.setTitle("GPA Calculator - Class Panel");
		frame.setJMenuBar(new classMenu(student));
		frame.add(new ClassPanel(s, student), BorderLayout.NORTH);
		Container c = frame.getContentPane();
		setPanelColor(c);
		// adjust to need.
		Dimension d = new Dimension(2250, 1200);
		c.setPreferredSize(d);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void makeVisible(){
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void setPanelColor(Container parent)
	{
	    for(Component c : parent.getComponents())
	    {
	        if(c instanceof Container)
	        {
	            if(c instanceof JPanel)
	            {
	                c.setBackground(backgroundColor);
	            }

	            setPanelColor((Container)c);
	        }
	    }
	}
	public static void writeFile(Student student) {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet(student.getFirstName());
		 
		Map<String, Object[]> data = new HashMap<String, Object[]>();
		data.put("1", new Object[] {"Student: ", student.getFirstName(), student.getLastName()});
		data.put("2", new Object[] {"Total GPA ", student.getTotalGPA()});
		data.put("3", new Object[] {2d, "Sam", 800000d});
		data.put("4", new Object[] {3d, "Dean", 700000d});
		 
		Set<String> keyset = data.keySet();
		int rownum = 0;
		for (String key : keyset) {
		    Row row = sheet.createRow(rownum++);
		    Object [] objArr = data.get(key);
		    int cellnum = 0;
		    for (Object obj : objArr) {
		        Cell cell = row.createCell(cellnum++);
		        if(obj instanceof Date) 
		            cell.setCellValue((Date)obj);
		        else if(obj instanceof Boolean)
		            cell.setCellValue((Boolean)obj);
		        else if(obj instanceof String)
		            cell.setCellValue((String)obj);
		        else if(obj instanceof Double)
		            cell.setCellValue((Double)obj);
		    }
		}
		 
		try {
		    FileOutputStream out = 
		            new FileOutputStream(new File("test.xls"));
		    workbook.write(out);
		    out.close();
		    System.out.println("Excel written successfully..");
		     
		} catch (FileNotFoundException e1) {
		    e1.printStackTrace();
		} catch (IOException e1) {
		    e1.printStackTrace();
		}
	}
}
