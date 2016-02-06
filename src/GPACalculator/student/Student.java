package GPACalculator.student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Student {

	double[] semesterGrades;
	int[] semesterHours;
	String[] semesterNames;
	Double totalHours;
	Double qualityPoints;
	Double totalGPA;
	int numberOfSemesters;
	int totalSemesters;
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
	Semester semesterempty;
	
	Map<String, String> mapSemesters;
	Map<String, Semester> mapSemesterObjects;
	
	public Student(String text) {
		if (text == "custom") {
			this.firstName = new String("New");
			this.lastName = new String("Student");
		} 
		else if (text == "default") {
			mapSemesters = new HashMap<String, String>();
			mapSemesterObjects = new HashMap<>();
			this.firstName = new String("New");
			this.lastName = new String("Student");

			this.semesterGrades = new double[8];
			this.semesterHours = new int[8];
			this.semesterNames = new String [] {"Semester 1", "Semester 2", "Semester 3", "Semester 4", "Semester 5", "Semester 6", "Semester 7", "Semester 8"};
			this.qualityPoints = new Double(0);
			this.totalHours = new Double(0);
			this.totalGPA = new Double(0);
			this.numberOfSemesters = 8;
			this.totalSemesters = 8;
			semester1= new Semester(this.semesterGrades[0], 1, 1);
			mapSemesters.put("1", semester1.toString());
			mapSemesterObjects.put("Semester 1", semester1);
			
			semester2 = new Semester(this.semesterGrades[1], 2, 2);
			mapSemesters.put("2", semester2.toString());
			mapSemesterObjects.put("Semester 2", semester2);
			
			semester3= new Semester(this.semesterGrades[2], 3, 3);
			mapSemesters.put("3", semester3.toString());
			mapSemesterObjects.put("Semester 3", semester3);
			
			semester4 = new Semester(this.semesterGrades[3], 4, 4);
			mapSemesters.put("4", semester4.toString());
			mapSemesterObjects.put("Semester 4", semester4);
			
			semester5= new Semester(this.semesterGrades[4], 5, 5);
			mapSemesters.put("5", semester5.toString());
			mapSemesterObjects.put("Semester 5", semester5);
			
			semester6 = new Semester(this.semesterGrades[5], 6, 6);
			mapSemesters.put("6", semester6.toString());
			mapSemesterObjects.put("Semester 6", semester6);
			
			semester7= new Semester(this.semesterGrades[6], 7, 7);
			mapSemesters.put("7", semester7.toString());
			mapSemesterObjects.put("Semester 7", semester7);
			
			semester8 = new Semester(this.semesterGrades[7], 8, 8);
			mapSemesters.put("8", semester8.toString());
			mapSemesterObjects.put("Semester 8", semester8);
			
			semesterempty = new Semester(0, 0, 0);
		}
	}	
	
	
	 public String toString() { 
		 System.out.println("Student: " + this.firstName + " " + this.lastName + ".");
         System.out.println("Semester GPAs: " + Arrays.toString(this.semesterGrades));
         System.out.println("Quality Points: " + Double.toString(this.qualityPoints));
         System.out.println("Total Hours: " + Double.toString(this.totalHours));
         System.out.println(Arrays.toString(this.semesterNames));
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
	 
	 public String getFirstName() {
		 return this.firstName;
	 }
	 
	 public String getLastName() {
		 return this.lastName;
	 }
	 
	 public double[] getSemesterGrades() {
		 return this.semesterGrades;
	 }
	 
	 public int[] getSemesterHours() {
		 return this.semesterHours;
	 }
	 
	 public String[] getSemesterNames() {
		 return this.semesterNames;
	 }
	 
	 public double getQualityPoints() {
		 return this.qualityPoints;
	 }
	 
	 public double getTotalHours() {
		 return this.totalHours;
	 }
	 
	 public double getTotalGPA() {
		 return this.totalGPA;
	 }
	 
	 public int getNumberOfSemesters() {
		 return this.numberOfSemesters;
	 }
	 
	 public String getSemester(int i) {
		 if (i <= this.totalSemesters) {
			 return mapSemesters.get(Integer.toString(i));
		 }
		 else {
			 return "Semester index out or range.";
		 }
	 }
	 
	 public Semester getSemesterObject(int i) {
		 if (i > (this.semesterNames.length)) {
			 return semesterempty;
		 }
		 Semester semester = mapSemesterObjects.get(this.semesterNames[i - 1]);
		 return semester;
	 }
	 
	 public String getMapSemesters() {
		 return mapSemesters.toString();
	 }
	 
	 public String getMapSemesterObjects() {
		 return mapSemesterObjects.toString();
	 }
	 
	 public void renameSemester(String text, int i) {
		 Semester semester = getSemesterObject(i);
		 semester.changeName(text);
		 mapSemesters.remove(Integer.toString(i));
		 mapSemesterObjects.remove(this.semesterNames[i - 1]);
		 this.semesterNames[i - 1] = text;
		 mapSemesters.put(Integer.toString(i), semester.toString());
		 mapSemesterObjects.put(this.semesterNames[i - 1], semester);
		 
		 System.out.println(semester);
	 }
	 
	 public void addSemester() {
		 this.totalSemesters += 1;
		 this.numberOfSemesters += 1;
		 int[] a = new int[this.numberOfSemesters];
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
		 
		 String[] c = new String[this.numberOfSemesters];
		 for (int i = 0; i < this.numberOfSemesters; i++){
			 if (i < this.numberOfSemesters-1) {
				 c[i] = this.semesterNames[i];
			 }
			 else {
				 c[i] = "Semester " + Integer.toString(this.totalSemesters);
			 }
		 }
		 
		 this.semesterNames = c;
		 Semester semester = new Semester(0, this.totalSemesters, this.totalSemesters);
		 
		 mapSemesters.put(Integer.toString(this.totalSemesters), semester.toString());
		 mapSemesterObjects.put("Semester " + Integer.toString(this.totalSemesters), semester);
	 }

	 public void removeSemester(int semesterRemove) {
		 String mapRemove = this.semesterNames[semesterRemove - 1];
		 Semester getsemester = this.getSemesterObject(semesterRemove);
		 int mapRemove2 = getsemester.semesterCounter;
		 this.numberOfSemesters -= 1;
		 int[] a = new int[this.numberOfSemesters];
		 for (int i = 0; i < semesterRemove; i++) {
			 if (i != semesterRemove - 1) {
				 a[i] = this.semesterHours[i];
			 }
		 }
		 
		 for (int i = semesterRemove - 1; i < this.numberOfSemesters; i++){
			 a[i] = this.semesterHours[i + 1];
		 }
		 
		 this.semesterHours = a;
		 
		 double[] b = new double[this.numberOfSemesters];
		 for (int i = 0; i < semesterRemove; i++) {
			 if (i != semesterRemove - 1) {
				 b[i] = this.semesterGrades[i];
			 }
		 }
		 
		 for (int i = semesterRemove - 1; i < this.numberOfSemesters; i++){
			 b[i] = this.semesterGrades[i + 1];
		 }
		 
		 this.semesterGrades = b;
		 
		 String[] c = new String[this.numberOfSemesters];
		 for (int i = 0; i < semesterRemove; i++) {
			 if (i != semesterRemove - 1) {
				 c[i] = this.semesterNames[i];
			 }
		 }
		 
		 for (int i = semesterRemove - 1; i < this.numberOfSemesters; i++){
			 c[i] = this.semesterNames[i + 1];
		 }
		 this.semesterNames = c;
		 
		 mapSemesters.remove(Integer.toString(mapRemove2));
		 mapSemesterObjects.remove(mapRemove);
	 }
}

