package GPACalculator.classpanel;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

import GPACalculator.student.Student;


public class classMenu extends JMenuBar{
	JMenu menuFile;
	JMenu menuNew;

	JMenu menuEdit;
	JMenu menuEditSemester;

	JMenu menuView;
	JMenu menuShowView;
	JMenu menuSemesterSettingsView;
	JMenu menuSemester1ClassSettingView;
	JMenu menuSemester2ClassSettingView;
	JMenu menuSemester3ClassSettingView;
	JMenu menuSemester4ClassSettingView;
	JMenu menuSemester5ClassSettingView;
	JMenu menuSemester6ClassSettingView;
	JMenu menuSemester7ClassSettingView;
	JMenu menuSemester8ClassSettingView;
	// Initialize MenuItems
	JMenuItem menuItemQuit;
	JMenuItem menuItemNewStudent;
	JMenuItem menuItemNewSemester;
	JMenuItem menuItemSettings;
	JMenuItem menuItemSave;
	JMenuItem menuItemSaveAs;
	JMenuItem menuItemSaveAll;
	JMenuItem menuItemEditSemester1;
	JMenuItem menuItemEditSemester2;
	JMenuItem menuItemEditSemester3;
	JMenuItem menuItemEditSemester4;
	JMenuItem menuItemEditSemester5;
	JMenuItem menuItemEditSemester6;
	JMenuItem menuItemEditSemester7;
	JMenuItem menuItemEditSemester8;
	JMenuItem menuItemStudentView;
	JMenuItem menuItemSemesterView;
	JMenuItem menuItemClassView;
	JMenuItem menuItemStudentTreeView;
	JMenuItem menuItemSemester1Class1SettingsView;
	JMenuItem menuItemSemester1Class2SettingsView;
	JMenuItem menuItemSemester1Class3SettingsView;
	JMenuItem menuItemSemester1Class4SettingsView;
	JMenuItem menuItemSemester1Class5SettingsView;
	JMenuItem menuItemSemester1Class6SettingsView;
	JMenuItem menuItemSemester1Class7SettingsView;
	JMenuItem menuItemSemester1Class8SettingsView;		
	JMenuItem menuItemSemester2Class1SettingsView;
	JMenuItem menuItemSemester2Class2SettingsView;
	JMenuItem menuItemSemester2Class3SettingsView;
	JMenuItem menuItemSemester2Class4SettingsView;
	JMenuItem menuItemSemester2Class5SettingsView;
	JMenuItem menuItemSemester2Class6SettingsView;
	JMenuItem menuItemSemester2Class7SettingsView;
	JMenuItem menuItemSemester2Class8SettingsView;		
	JMenuItem menuItemSemester3Class1SettingsView;
	JMenuItem menuItemSemester3Class2SettingsView;
	JMenuItem menuItemSemester3Class3SettingsView;
	JMenuItem menuItemSemester3Class4SettingsView;
	JMenuItem menuItemSemester3Class5SettingsView;
	JMenuItem menuItemSemester3Class6SettingsView;
	JMenuItem menuItemSemester3Class7SettingsView;
	JMenuItem menuItemSemester3Class8SettingsView;		
	JMenuItem menuItemSemester4Class1SettingsView;
	JMenuItem menuItemSemester4Class2SettingsView;
	JMenuItem menuItemSemester4Class3SettingsView;
	JMenuItem menuItemSemester4Class4SettingsView;
	JMenuItem menuItemSemester4Class5SettingsView;
	JMenuItem menuItemSemester4Class6SettingsView;
	JMenuItem menuItemSemester4Class7SettingsView;
	JMenuItem menuItemSemester4Class8SettingsView;	
	JMenuItem menuItemSemester5Class1SettingsView;
	JMenuItem menuItemSemester5Class2SettingsView;
	JMenuItem menuItemSemester5Class3SettingsView;
	JMenuItem menuItemSemester5Class4SettingsView;
	JMenuItem menuItemSemester5Class5SettingsView;
	JMenuItem menuItemSemester5Class6SettingsView;
	JMenuItem menuItemSemester5Class7SettingsView;
	JMenuItem menuItemSemester5Class8SettingsView;		
	JMenuItem menuItemSemester6Class1SettingsView;
	JMenuItem menuItemSemester6Class2SettingsView;
	JMenuItem menuItemSemester6Class3SettingsView;
	JMenuItem menuItemSemester6Class4SettingsView;
	JMenuItem menuItemSemester6Class5SettingsView;
	JMenuItem menuItemSemester6Class6SettingsView;
	JMenuItem menuItemSemester6Class7SettingsView;
	JMenuItem menuItemSemester6Class8SettingsView;		
	JMenuItem menuItemSemester7Class1SettingsView;
	JMenuItem menuItemSemester7Class2SettingsView;
	JMenuItem menuItemSemester7Class3SettingsView;
	JMenuItem menuItemSemester7Class4SettingsView;
	JMenuItem menuItemSemester7Class5SettingsView;
	JMenuItem menuItemSemester7Class6SettingsView;
	JMenuItem menuItemSemester7Class7SettingsView;
	JMenuItem menuItemSemester7Class8SettingsView;	
	JMenuItem menuItemSemester8Class1SettingsView;
	JMenuItem menuItemSemester8Class2SettingsView;
	JMenuItem menuItemSemester8Class3SettingsView;
	JMenuItem menuItemSemester8Class4SettingsView;
	JMenuItem menuItemSemester8Class5SettingsView;
	JMenuItem menuItemSemester8Class6SettingsView;
	JMenuItem menuItemSemester8Class7SettingsView;
	JMenuItem menuItemSemester8Class8SettingsView;
	
	public classMenu(Student student) {
		// Initialize Menus
		Font fmenu = new Font("sans-serif", Font.PLAIN, 30);
		UIManager.put("Menu.font", fmenu);
		UIManager.put("MenuItem.font", fmenu);

		
		menuFile = new JMenu("File");
		menuNew = new JMenu("New");
		menuEdit = new JMenu("Edit");
		menuView = new JMenu("View");
		menuShowView = new JMenu("Show View");
		menuSemesterSettingsView = new JMenu("Class Settings View");
		menuSemester1ClassSettingView = new JMenu("Semester 1");
		menuSemester2ClassSettingView = new JMenu("Semester 2");
		menuSemester3ClassSettingView = new JMenu("Semester 3");
		menuSemester4ClassSettingView = new JMenu("Semester 4");
		menuSemester5ClassSettingView = new JMenu("Semester 5");
		menuSemester6ClassSettingView = new JMenu("Semester 6");
		menuSemester7ClassSettingView = new JMenu("Semester 7");
		menuSemester8ClassSettingView = new JMenu("Semester 8");
		
		menuItemStudentView = new JMenuItem("Student View");
		menuItemStudentView.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
		menuItemStudentView.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent actionEvent){
				//GPA_Gui.makeVisible();
				//makeInvisible();
			}
		});
		
		menuItemSemesterView = new JMenuItem("Semester View");
		menuItemSemesterView.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
		menuItemSemesterView.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent actionEvent){
				//EditSemester_Gui.makeVisible();
				//makeInvisible();
			}
		});
		
		menuItemClassView = new JMenuItem("Class View");
		menuItemClassView.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
		menuItemClassView.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent actionEvent){
				
			}
		});
		
		menuItemStudentTreeView = new JMenuItem("Student Tree View");
		menuItemStudentTreeView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent){
				
			}
		});
		
		menuItemSemester1Class1SettingsView = new JMenuItem("Class 1 Settings");
		menuItemSemester1Class1SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings1 = makeTextPanel1("Semester 1 Class 1 Settings");
				//tabbedPane1.addTab("Semester 1 Class 1 Settings", pnlSettings1);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester1Class2SettingsView = new JMenuItem("Class 2 Settings");
		menuItemSemester1Class2SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings2 = makeTextPanel1("Semester 1 Class 2 Settings");
				//tabbedPane1.addTab("Semester 1 Class 2 Settings", pnlSettings2);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester1Class3SettingsView = new JMenuItem("Class 3 Settings");
		menuItemSemester1Class3SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings3 = makeTextPanel1("Semester 1 Class 3 Settings");
				//tabbedPane1.addTab("Semester 1 Class 3 Settings", pnlSettings3);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester1Class4SettingsView = new JMenuItem("Class 4 Settings");
		menuItemSemester1Class4SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings4 = makeTextPanel1("Semester 1 Class 4 Settings");
				//tabbedPane1.addTab("Semester 1 Class 4 Settings", pnlSettings4);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester1Class5SettingsView = new JMenuItem("Class 5 Settings");
		menuItemSemester1Class5SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings5 = makeTextPanel1("Semester 1 Class 5 Settings");
				//tabbedPane1.addTab("Semester 1 Class 5 Settings", pnlSettings5);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester1Class6SettingsView = new JMenuItem("Class 6 Settings");
		menuItemSemester1Class6SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings6 = makeTextPanel1("Semester 1 Class 6 Settings");
				//tabbedPane1.addTab("Semester 1 Class 6 Settings", pnlSettings6);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester1Class7SettingsView = new JMenuItem("Class 7 Settings");
		menuItemSemester1Class7SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings7 = makeTextPanel1("Semester 1 Class 7 Settings");
				//tabbedPane1.addTab("Semester 1 Class 7 Settings", pnlSettings7);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester1Class8SettingsView = new JMenuItem("Class 8 Settings");
		menuItemSemester1Class8SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings8 = makeTextPanel1("Semester 1 Class 8 Settings");
				//.addTab("Semester 1 Class 8 Settings", pnlSettings8);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester2Class1SettingsView = new JMenuItem("Class 1 Settings");
		menuItemSemester2Class1SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings1 = makeTextPanel1("Semester 2 Class 1 Settings");
				//tabbedPane1.addTab("Semester 2 Class 1 Settings", pnlSettings1);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester2Class2SettingsView = new JMenuItem("Class 2 Settings");
		menuItemSemester2Class2SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings2 = makeTextPanel1("Semester 2 Class 2 Settings");
				//tabbedPane1.addTab("Semester 2 Class 2 Settings", pnlSettings2);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester2Class3SettingsView = new JMenuItem("Class 3 Settings");
		menuItemSemester2Class3SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings3 = makeTextPanel1("Semester 2 Class 3 Settings");
				//tabbedPane1.addTab("Semester 2 Class 3 Settings", pnlSettings3);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester2Class4SettingsView = new JMenuItem("Class 4 Settings");
		menuItemSemester2Class4SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings4 = makeTextPanel1("Semester 2 Class 4 Settings");
				//tabbedPane1.addTab("Semester 2 Class 4 Settings", pnlSettings4);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester2Class5SettingsView = new JMenuItem("Class 5 Settings");
		menuItemSemester2Class5SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings5 = makeTextPanel1("Semester 2 Class 5 Settings");
				//tabbedPane1.addTab("Semester 2 Class 5 Settings", pnlSettings5);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester2Class6SettingsView = new JMenuItem("Class 6 Settings");
		menuItemSemester2Class6SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings6 = makeTextPanel1("Semester 2 Class 6 Settings");
				//tabbedPane1.addTab("Semester 2 Class 6 Settings", pnlSettings6);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester2Class7SettingsView = new JMenuItem("Class 7 Settings");
		menuItemSemester2Class7SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings7 = makeTextPanel1("Semester 2 Class 7 Settings");
				//tabbedPane1.addTab("Semester 2 Class 7 Settings", pnlSettings7);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester2Class8SettingsView = new JMenuItem("Class 8 Settings");
		menuItemSemester2Class8SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings8 = makeTextPanel1("Semester 2 Class 8 Settings");
				//tabbedPane1.addTab("Semester 2 Class 8 Settings", pnlSettings8);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester3Class1SettingsView = new JMenuItem("Class 1 Settings");
		menuItemSemester3Class1SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings1 = makeTextPanel1("Semester 3 Class 1 Settings");
				//tabbedPane1.addTab("Semester 3 Class 1 Settings", pnlSettings1);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester3Class2SettingsView = new JMenuItem("Class 2 Settings");
		menuItemSemester3Class2SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings2 = makeTextPanel1("Semester 3 Class 2 Settings");
				//tabbedPane1.addTab("Semester 3 Class 2 Settings", pnlSettings2);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester3Class3SettingsView = new JMenuItem("Class 3 Settings");
		menuItemSemester3Class3SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings3 = makeTextPanel1("Semester 3 Class 3 Settings");
				//tabbedPane1.addTab("Semester 3 Class 3 Settings", pnlSettings3);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester3Class4SettingsView = new JMenuItem("Class 4 Settings");
		menuItemSemester3Class4SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings4 = makeTextPanel1("Semester 3 Class 4 Settings");
				//tabbedPane1.addTab("Semester 3 Class 4 Settings", pnlSettings4);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester3Class5SettingsView = new JMenuItem("Class 5 Settings");
		menuItemSemester3Class5SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings5 = makeTextPanel1("Semester 3 Class 5 Settings");
				//tabbedPane1.addTab("Semester 3 Class 5 Settings", pnlSettings5);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester3Class6SettingsView = new JMenuItem("Class 6 Settings");
		menuItemSemester3Class6SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings6 = makeTextPanel1("Semester 3 Class 6 Settings");
				//tabbedPane1.addTab("Semester 3 Class 6 Settings", pnlSettings6);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester3Class7SettingsView = new JMenuItem("Class 7 Settings");
		menuItemSemester3Class7SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings7 = makeTextPanel1("Semester 3 Class 7 Settings");
				//tabbedPane1.addTab("Semester 3 Class 7 Settings", pnlSettings7);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester3Class8SettingsView = new JMenuItem("Class 8 Settings");
		menuItemSemester3Class8SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings8 = makeTextPanel1("Semester 3 Class 8 Settings");
				//tabbedPane1.addTab("Semester 3 Class 8 Settings", pnlSettings8);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester4Class1SettingsView = new JMenuItem("Class 1 Settings");
		menuItemSemester4Class1SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings1 = makeTextPanel1("Semester 4 Class 1 Settings");
				//tabbedPane1.addTab("Semester 4 Class 1 Settings", pnlSettings1);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester4Class2SettingsView = new JMenuItem("Class 2 Settings");
		menuItemSemester4Class2SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings2 = makeTextPanel1("Semester 4 Class 2 Settings");
				//tabbedPane1.addTab("Semester 4 Class 2 Settings", pnlSettings2);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester4Class3SettingsView = new JMenuItem("Class 3 Settings");
		menuItemSemester4Class3SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings3 = makeTextPanel1("Semester 4 Class 3 Settings");
				//tabbedPane1.addTab("Semester 4 Class 3 Settings", pnlSettings3);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester4Class4SettingsView = new JMenuItem("Class 4 Settings");
		menuItemSemester4Class4SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings4 = makeTextPanel1("Semester 4 Class 4 Settings");
				//tabbedPane1.addTab("Semester 4 Class 4 Settings", pnlSettings4);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester4Class5SettingsView = new JMenuItem("Class 5 Settings");
		menuItemSemester4Class5SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings5 = makeTextPanel1("Semester 4 Class 5 Settings");
				//tabbedPane1.addTab("Semester 4 Class 5 Settings", pnlSettings5);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester4Class6SettingsView = new JMenuItem("Class 6 Settings");
		menuItemSemester4Class6SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings6 = makeTextPanel1("Semester 4 Class 6 Settings");
				//tabbedPane1.addTab("Semester 4 Class 6 Settings", pnlSettings6);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester4Class7SettingsView = new JMenuItem("Class 7 Settings");
		menuItemSemester4Class7SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings7 = makeTextPanel1("Semester 4 Class 7 Settings");
				//tabbedPane1.addTab("Semester 4 Class 7 Settings", pnlSettings7);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester4Class8SettingsView = new JMenuItem("Class 8 Settings");
		menuItemSemester4Class8SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings8 = makeTextPanel1("Semester 4 Class 8 Settings");
				//tabbedPane1.addTab("Semester 4 Class 8 Settings", pnlSettings8);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester5Class1SettingsView = new JMenuItem("Class 1 Settings");
		menuItemSemester5Class1SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings1 = makeTextPanel1("Semester 5 Class 1 Settings");
				//tabbedPane1.addTab("Semester 5 Class 1 Settings", pnlSettings1);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester5Class2SettingsView = new JMenuItem("Class 2 Settings");
		menuItemSemester5Class2SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings2 = makeTextPanel1("Semester 5 Class 2 Settings");
				//tabbedPane1.addTab("Semester 5 Class 2 Settings", pnlSettings2);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester5Class3SettingsView = new JMenuItem("Class 3 Settings");
		menuItemSemester5Class3SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings3 = makeTextPanel1("Semester 5 Class 3 Settings");
				//tabbedPane1.addTab("Semester 5 Class 3 Settings", pnlSettings3);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester5Class4SettingsView = new JMenuItem("Class 4 Settings");
		menuItemSemester5Class4SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings4 = makeTextPanel1("Semester 5 Class 4 Settings");
				//tabbedPane1.addTab("Semester 5 Class 4 Settings", pnlSettings4);
				//tabbedPane1.setFont(f);
				//(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester5Class5SettingsView = new JMenuItem("Class 5 Settings");
		menuItemSemester5Class5SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings5 = makeTextPanel1("Semester 5 Class 5 Settings");
				//tabbedPane1.addTab("Semester 5 Class 5 Settings", pnlSettings5);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester5Class6SettingsView = new JMenuItem("Class 6 Settings");
		menuItemSemester5Class6SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings6 = makeTextPanel1("Semester 5 Class 6 Settings");
				//tabbedPane1.addTab("Semester 5 Class 6 Settings", pnlSettings6);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester5Class7SettingsView = new JMenuItem("Class 7 Settings");
		menuItemSemester5Class7SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings7 = makeTextPanel1("Semester 5 Class 7 Settings");
				//tabbedPane1.addTab("Semester 5 Class 7 Settings", pnlSettings7);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester5Class8SettingsView = new JMenuItem("Class 8 Settings");
		menuItemSemester5Class8SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings8 = makeTextPanel1("Semester 5 Class 8 Settings");
				//tabbedPane1.addTab("Semester 5 Class 8 Settings", pnlSettings8);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester6Class1SettingsView = new JMenuItem("Class 1 Settings");
		menuItemSemester6Class1SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings1 = makeTextPanel1("Semester 6 Class 1 Settings");
				//tabbedPane1.addTab("Semester 6 Class 1 Settings", pnlSettings1);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester6Class2SettingsView = new JMenuItem("Class 2 Settings");
		menuItemSemester6Class2SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings2 = makeTextPanel1("Semester 6 Class 2 Settings");
				//tabbedPane1.addTab("Semester 6 Class 2 Settings", pnlSettings2);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester6Class3SettingsView = new JMenuItem("Class 3 Settings");
		menuItemSemester6Class3SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings3 = makeTextPanel1("Semester 6 Class 3 Settings");
				//tabbedPane1.addTab("Semester 6 Class 3 Settings", pnlSettings3);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester6Class4SettingsView = new JMenuItem("Class 4 Settings");
		menuItemSemester6Class4SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings4 = makeTextPanel1("Semester 6 Class 4 Settings");
				//tabbedPane1.addTab("Semester 6 Class 4 Settings", pnlSettings4);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester6Class5SettingsView = new JMenuItem("Class 5 Settings");
		menuItemSemester6Class5SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings5 = makeTextPanel1("Semester 6 Class 5 Settings");
				//tabbedPane1.addTab("Semester 6 Class 5 Settings", pnlSettings5);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester6Class6SettingsView = new JMenuItem("Class 6 Settings");
		menuItemSemester6Class6SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings6 = makeTextPanel1("Semester 6 Class 6 Settings");
				//tabbedPane1.addTab("Semester 6 Class 6 Settings", pnlSettings6);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester6Class7SettingsView = new JMenuItem("Class 7 Settings");
		menuItemSemester6Class7SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings7 = makeTextPanel1("Semester 6 Class 7 Settings");
				//tabbedPane1.addTab("Semester 6 Class 7 Settings", pnlSettings7);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester6Class8SettingsView = new JMenuItem("Class 8 Settings");
		menuItemSemester6Class8SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings8 = makeTextPanel1("Semester 6 Class 8 Settings");
				//tabbedPane1.addTab("Semester 6 Class 8 Settings", pnlSettings8);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester7Class1SettingsView = new JMenuItem("Class 1 Settings");
		menuItemSemester7Class1SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings1 = makeTextPanel1("Semester 7 Class 1 Settings");
				//tabbedPane1.addTab("Semester 7 Class 1 Settings", pnlSettings1);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester7Class2SettingsView = new JMenuItem("Class 2 Settings");
		menuItemSemester7Class2SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings2 = makeTextPanel1("Semester 7 Class 2 Settings");
				//tabbedPane1.addTab("Semester 7 Class 2 Settings", pnlSettings2);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester7Class3SettingsView = new JMenuItem("Class 3 Settings");
		menuItemSemester7Class3SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings3 = makeTextPanel1("Semester 7 Class 3 Settings");
				//tabbedPane1.addTab("Semester 7 Class 3 Settings", pnlSettings3);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester7Class4SettingsView = new JMenuItem("Class 4 Settings");
		menuItemSemester7Class4SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings4 = makeTextPanel1("Semester 7 Class 4 Settings");
				//tabbedPane1.addTab("Semester 7 Class 4 Settings", pnlSettings4);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester7Class5SettingsView = new JMenuItem("Class 5 Settings");
		menuItemSemester7Class5SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings5 = makeTextPanel1("Semester 7 Class 5 Settings");
				//tabbedPane1.addTab("Semester 7 Class 5 Settings", pnlSettings5);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester7Class6SettingsView = new JMenuItem("Class 6 Settings");
		menuItemSemester7Class6SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings6 = makeTextPanel1("Semester 7 Class 6 Settings");
				//tabbedPane1.addTab("Semester 7 Class 6 Settings", pnlSettings6);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester7Class7SettingsView = new JMenuItem("Class 7 Settings");
		menuItemSemester7Class7SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings7 = makeTextPanel1("Semester 7 Class 7 Settings");
				//tabbedPane1.addTab("Semester 7 Class 7 Settings", pnlSettings7);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester7Class8SettingsView = new JMenuItem("Class 8 Settings");
		menuItemSemester7Class8SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings8 = makeTextPanel1("Semester 7 Class 8 Settings");
				//tabbedPane1.addTab("Semester 7 Class 8 Settings", pnlSettings8);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester8Class1SettingsView = new JMenuItem("Class 1 Settings");
		menuItemSemester8Class1SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings1 = makeTextPanel1("Semester 8 Class 1 Settings");
				//tabbedPane1.addTab("Semester 8 Class 1 Settings", pnlSettings1);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester8Class2SettingsView = new JMenuItem("Class 2 Settings");
		menuItemSemester8Class2SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings2 = makeTextPanel1("Semester 8 Class 2 Settings");
				//tabbedPane1.addTab("Semester 8 Class 2 Settings", pnlSettings2);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester8Class3SettingsView = new JMenuItem("Class 3 Settings");
		menuItemSemester8Class3SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings3 = makeTextPanel1("Semester 8 Class 3 Settings");
				//tabbedPane1.addTab("Semester 8 Class 3 Settings", pnlSettings3);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester8Class4SettingsView = new JMenuItem("Class 4 Settings");
		menuItemSemester8Class4SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings4 = makeTextPanel1("Semester 8 Class 4 Settings");
				//tabbedPane1.addTab("Semester 8 Class 4 Settings", pnlSettings4);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester8Class5SettingsView = new JMenuItem("Class 5 Settings");
		menuItemSemester8Class5SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings5 = makeTextPanel1("Semester 8 Class 5 Settings");
				//tabbedPane1.addTab("Semester 8 Class 5 Settings", pnlSettings5);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester8Class6SettingsView = new JMenuItem("Class 6 Settings");
		menuItemSemester8Class6SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings6 = makeTextPanel1("Semester 8 Class 6 Settings");
				//tabbedPane1.addTab("Semester 8 Class 6 Settings", pnlSettings6);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester8Class7SettingsView = new JMenuItem("Class 7 Settings");
		menuItemSemester8Class7SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings7 = makeTextPanel1("Semester 8 Class 7 Settings");
				//tabbedPane1.addTab("Semester 8 Class 7 Settings", pnlSettings7);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		menuItemSemester8Class8SettingsView = new JMenuItem("Class 8 Settings");
		menuItemSemester8Class8SettingsView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				//Font f = new Font("serif", Font.PLAIN, 24);
				//JComponent pnlSettings8 = makeTextPanel1("Semester 8 Class 8 Settings");
				//tabbedPane1.addTab("Semester 8 Class 8 Settings", pnlSettings8);
				//tabbedPane1.setFont(f);
				//initTabComponent(tabbedPane1.getTabCount() - 1);
			}
		});
		
		this.add(menuFile);
		menuFile.add(menuNew);
		this.add(menuEdit);
		this.add(menuView);
		
		menuView.add(menuItemStudentView);
		menuView.add(menuItemSemesterView);
		menuView.add(menuItemClassView);
		menuView.addSeparator();
		menuView.add(menuShowView);
		
		menuShowView.add(menuItemStudentTreeView);
		menuShowView.add(menuSemesterSettingsView);
		
		menuSemesterSettingsView.add(menuSemester1ClassSettingView);
		menuSemesterSettingsView.add(menuSemester2ClassSettingView);
		menuSemesterSettingsView.add(menuSemester3ClassSettingView);
		menuSemesterSettingsView.add(menuSemester4ClassSettingView);
		menuSemesterSettingsView.add(menuSemester5ClassSettingView);
		menuSemesterSettingsView.add(menuSemester6ClassSettingView);
		menuSemesterSettingsView.add(menuSemester7ClassSettingView);
		menuSemesterSettingsView.add(menuSemester8ClassSettingView);
		
		menuSemester1ClassSettingView.add(menuItemSemester1Class1SettingsView);
		menuSemester1ClassSettingView.add(menuItemSemester1Class2SettingsView);
		menuSemester1ClassSettingView.add(menuItemSemester1Class3SettingsView);
		menuSemester1ClassSettingView.add(menuItemSemester1Class4SettingsView);
		menuSemester1ClassSettingView.add(menuItemSemester1Class5SettingsView);
		menuSemester1ClassSettingView.add(menuItemSemester1Class6SettingsView);
		menuSemester1ClassSettingView.add(menuItemSemester1Class7SettingsView);
		menuSemester1ClassSettingView.add(menuItemSemester1Class8SettingsView);
		
		menuSemester2ClassSettingView.add(menuItemSemester2Class1SettingsView);
		menuSemester2ClassSettingView.add(menuItemSemester2Class2SettingsView);
		menuSemester2ClassSettingView.add(menuItemSemester2Class3SettingsView);
		menuSemester2ClassSettingView.add(menuItemSemester2Class4SettingsView);
		menuSemester2ClassSettingView.add(menuItemSemester2Class5SettingsView);
		menuSemester2ClassSettingView.add(menuItemSemester2Class6SettingsView);
		menuSemester2ClassSettingView.add(menuItemSemester2Class7SettingsView);
		menuSemester2ClassSettingView.add(menuItemSemester2Class8SettingsView);
		
		menuSemester3ClassSettingView.add(menuItemSemester3Class1SettingsView);
		menuSemester3ClassSettingView.add(menuItemSemester3Class2SettingsView);
		menuSemester3ClassSettingView.add(menuItemSemester3Class3SettingsView);
		menuSemester3ClassSettingView.add(menuItemSemester3Class4SettingsView);
		menuSemester3ClassSettingView.add(menuItemSemester3Class5SettingsView);
		menuSemester3ClassSettingView.add(menuItemSemester3Class6SettingsView);
		menuSemester3ClassSettingView.add(menuItemSemester3Class7SettingsView);
		menuSemester3ClassSettingView.add(menuItemSemester3Class8SettingsView);

		menuSemester4ClassSettingView.add(menuItemSemester4Class1SettingsView);
		menuSemester4ClassSettingView.add(menuItemSemester4Class2SettingsView);
		menuSemester4ClassSettingView.add(menuItemSemester4Class3SettingsView);
		menuSemester4ClassSettingView.add(menuItemSemester4Class4SettingsView);
		menuSemester4ClassSettingView.add(menuItemSemester4Class5SettingsView);
		menuSemester4ClassSettingView.add(menuItemSemester4Class6SettingsView);
		menuSemester4ClassSettingView.add(menuItemSemester4Class7SettingsView);
		menuSemester4ClassSettingView.add(menuItemSemester4Class8SettingsView);
		
		menuSemester5ClassSettingView.add(menuItemSemester5Class1SettingsView);
		menuSemester5ClassSettingView.add(menuItemSemester5Class2SettingsView);
		menuSemester5ClassSettingView.add(menuItemSemester5Class3SettingsView);
		menuSemester5ClassSettingView.add(menuItemSemester5Class4SettingsView);
		menuSemester5ClassSettingView.add(menuItemSemester5Class5SettingsView);
		menuSemester5ClassSettingView.add(menuItemSemester5Class6SettingsView);
		menuSemester5ClassSettingView.add(menuItemSemester5Class7SettingsView);
		menuSemester5ClassSettingView.add(menuItemSemester5Class8SettingsView);
		
		menuSemester6ClassSettingView.add(menuItemSemester6Class1SettingsView);
		menuSemester6ClassSettingView.add(menuItemSemester6Class2SettingsView);
		menuSemester6ClassSettingView.add(menuItemSemester6Class3SettingsView);
		menuSemester6ClassSettingView.add(menuItemSemester6Class4SettingsView);
		menuSemester6ClassSettingView.add(menuItemSemester6Class5SettingsView);
		menuSemester6ClassSettingView.add(menuItemSemester6Class6SettingsView);
		menuSemester6ClassSettingView.add(menuItemSemester6Class7SettingsView);
		menuSemester6ClassSettingView.add(menuItemSemester6Class8SettingsView);
		
		menuSemester7ClassSettingView.add(menuItemSemester7Class1SettingsView);
		menuSemester7ClassSettingView.add(menuItemSemester7Class2SettingsView);
		menuSemester7ClassSettingView.add(menuItemSemester7Class3SettingsView);
		menuSemester7ClassSettingView.add(menuItemSemester7Class4SettingsView);
		menuSemester7ClassSettingView.add(menuItemSemester7Class5SettingsView);
		menuSemester7ClassSettingView.add(menuItemSemester7Class6SettingsView);
		menuSemester7ClassSettingView.add(menuItemSemester7Class7SettingsView);
		menuSemester7ClassSettingView.add(menuItemSemester7Class8SettingsView);
	
		menuSemester8ClassSettingView.add(menuItemSemester8Class1SettingsView);
		menuSemester8ClassSettingView.add(menuItemSemester8Class2SettingsView);
		menuSemester8ClassSettingView.add(menuItemSemester8Class3SettingsView);
		menuSemester8ClassSettingView.add(menuItemSemester8Class4SettingsView);
		menuSemester8ClassSettingView.add(menuItemSemester8Class5SettingsView);
		menuSemester8ClassSettingView.add(menuItemSemester8Class6SettingsView);
		menuSemester8ClassSettingView.add(menuItemSemester8Class7SettingsView);
		menuSemester8ClassSettingView.add(menuItemSemester8Class8SettingsView);
	}
	
    public void setFileChooserFont(Component[] comp) {
    	Font font = new Font("sans-serif", Font.PLAIN, 24);
      for(int x = 0; x < comp.length; x++) {
        if(comp[x] instanceof Container) setFileChooserFont(((Container)comp[x]).getComponents());
        try{comp[x].setFont(font);}
        catch(Exception e){}//do nothing
      }
    }
    
}
