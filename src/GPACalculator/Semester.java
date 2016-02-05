package GPACalculator;

public class Semester {
	double semesterGPA;
	String semesterName;
	
	public Semester(double semesterGrade, int semesterNumber) {
		this.semesterGPA = semesterGrade;
		this.semesterName = "Semester " + Integer.toString(semesterNumber);
	}
	
	public String toString() {
		return this.semesterName + " GPA: " + Double.toString(this.semesterGPA);
	}
}
