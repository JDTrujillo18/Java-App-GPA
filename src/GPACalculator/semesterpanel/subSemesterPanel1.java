package GPACalculator.semesterpanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.JTabbedPane;

public class subSemesterPanel1 extends JTabbedPane {

	public subSemesterPanel1(String s) {
		
		Font f = new Font("serif", Font.PLAIN, 24);
		Dimension d1 = new Dimension(600, 1200);
		this.setPreferredSize(d1);
		this.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		
		
		subSemesterTextPanel1 pnlInnerSettings = new subSemesterTextPanel1(s + " Settings");
		this.addTab(s + " Settings", pnlInnerSettings);
		this.setMnemonicAt(0, KeyEvent.VK_1);
		this.setFont(f);
	}
}

