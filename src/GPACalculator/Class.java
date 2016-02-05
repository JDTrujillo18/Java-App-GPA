package GPACalculator;

public class Class {
	
	int amountProjects;
	int amountLabs;
	int amountHomeworks;
	int amountPapers;
	int amountQuizzes;
	int amountTests;
	int amountFinal;
	
	int amountProjectDrops;
	int amountLabDrops;
	int amountHomeworkDrops;
	int amountPaperDrops;
	int amountQuizDrops;
	int amountTestDrops;
	
	boolean finalDrop;
	
	double classGrade;
	double[] weightProjects;
	double[] weightLabs;
	double[] weightHomeworks;
	double[] weightPapers;
	double[] weightQuizzes;
	double[] weightTests;
	double weightFinal;
	double classCounter;
	
	double projectsGrade;
	double labsGrade;
	double homeworksGrade;
	double papersGrade;
	double quizzesGrade;
	double testsGrade;
	double finalGrade;
	
	String className;
	String classCode;
	String classTeacher;
	
	public Class(double classGrade, int classNumber, int classCount) {
		this.className = "Class " + Integer.toString(classNumber);
		this.classCounter = classCount;
		this.classCode = "";
		this.classTeacher = "";
		
		this.classGrade = classGrade;
		this.amountProjects = 0;
		this.amountLabs = 0;
		this.amountHomeworks = 0;
		this.amountPapers = 0;
		this.amountQuizzes = 0;
		this.amountTests = 3;
		this.amountFinal = 1;
		
		this.amountProjectDrops = 0;
		this.amountLabDrops = 0;
		this.amountHomeworkDrops = 0;
		this.amountPaperDrops = 0;
		this.amountQuizDrops = 0;
		this.amountTestDrops = 0;
		this.finalDrop = false;
		
		this.weightProjects = new double[this.amountProjects];
		this.weightLabs = new double[this.amountLabs];
		this.weightHomeworks = new double[this.amountHomeworks];
		this.weightPapers = new double[this.amountPapers];
		this.weightQuizzes = new double[this.amountQuizzes];
		this.weightTests = new double[this.amountTests];
		this.weightFinal = 0;
		
		this.projectsGrade = 0;
		this.labsGrade = 0;
		this.homeworksGrade = 0;
		this.papersGrade = 0;
		this.quizzesGrade = 0;
		this.testsGrade = 0;
		this.finalGrade = 0;
	}
}
