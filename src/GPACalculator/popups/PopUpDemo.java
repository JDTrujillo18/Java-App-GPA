package GPACalculator.popups;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class PopUpDemo extends JPopupMenu {
    JMenuItem anItem;
    public PopUpDemo(String s){
    	Font f = new Font("serif", Font.PLAIN, 24);
        anItem = new JMenuItem("Edit " + s);
        anItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent actionEvent) {
				//EditClass_Gui.createAndShowGUI(s);
				//GPA_Gui.makeInvisible();
				//EditSemester_Gui.makeInvisible();
			}
		});
        anItem.setFont(f);
        add(anItem);
    }
}