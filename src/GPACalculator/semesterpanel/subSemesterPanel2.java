package GPACalculator.semesterpanel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.JTabbedPane;

public class subSemesterPanel2 extends JTabbedPane {
	public subSemesterPanel2(String s) {
		Font f = new Font("serif", Font.PLAIN, 24);
		Dimension d1 = new Dimension(900, 800);
		this.setPreferredSize(d1);
		this.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		
		subSemesterTextPanel2 pnlInnerSemester = new subSemesterTextPanel2(s);
		this.addTab(s, pnlInnerSemester);
		this.setMnemonicAt(0, KeyEvent.VK_2);
		this.setFont(f);
	}
}
