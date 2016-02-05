package GPACalculator;

public class Semester {
	double semesterGPA;
	String semesterName;
	int semesterCounter;
	
	public Semester(double semesterGrade, int semesterNumber, int semesterCount) {
		this.semesterGPA = semesterGrade;
		this.semesterName = "Semester " + Integer.toString(semesterNumber);
		this.semesterCounter = semesterCount;
	}
	
	public String toString() {
		return this.semesterName + " GPA: " + Double.toString(this.semesterGPA);
	}
	
	public void  changeName(String name) {
		this.semesterName = name;
	}
}
