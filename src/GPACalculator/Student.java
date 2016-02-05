package GPACalculator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Student {

	double[] semesterGrades;
	double[] semesterHours;
	Double totalHours;
	Double qualityPoints;
	Double totalGPA;
	int numberOfSemesters;
	String firstName;
	String lastName;
	Semester semester1;
	Semester semester2;
	Semester semester3;
	Semester semester4;
	Semester semester5;
	Semester semester6;
	Semester semester7;
	Semester semester8;
	
	Map<String, String> map;
	
	public Student(String text) {
		if (text == "custom") {
			this.firstName = new String("New");
			this.lastName = new String("Student");
		} 
		else if (text == "default") {
			map = new HashMap<String, String>();
			this.firstName = new String("New");
			this.lastName = new String("Student");
			this.semesterGrades = new double[8];
			this.semesterHours = new double[8];
			this.qualityPoints = new Double(0);
			this.totalHours = new Double(0);
			this.totalGPA = new Double(0);
			this.numberOfSemesters = 8;
			semester1= new Semester(this.semesterGrades[0], 1);
			map.put("1", semester1.toString());
			semester2 = new Semester(this.semesterGrades[1], 2);
			map.put("2", semester2.toString());
			semester3= new Semester(this.semesterGrades[2], 3);
			map.put("3", semester3.toString());
			semester4 = new Semester(this.semesterGrades[3], 4);
			map.put("4", semester4.toString());
			semester5= new Semester(this.semesterGrades[4], 5);
			map.put("5", semester5.toString());
			semester6 = new Semester(this.semesterGrades[5], 6);
			map.put("6", semester6.toString());
			semester7= new Semester(this.semesterGrades[6], 7);
			map.put("7", semester7.toString());
			semester8 = new Semester(this.semesterGrades[7], 8);
			map.put("8", semester8.toString());
		}
		
	}
	
	 public String toString() { 
		 System.out.println("Student: " + this.firstName + " " + this.lastName + ".");
         System.out.println("Semester GPAs: " + Arrays.toString(this.semesterGrades));
         System.out.println("Quality Points: " + Double.toString(this.qualityPoints));
         System.out.println("Total Hours: " + Double.toString(this.totalHours));
         return "Total GPA: " + Double.toString(this.totalGPA);
      } 
	 
	 public String setFirstName(String first) {
		 this.firstName = first;
		 return this.firstName;
	 }
	 
	 public String setLastName(String last) {
		 this.lastName = last;
		 return this.lastName;
	 }
	 
	 public String getSemester(int i) {
		 if (i <= this.numberOfSemesters) {
			 return map.get(Integer.toString(i));
		 }
		 else {
			 return "No Semester Exists";
		 }
	 }
	 
	 public void addSemester() {
		 this.numberOfSemesters += 1;
		 double[] a = new double[this.numberOfSemesters];
		 for (int i = 0; i < this.numberOfSemesters; i++){
			 if (i < this.numberOfSemesters - 1) {
				 a[i] = this.semesterHours[i];
			 }
			 else {
				 a[i] = 0;
			 }
		 }
		 
		 this.semesterHours = a;
		 
		 double[] b = new double[this.numberOfSemesters];
		 for (int i = 0; i < this.numberOfSemesters; i++) {
			 if (i < this.numberOfSemesters - 1) {
				 b[i] = this.semesterGrades[i];
			 }
			 else {
				 b[i] = 0;
			 }
		 }
		 
		 this.semesterGrades = b;
		 
		 Semester semester = new Semester(0, this.numberOfSemesters);
		 
		 map.put(Integer.toString(this.numberOfSemesters), semester.toString());
		 
	 }
}
