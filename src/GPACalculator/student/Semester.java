package GPACalculator.student;

import java.util.HashMap;
import java.util.Map;

public class Semester {
	double[] classGrades;
	int[] classHours;
	String[] classNames;
	Double totalHours;
	Double semesterHours;
	double semesterGPA;
	String semesterName;
	int semesterCounter;
	Class class1;
	Class class2;
	Class class3;
	Class class4;
	Class class5;
	Class class6;
	Class class7;
	Class class8;
	double totalGPA;
	Class classempty;
	Map<String, String> mapClasses;
	Map<String, Class> mapClassObjects;
	int numberOfClasses;
	int totalClasses;
	public Semester(Student student, double semesterGrade, int semesterNumber, int semesterCount) {
		mapClasses = new HashMap<String, String>();
		mapClassObjects = new HashMap<>();
		this.numberOfClasses = 8;
		this.totalClasses = 8;
		this.semesterGPA = semesterGrade;
		this.semesterName = "Semester " + Integer.toString(semesterNumber);
		this.semesterCounter = semesterCount;
		this.totalGPA = student.totalGPA;
		this.classGrades = new double[8];
		this.classHours = new int[8];
		this.semesterHours = new Double(0);
		this.classNames = new String [] {this.semesterName + " Class 1", this.semesterName + " Class 2", this.semesterName + " Class 3", this.semesterName + " Class 4", this.semesterName + " Class 5", this.semesterName + " Class 6", this.semesterName + " Class 7", this.semesterName + " Class 8"};
		this.class1 = new Class(student, this, this.classGrades[0], 1, 1);
		mapClasses.put("1", class1.toString());
		mapClassObjects.put(this.semesterName + " Class 1", class1);
		
		this.class2 = new Class(student, this, this.classGrades[1], 2, 2);
		mapClasses.put("2", class2.toString());
		mapClassObjects.put(this.semesterName + " Class 2", class2);
		
		this.class3 = new Class(student, this, this.classGrades[2], 3, 3);
		mapClasses.put("3", class3.toString());
		mapClassObjects.put(this.semesterName + " Class 3", class3);
		
		this.class4 = new Class(student, this, this.classGrades[3], 4, 4);
		mapClasses.put("4", class4.toString());
		mapClassObjects.put(this.semesterName + " Class 4", class4);
		
		this.class5 = new Class(student, this, this.classGrades[4], 5, 5);
		mapClasses.put("5", class5.toString());
		mapClassObjects.put(this.semesterName + " Class 5", class5);
		
		this.class6 = new Class(student, this, this.classGrades[5], 6, 6);
		mapClasses.put("6", class6.toString());
		mapClassObjects.put(this.semesterName + " Class 6", class6);
		
		this.class7 = new Class(student, this, this.classGrades[6], 7, 7);
		mapClasses.put("7", class7.toString());
		mapClassObjects.put(this.semesterName + " Class 7", class7);
		
		this.class8 = new Class(student, this, this.classGrades[7], 8, 8);
		mapClasses.put("8", class8.toString());
		mapClassObjects.put(this.semesterName + " Class 8", class8);
		
		classempty = new Class(student, this, 0, 0, 0);
		//System.out.println("New Semester created.");
	}
	
	public String toString() {
		//System.out.println(this.semesterName + " GPA: " + Double.toString(this.semesterGPA));
		return this.semesterName;
	}
	
	public void  changeName(String name) {
		this.semesterName = name;
	}
	
	 public String getClass(int i) {
		 if (i <= this.totalClasses) {
			 return mapClasses.get(Integer.toString(i));
		 }
		 else {
			 return "Semester index out or range.";
		 }
	 }
	 
	 public Class getClassObject(int i) {
		 if (i > (this.classNames.length)) {
			 return classempty;
		 }
		 Class class0 = mapClassObjects.get(this.classNames[i - 1]);
		 return class0;
	 }
	 
	 public String getMapClasses() {
		 return mapClasses.toString();
	 }
	 
	 public String getMapClassObjects() {
		 return mapClassObjects.toString();
	 }
}
