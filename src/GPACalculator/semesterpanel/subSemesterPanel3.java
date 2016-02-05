package GPACalculator.semesterpanel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.JTabbedPane;


public class subSemesterPanel3 extends JTabbedPane {
	public subSemesterPanel3(String s) {
		Font f = new Font("serif", Font.PLAIN, 24);
		Dimension d1 = new Dimension(300, 1200);
		this.setPreferredSize(d1);
		this.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		
		subSemesterTextPanel3 pnlTree = new subSemesterTextPanel3("Student Tree View");
		this.addTab("Student Tree View", pnlTree);
		this.setMnemonicAt(0, KeyEvent.VK_3);
		this.setFont(f);
	}
}
