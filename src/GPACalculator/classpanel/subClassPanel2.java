package GPACalculator.classpanel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.JTabbedPane;

import GPACalculator.semesterpanel.subSemesterTextPanel2;

public class subClassPanel2 extends JTabbedPane {
	public subClassPanel2(String s) {
		Font f = new Font("serif", Font.PLAIN, 24);
		Dimension d1 = new Dimension(1350, 1200);
		this.setPreferredSize(d1);
		this.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		
		subClassTextPanel2 pnlInnerSemester = new subClassTextPanel2(s);
		this.addTab(s, pnlInnerSemester);
		this.setMnemonicAt(0, KeyEvent.VK_2);
		this.setFont(f);
	}
}