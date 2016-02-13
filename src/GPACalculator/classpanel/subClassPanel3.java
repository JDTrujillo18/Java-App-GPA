package GPACalculator.classpanel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.JTabbedPane;

import GPACalculator.semesterpanel.subSemesterTextPanel2;
import GPACalculator.semesterpanel.subSemesterTextPanel3;

public class subClassPanel3 extends JTabbedPane {
	public subClassPanel3(String s) {
		Font f = new Font("serif", Font.PLAIN, 24);
		Dimension d1 = new Dimension(300, 1200);
		this.setPreferredSize(d1);
		this.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		
		subClassTextPanel3 pnlTree = new subClassTextPanel3("Student Tree View");
		this.addTab("Student Tree View", pnlTree);
		this.setMnemonicAt(0, KeyEvent.VK_3);
		this.setFont(f);
	}
}