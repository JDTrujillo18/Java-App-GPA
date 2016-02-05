package GPACalculator.classpanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

import GPACalculator.buttontabcomponents.ButtonTabComponent2;
import GPACalculator.buttontabcomponents.ButtonTabComponent4;
import GPACalculator.buttontabcomponents.ButtonTabComponent5;
import GPACalculator.popups.PopClickListener2;

public class ClassPanel extends JPanel {
	private static JTabbedPane tabbedPane;
	private static JComponent pnlAll;
	private static JTabbedPane tabbedPane1;
	private static JTabbedPane tabbedPane3;
	static JComponent pnlInnerSemester;
	static JComponent pnlInnerSettings;
	static JComponent pnlSemester;
	static JComponent pnlSettings;
	static JComponent pnlTreeContainer;
	static JComponent pnlTree;
	
	static BufferedImage buttonIcon = null;
	static BufferedImage buttonIcon3 = null;
	
	public ClassPanel(String s) {
		super();
		Font f = new Font("serif", Font.PLAIN, 24);
		Dimension d1 = new Dimension(400, 800);
		Dimension d2 = new Dimension(900, 800);
		Dimension d3 = new Dimension(200, 800);
		Dimension d4 = new Dimension(1500, 800);
		try {
			buttonIcon = ImageIO.read((getClass().getResource("/images/minus.png")));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			buttonIcon3 = ImageIO.read((getClass().getResource("/images/plus.png")));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
		tabbedPane1 = new JTabbedPane();
		tabbedPane1.setPreferredSize(d1);
		tabbedPane = new JTabbedPane();
		tabbedPane.setPreferredSize(d2);
		tabbedPane3 = new JTabbedPane();
		tabbedPane3.setPreferredSize(d3);
		// The following line enables to use scrolling tabs.
		tabbedPane1.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane3.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		pnlAll = new JPanel();
		pnlAll.setPreferredSize(d4);
		pnlAll.setLayout(new BoxLayout(pnlAll, BoxLayout.X_AXIS));
		
		pnlTreeContainer = new JPanel();
		pnlTreeContainer.setPreferredSize(d3);
		pnlTreeContainer.add(tabbedPane3);
		
		pnlTree = makeTextPanel3("Student Tree View");
		tabbedPane3.addTab("Student Tree View", pnlTree);
		tabbedPane3.setMnemonicAt(0, KeyEvent.VK_3);
		tabbedPane3.setFont(f);
		
		pnlSettings = new JPanel();
		pnlSettings.setPreferredSize(d1);
		pnlSettings.add(tabbedPane1);
		
		pnlInnerSettings = makeTextPanel1(s + " Settings");
		tabbedPane1.addTab(s + " Settings", pnlInnerSettings);
		tabbedPane1.setMnemonicAt(0, KeyEvent.VK_1);
		tabbedPane1.setFont(f);
		

		pnlSemester = new JPanel();
		pnlSemester.setPreferredSize(d2);
		pnlSemester.add(tabbedPane);
		
		pnlInnerSemester = makeTextPanel2(s);
		tabbedPane.addTab(s, pnlInnerSemester);
		tabbedPane.setMnemonicAt(0, KeyEvent.VK_2);
		tabbedPane.setFont(f);
		
		// Add the tabbed pane to this panel.
		initTabComponent(0);
		initTabComponent2(0);
		initTabComponent3(0);
		
		pnlAll.add(pnlTreeContainer);
		pnlAll.add(pnlSemester);
		pnlAll.add(pnlSettings);
		
		this.add(pnlAll);
	}
	
	private static void initTabComponent(int i) {
		tabbedPane1.setTabComponentAt(i, new ButtonTabComponent5(tabbedPane1));
	}
	
	private static void initTabComponent2(int i) {
		tabbedPane.setTabComponentAt(i, new ButtonTabComponent2(tabbedPane));
	}
	
	private static void initTabComponent3(int i) {
		tabbedPane3.setTabComponentAt(i, new ButtonTabComponent4(tabbedPane3));
	}
	
	protected static JComponent makeTextPanel1(String text) {
		//Font f1 = new Font("serif", Font.PLAIN, 36);
		//Font f2 = new Font("serif", Font.PLAIN, 24);
		//Border paddingBorder1 = BorderFactory.createEmptyBorder(10, 40, 10, 40);
		//Border paddingBorder2 = BorderFactory.createEmptyBorder(10, 600, 10, 40);
		//Border paddingBorder3 = BorderFactory.createEmptyBorder(10, 0, 10, 1435);

		//Border paddingBorder5 = BorderFactory.createEmptyBorder(10, 0, 10, 10);
		//Border paddingBorder6 = BorderFactory.createEmptyBorder(10, 1260, 10, 0);

		JPanel panel = new JPanel(false);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		//Create the nodes.
        DefaultMutableTreeNode top = new DefaultMutableTreeNode(text);
        createNodes1(top);
 
        //Create a tree that allows one selection at a time.
        JTree tree = new JTree(top);
        tree.getSelectionModel().setSelectionMode
                (TreeSelectionModel.SINGLE_TREE_SELECTION);
 
        //Create the scroll pane and add the tree to it. 
        JScrollPane treeView = new JScrollPane(tree);
		panel.add(treeView);
		return panel;
	}

	protected static JComponent makeTextPanel2(String text) {
		Font f1 = new Font("serif", Font.PLAIN, 36);
		Font f2 = new Font("serif", Font.PLAIN, 24);
		Dimension d1 = new Dimension(900, 800);
		Dimension d2 = new Dimension(900, 100);
		Dimension d3 = new Dimension(900, 500);
		Dimension d4 = new Dimension(900, 100);
		Dimension d5 = new Dimension(900, 100);
		
		Border paddingBorder1 = BorderFactory.createEmptyBorder(8, 0, 20, 0);
		Border paddingBorder2 = BorderFactory.createEmptyBorder(0, 0, 20, 0);
		Border paddingBorder3 = BorderFactory.createEmptyBorder(0, 0, 20, 670);
		Border paddingBorder4 = BorderFactory.createEmptyBorder(0, 700, 0, 0);
		
		JPanel container = new JPanel(false);
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		container.setPreferredSize(d1);
		
		JPanel pnlClass = new JPanel();
		pnlClass.setPreferredSize(d2);
		
		JLabel lblClass = new JLabel(text);
		lblClass.setFont(f2);
		pnlClass.add(lblClass);
		
		JPanel panel = new JPanel(false);
		panel.setLayout(new GridLayout(7, 4));
		panel.setPreferredSize(d3);

		//JPanel pnlDelete = new JPanel();
		//pnlDelete.setLayout(new BoxLayout(pnlDelete, BoxLayout.Y_AXIS));
		
		//JPanel pnlGradeTypes = new JPanel();
		//pnlGradeTypes.setLayout(new BoxLayout(pnlGradeTypes, BoxLayout.Y_AXIS));
		
		JPanel pnlAdd = new JPanel();
		pnlAdd.setLayout(new BoxLayout(pnlAdd, BoxLayout.X_AXIS));
		pnlAdd.setPreferredSize(d4);
		
		JPanel pnlGPA = new JPanel();
		pnlGPA.setLayout(new BoxLayout(pnlGPA, BoxLayout.X_AXIS));
		pnlGPA.setPreferredSize(d5);
		
		
		BufferedImage buttonIcon2 = resize(buttonIcon, 20, 20);
		
		BufferedImage buttonIcon4 = resize(buttonIcon3, 20, 20);

		JLabel fillerClass = new JLabel(text);
		fillerClass.setFont(f1);
		//pnlClass.add(fillerClass);
		
		JButton btnDeleteParticipation = new JButton(new ImageIcon(buttonIcon2));
		btnDeleteParticipation.setBorder(paddingBorder1);
		btnDeleteParticipation.setContentAreaFilled(false);
		//pnlDelete.add(btnDeleteParticipation);
		
		JButton btnDeleteHomework = new JButton(new ImageIcon(buttonIcon2));
		btnDeleteHomework.setBorder(paddingBorder1);
		btnDeleteHomework.setContentAreaFilled(false);
		//pnlDelete.add(btnDeleteHomework);
		
		JButton btnDeleteLabs = new JButton(new ImageIcon(buttonIcon2));
		btnDeleteLabs.setBorder(paddingBorder1);
		btnDeleteLabs.setContentAreaFilled(false);
		//pnlDelete.add(btnDeleteLabs);
		
		JButton btnDeletePapers = new JButton(new ImageIcon(buttonIcon2));
		btnDeletePapers.setBorder(paddingBorder1);
		btnDeletePapers.setContentAreaFilled(false);
		
		JButton btnDeleteQuizzes = new JButton(new ImageIcon(buttonIcon2));
		btnDeleteQuizzes.setBorder(paddingBorder1);
		btnDeleteQuizzes.setContentAreaFilled(false);
		
		JButton btnDeleteMidterms = new JButton(new ImageIcon(buttonIcon2));
		btnDeleteMidterms.setBorder(paddingBorder1);
		btnDeleteMidterms.setContentAreaFilled(false);
		
		JButton btnDeleteFinalExam = new JButton(new ImageIcon(buttonIcon2));
		btnDeleteFinalExam.setBorder(paddingBorder1);
		btnDeleteFinalExam.setContentAreaFilled(false);
		
		JLabel fillerParticipation = new JLabel("Participation:");
		fillerParticipation.setFont(f2);
		fillerParticipation.setBorder(paddingBorder2);
		fillerParticipation.addMouseListener(PopClickListener2.createDialog(fillerParticipation, text + ": Participation Grades"));
		//pnlGradeTypes.add(fillerParticipation);
		
		JLabel fillerHomework = new JLabel("Homework:");
		fillerHomework.setFont(f2);
		fillerHomework.setBorder(paddingBorder2);
		fillerHomework.addMouseListener(PopClickListener2.createDialog(fillerHomework, text + ": Homework Grades"));
		//pnlGradeTypes.add(fillerHomework);

		JLabel fillerLabs = new JLabel("Labs:");
		fillerLabs.setFont(f2);
		fillerLabs.setBorder(paddingBorder2);
		fillerLabs.addMouseListener(PopClickListener2.createDialog(fillerLabs, text + ": Lab Grades"));
		//pnlGradeTypes.add(fillerLabs);
		
		JLabel fillerPapers = new JLabel("Papers:");
		fillerPapers.setFont(f2);
		fillerPapers.setBorder(paddingBorder2);
		fillerPapers.addMouseListener(PopClickListener2.createDialog(fillerPapers, text + ": Paper Grades"));
		
		JLabel fillerQuizzes = new JLabel("Quizzes:");
		fillerQuizzes.setFont(f2);
		fillerQuizzes.setBorder(paddingBorder2);
		fillerQuizzes.addMouseListener(PopClickListener2.createDialog(fillerQuizzes, text + ": Quiz Grades"));
		
		JLabel fillerMidterms = new JLabel("Midterms:");
		fillerMidterms.setFont(f2);
		fillerMidterms.setBorder(paddingBorder2);
		fillerMidterms.addMouseListener(PopClickListener2.createDialog(fillerMidterms, text + ": Midterm Grades"));
		
		JLabel fillerFinalExam = new JLabel("Final Exam:");
		fillerFinalExam.setFont(f2);
		fillerFinalExam.setBorder(paddingBorder2);
		fillerFinalExam.addMouseListener(PopClickListener2.createDialog(fillerHomework, text + ": Final Exam Grade"));
		
		JLabel fillerParticipationGrade = new JLabel("Grade: 0");
		fillerParticipationGrade.setFont(f2);
		fillerParticipationGrade.setBorder(paddingBorder2);
		fillerParticipationGrade.addMouseListener(PopClickListener2.createDialog(fillerParticipationGrade, text + ": Participation Grades"));
		
		JLabel fillerHomeworkGrade = new JLabel("Grade: 0");
		fillerHomeworkGrade.setFont(f2);
		fillerHomeworkGrade.setBorder(paddingBorder2);
		fillerHomeworkGrade.addMouseListener(PopClickListener2.createDialog(fillerHomeworkGrade, text + ": Homework Grades"));
		
		JLabel fillerLabsGrade = new JLabel("Grade: 0");
		fillerLabsGrade.setFont(f2);
		fillerLabsGrade.setBorder(paddingBorder2);
		fillerLabsGrade.addMouseListener(PopClickListener2.createDialog(fillerLabsGrade, text + ": Lab Grades"));
		
		JLabel fillerPapersGrade = new JLabel("Grade: 0");
		fillerPapersGrade.setFont(f2);
		fillerPapersGrade.setBorder(paddingBorder2);
		fillerPapersGrade.addMouseListener(PopClickListener2.createDialog(fillerPapersGrade, text + ": Papers Grades"));
		
		JLabel fillerQuizzesGrade = new JLabel("Grade: 0");
		fillerQuizzesGrade.setFont(f2);
		fillerQuizzesGrade.setBorder(paddingBorder2);
		fillerQuizzesGrade.addMouseListener(PopClickListener2.createDialog(fillerQuizzesGrade, text + ": Quiz Grades"));
		
		JLabel fillerMidtermsGrade = new JLabel("Grade: 0");
		fillerMidtermsGrade.setFont(f2);
		fillerMidtermsGrade.setBorder(paddingBorder2);
		fillerMidtermsGrade.addMouseListener(PopClickListener2.createDialog(fillerMidtermsGrade, text + ": Midterm Grades"));
		
		JLabel fillerFinalExamGrade = new JLabel("Grade: 0");
		fillerFinalExamGrade.setFont(f2);
		fillerFinalExamGrade.setBorder(paddingBorder2);
		fillerFinalExamGrade.addMouseListener(PopClickListener2.createDialog(fillerFinalExamGrade, text + ": Final Exam Grade"));
		
		JLabel fillerParticipationWeight = new JLabel("Weight: 0%");
		fillerParticipationWeight.setFont(f2);
		fillerParticipationWeight.setBorder(paddingBorder2);
		fillerParticipationWeight.addMouseListener(PopClickListener2.createDialog(fillerParticipationWeight, text + ": Participation Weight"));
		
		JLabel fillerHomeworkWeight = new JLabel("Weight: 0%");
		fillerHomeworkWeight.setFont(f2);
		fillerHomeworkWeight.setBorder(paddingBorder2);
		fillerHomeworkWeight.addMouseListener(PopClickListener2.createDialog(fillerHomeworkWeight, text + ": Homework Weight"));
		
		JLabel fillerLabsWeight = new JLabel("Weight: 0%");
		fillerLabsWeight.setFont(f2);
		fillerLabsWeight.setBorder(paddingBorder2);
		fillerLabsWeight.addMouseListener(PopClickListener2.createDialog(fillerLabsWeight, text + ": Lab Weight"));
		
		JLabel fillerPapersWeight = new JLabel("Weight: 0%");
		fillerPapersWeight.setFont(f2);
		fillerPapersWeight.setBorder(paddingBorder2);
		fillerPapersWeight.addMouseListener(PopClickListener2.createDialog(fillerPapersWeight, text + ": Papers Weight"));
		
		JLabel fillerQuizzesWeight = new JLabel("Weight: 0%");
		fillerQuizzesWeight.setFont(f2);
		fillerQuizzesWeight.setBorder(paddingBorder2);
		fillerQuizzesWeight.addMouseListener(PopClickListener2.createDialog(fillerQuizzesWeight, text + ": Quiz Weight"));
		
		JLabel fillerMidtermsWeight = new JLabel("Weight: 0%");
		fillerMidtermsWeight.setFont(f2);
		fillerMidtermsWeight.setBorder(paddingBorder2);
		fillerMidtermsWeight.addMouseListener(PopClickListener2.createDialog(fillerMidtermsWeight, text + ": Midterm Weight"));
		
		JLabel fillerFinalExamWeight = new JLabel("Weight: 0%");
		fillerFinalExamWeight.setFont(f2);
		fillerFinalExamWeight.setBorder(paddingBorder2);
		fillerFinalExamWeight.addMouseListener(PopClickListener2.createDialog(fillerFinalExamWeight, text + ": Final Exam Weight"));
		
		JButton btnAddGrade = new JButton(new ImageIcon(buttonIcon4));
		btnAddGrade.setBorder(paddingBorder3);
		btnAddGrade.setContentAreaFilled(false);
		pnlAdd.add(btnAddGrade);
		
		JLabel totalGPA = new JLabel("Total GPA: 0.00");
		totalGPA.setBorder(paddingBorder4);
		totalGPA.setFont(f2);
		pnlGPA.add(totalGPA);
		
		//panel.add(pnlDelete);
		//panel.add(pnlGradeTypes);
		
		panel.add(btnDeleteParticipation);
		panel.add(fillerParticipation);
		panel.add(fillerParticipationGrade);
		panel.add(fillerParticipationWeight);
		
		panel.add(btnDeleteHomework);
		panel.add(fillerHomework);
		panel.add(fillerHomeworkGrade);
		panel.add(fillerHomeworkWeight);
		
		panel.add(btnDeleteLabs);
		panel.add(fillerLabs);
		panel.add(fillerLabsGrade);
		panel.add(fillerLabsWeight);
		
		panel.add(btnDeletePapers);
		panel.add(fillerPapers);
		panel.add(fillerPapersGrade);
		panel.add(fillerPapersWeight);
		
		panel.add(btnDeleteQuizzes);
		panel.add(fillerQuizzes);
		panel.add(fillerQuizzesGrade);
		panel.add(fillerQuizzesWeight);
		
		panel.add(btnDeleteMidterms);
		panel.add(fillerMidterms);
		panel.add(fillerMidtermsGrade);
		panel.add(fillerMidtermsWeight);
		
		panel.add(btnDeleteFinalExam);
		panel.add(fillerFinalExam);
		panel.add(fillerFinalExamGrade);
		panel.add(fillerFinalExamWeight);
		
		container.add(pnlClass);
		container.add(panel);
		container.add(pnlAdd);
		container.add(pnlGPA);
		
		return container;
	}
	
	protected static JComponent makeTextPanel3(String text) {
		//Font f1 = new Font("serif", Font.PLAIN, 36);
		//Font f2 = new Font("serif", Font.PLAIN, 24);
		//Border paddingBorder1 = BorderFactory.createEmptyBorder(10, 40, 10, 40);
		//Border paddingBorder2 = BorderFactory.createEmptyBorder(10, 600, 10, 40);
		//Border paddingBorder3 = BorderFactory.createEmptyBorder(10, 0, 10, 1435);

		//Border paddingBorder5 = BorderFactory.createEmptyBorder(10, 0, 10, 10);
		//Border paddingBorder6 = BorderFactory.createEmptyBorder(10, 1260, 10, 0);

		JPanel panel = new JPanel(false);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		//Create the nodes.
        DefaultMutableTreeNode top = new DefaultMutableTreeNode(text);
        createNodes2(top);
 
        //Create a tree that allows one selection at a time.
        JTree tree = new JTree(top);
        tree.getSelectionModel().setSelectionMode
                (TreeSelectionModel.SINGLE_TREE_SELECTION);
 
        //Create the scroll pane and add the tree to it. 
        JScrollPane treeView = new JScrollPane(tree);
		panel.add(treeView);
		return panel;
	}
	
	private static void createNodes1(DefaultMutableTreeNode top) {
        DefaultMutableTreeNode category = null ;
        DefaultMutableTreeNode subcategory = null;
        DefaultMutableTreeNode subsubcategory = null;
        category = new DefaultMutableTreeNode("General");
        top.add(category);
        
        subcategory = new DefaultMutableTreeNode("Appearance");
        category.add(subcategory);
        
        subsubcategory = new DefaultMutableTreeNode("Fonts and Colors");
        subcategory.add(subsubcategory);
        
        subsubcategory = new DefaultMutableTreeNode("Themes");
        subcategory.add(subsubcategory);
        
        subcategory = new DefaultMutableTreeNode("Semester");
        category.add(subcategory);
        
        subsubcategory = new DefaultMutableTreeNode("Semester Title");
        subcategory.add(subsubcategory);
        
        subcategory = new DefaultMutableTreeNode("Classes");
        category.add(subcategory);
        
        subsubcategory = new DefaultMutableTreeNode("Number of Classes");
        subcategory.add(subsubcategory);
        
        subcategory = new DefaultMutableTreeNode("Other");
        category.add(subcategory);
        
        subsubcategory = new DefaultMutableTreeNode("Grading Criteria");
        subcategory.add(subsubcategory);
        
    }
 
	private static void createNodes2(DefaultMutableTreeNode top) {
        DefaultMutableTreeNode category = null ;
        DefaultMutableTreeNode subcategory = null;
        DefaultMutableTreeNode subsubcategory = null;
        category = new DefaultMutableTreeNode("Student");
        top.add(category);
        
        subcategory = new DefaultMutableTreeNode("Semester 1");
        category.add(subcategory);
        
        subsubcategory = new DefaultMutableTreeNode("Class 1");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 2");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 3");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 4");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 5");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 6");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 7");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 8");
        subcategory.add(subsubcategory);
        
        subcategory = new DefaultMutableTreeNode("Semester 2");
        category.add(subcategory);
        
        subsubcategory = new DefaultMutableTreeNode("Class 1");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 2");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 3");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 4");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 5");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 6");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 7");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 8");
        subcategory.add(subsubcategory);
        
        subcategory = new DefaultMutableTreeNode("Semester 3");
        category.add(subcategory);
        
        subsubcategory = new DefaultMutableTreeNode("Class 1");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 2");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 3");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 4");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 5");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 6");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 7");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 8");
        subcategory.add(subsubcategory);
        
        subcategory = new DefaultMutableTreeNode("Semester 4");
        category.add(subcategory);
        
        subsubcategory = new DefaultMutableTreeNode("Class 1");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 2");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 3");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 4");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 5");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 6");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 7");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 8");
        subcategory.add(subsubcategory);
        
        subcategory = new DefaultMutableTreeNode("Semester 5");
        category.add(subcategory);
        
        subsubcategory = new DefaultMutableTreeNode("Class 1");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 2");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 3");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 4");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 5");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 6");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 7");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 8");
        subcategory.add(subsubcategory);
        
        subcategory = new DefaultMutableTreeNode("Semester 6");
        category.add(subcategory);
        
        subsubcategory = new DefaultMutableTreeNode("Class 1");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 2");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 3");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 4");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 5");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 6");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 7");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 8");
        subcategory.add(subsubcategory);
        
        subcategory = new DefaultMutableTreeNode("Semester 7");
        category.add(subcategory);
        
        subsubcategory = new DefaultMutableTreeNode("Class 1");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 2");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 3");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 4");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 5");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 6");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 7");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 8");
        subcategory.add(subsubcategory);
        
        subcategory = new DefaultMutableTreeNode("Semester 8");
        category.add(subcategory);
        
        subsubcategory = new DefaultMutableTreeNode("Class 1");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 2");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 3");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 4");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 5");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 6");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 7");
        subcategory.add(subsubcategory);
        subsubcategory = new DefaultMutableTreeNode("Class 8");
        subcategory.add(subsubcategory);

        
    }


	

	public static BufferedImage resize(BufferedImage img, int newW, int newH) {  
	    int w = img.getWidth();  
	    int h = img.getHeight();  
	    BufferedImage dimg = new BufferedImage(newW, newH, img.getType());  
	    Graphics2D g = dimg.createGraphics();  
	    g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
	    RenderingHints.VALUE_INTERPOLATION_BILINEAR);  
	    g.drawImage(img, 0, 0, newW, newH, 0, 0, w, h, null);  
	    g.dispose();  
	    return dimg;  
	}  
	
	static int semesterNumber = 9;
	static String stringSemesterNumber = Integer.toString(semesterNumber);
	
	public final static void addSemester() {
		String stringSemesterNumber = "Semester #" + Integer.toString(semesterNumber);
		// tabbedPane.add(stringSemesterNumber, new ScrollPane());

		Font f = new Font("serif", Font.PLAIN, 24);
		JComponent pnlSemester = makeTextPanel2(stringSemesterNumber);
		tabbedPane.addTab(stringSemesterNumber, pnlSemester);
		tabbedPane.setFont(f);
		initTabComponent(tabbedPane.getTabCount() - 1);
		semesterNumber++;
		// frame.add(new GPA_Gui(), BorderLayout.NORTH);
	}
}
