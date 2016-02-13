package GPACalculator.studentpanel;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.UIManager;


	 
	public class studentMenu extends JMenuBar {
	// Initialize Menus
	    JMenu menuFile;
	    JMenu menuNew;
		JMenu menuEdit;
		JMenu menuEditSemester;
		JMenu menuView;
		// Initialize MenuItems
		JMenuItem menuItemQuit;
		JMenuItem menuItemNewStudent;
		JMenuItem menuItemNewSemester;
		JMenuItem menuItemSettings;
		JMenuItem menuItemOpen;
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

		static final int semesterNumber = 8;
		
	    public studentMenu() {
	    	Font fmenu = new Font("sans-serif", Font.PLAIN, 30);
			UIManager.put("Menu.font", fmenu);
			UIManager.put("MenuItem.font", fmenu);
	        menuFile = new JMenu("File");
	        menuFile = new JMenu("File");
			menuFile.setMnemonic(KeyEvent.VK_A);
			
			menuNew = new JMenu("New");
			// Build the Edit menu.
			menuEdit = new JMenu("Edit");
			menuEditSemester = new JMenu("Edit Semester");
			
			menuView = new JMenu("View");
			
			// a group of JMenuItems
			menuItemQuit = new JMenuItem("Quit", KeyEvent.VK_T);
			menuItemQuit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
			menuItemQuit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent actionEvent) {
					System.exit(0);
				}
			});

			menuItemNewStudent = new JMenuItem("Student", KeyEvent.VK_2);
			menuItemNewStudent.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
			menuItemNewStudent.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent actionEvent) {

				}
			});

			menuItemNewSemester = new JMenuItem("Semester", KeyEvent.VK_3);
			menuItemNewSemester.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK));
			menuItemNewSemester.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent actionEvent) {
					//semesterNumber = semesterNumber + 1;
					//SemesterPanel.addSemester(semesterNumber);
					//JMenuItem menuItemNewSemesterX = new JMenuItem("Semester " + Integer.toString(semesterNumber));
					//menuItemNewSemesterX.addActionListener(new ActionListener() {
						//public void actionPerformed(ActionEvent actionEvent) {
						//	EditSemester_Gui.createAndShowGUI("Semester " + Integer.toString(semesterNumber));
						//	GPA_Gui.makeInvisible();
						//}
					//});
					//menuEditSemester.add(menuItemNewSemesterX);
				}
			});
			
			menuItemSettings = new JMenuItem("Settings");
			menuItemSettings.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent actionEvent){
					
				}
			});
			
			menuItemOpen = new JMenuItem("Open");
			menuItemOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
			menuItemOpen.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent actionEvent) {
					//Create a file chooser
					JFrame frame = new JFrame("Save File");
					final JFileChooser fc = new JFileChooser();
					setFileChooserFont(fc.getComponents());
					Dimension d1 = new Dimension(1350, 1200);
			        fc.setPreferredSize(d1);
					//In response to a button click:
					int returnVal = fc.showOpenDialog(frame);
				}
			});
			
			menuItemSave = new JMenuItem("Save");
			menuItemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
			menuItemSave.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent actionEvent) {
					//Create a file chooser
					JFrame frame = new JFrame("Save File");
					final JFileChooser fc = new JFileChooser();
					setFileChooserFont(fc.getComponents());
					Dimension d1 = new Dimension(1350, 1200);
			        fc.setPreferredSize(d1);
					//In response to a button click:
					int returnVal = fc.showSaveDialog(frame);
				}
			});
			
			menuItemSaveAs = new JMenuItem("Save As");
			menuItemSaveAs.setAccelerator(KeyStroke.getKeyStroke("control shift S"));
			menuItemSaveAs.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent actionEvent) {
					
				}
			});
			
			menuItemSaveAll = new JMenuItem("Save All");
			menuItemSaveAll.setAccelerator(KeyStroke.getKeyStroke("alt shift S"));
			menuItemSaveAll.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent actionEvent) {
					
				}
			});

			menuItemEditSemester1 = new JMenuItem("Semester 1");
			menuItemEditSemester1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent actionEvent) {
					//EditSemester_Gui.createAndShowGUI("Semester 1");
					//GPA_Gui.makeInvisible();
				}
			});
			menuItemEditSemester2 = new JMenuItem("Semester 2");
			menuItemEditSemester2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent actionEvent) {
					//EditSemester_Gui.createAndShowGUI("Semester 2");
					//GPA_Gui.makeInvisible();
				}
			});
			menuItemEditSemester3 = new JMenuItem("Semester 3");
			menuItemEditSemester3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent actionEvent) {
					//EditSemester_Gui.createAndShowGUI("Semester 3");
					//GPA_Gui.makeInvisible();
				}
			});
			menuItemEditSemester4 = new JMenuItem("Semester 4");
			menuItemEditSemester4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent actionEvent) {
					//EditSemester_Gui.createAndShowGUI("Semester 4");
					//GPA_Gui.makeInvisible();
				}
			});
			menuItemEditSemester5 = new JMenuItem("Semester 5");
			menuItemEditSemester5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent actionEvent) {
					//EditSemester_Gui.createAndShowGUI("Semester 5");
					//GPA_Gui.makeInvisible();
				}
			});
			menuItemEditSemester6 = new JMenuItem("Semester 6");
			menuItemEditSemester6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent actionEvent) {
					//EditSemester_Gui.createAndShowGUI("Semester 6");
					//GPA_Gui.makeInvisible();
				}
			});
			menuItemEditSemester7 = new JMenuItem("Semester 7");
			menuItemEditSemester7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent actionEvent) {
					//EditSemester_Gui.createAndShowGUI("Semester7");
					//GPA_Gui.makeInvisible();
				}
			});
			menuItemEditSemester8 = new JMenuItem("Semester 8");
			menuItemEditSemester8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent actionEvent) {
					//EditSemester_Gui.createAndShowGUI("Semester 8");
					//GPA_Gui.makeInvisible();
				}
			});

			
			menuItemStudentView = new JMenuItem("Student View");
			menuItemStudentView.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
			menuItemStudentView.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent actionEvent){
					
				}
			});
			
			menuItemSemesterView = new JMenuItem("Semester View");
			menuItemSemesterView.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));
			menuItemSemesterView.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent actionEvent){
					//EditSemester_Gui.makeVisible();
					//GPA_Gui.makeInvisible();
				}
			});
			
			menuItemClassView = new JMenuItem("Class View");
			menuItemClassView.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
			menuItemClassView.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent actionEvent){
					//EditClass_Gui.makeVisible();
					//GPA_Gui.makeInvisible();
				}
			});
	        this.add(menuFile); 
	        this.add(menuFile);
			menuFile.add(menuNew);
			this.add(menuEdit);
			this.add(menuView);
			
			// Add Exit Item to File Menu.
			menuNew.add(menuItemNewStudent);
			menuNew.add(menuItemNewSemester);
			menuFile.addSeparator();
			menuFile.add(menuItemOpen);
			menuFile.add(menuItemSave);
			menuFile.add(menuItemSaveAs);
			menuFile.add(menuItemSaveAll);
			menuFile.addSeparator();
			menuFile.add(menuItemSettings);
			menuFile.addSeparator();
			menuFile.add(menuItemQuit);
			
			menuEdit.add(menuEditSemester);
			
			menuEditSemester.add(menuItemEditSemester1);
			menuEditSemester.add(menuItemEditSemester2);
			menuEditSemester.add(menuItemEditSemester3);
			menuEditSemester.add(menuItemEditSemester4);
			menuEditSemester.add(menuItemEditSemester5);
			menuEditSemester.add(menuItemEditSemester6);
			menuEditSemester.add(menuItemEditSemester7);
			menuEditSemester.add(menuItemEditSemester8);
			
			menuView.add(menuItemStudentView);
			menuView.add(menuItemSemesterView);
			menuView.add(menuItemClassView);
	        
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

