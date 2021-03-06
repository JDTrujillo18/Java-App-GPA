package GPACalculator.popups;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import GPACalculator.frames.MainFrame;
import GPACalculator.student.Student;

public class PopUpDemo extends JPopupMenu {
    JMenuItem anItem;
    public PopUpDemo(String s, Student student){
    	Font f = new Font("serif", Font.PLAIN, 24);
        anItem = new JMenuItem("Edit " + s);
        anItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent actionEvent) {
				//EditClass_Gui.createAndShowGUI(s);
				//GPA_Gui.makeInvisible();
				//EditSemester_Gui.makeInvisible();
				MainFrame.showClassPanel(s, student);
			}
		});
        anItem.setFont(f);
        add(anItem);
    }
}