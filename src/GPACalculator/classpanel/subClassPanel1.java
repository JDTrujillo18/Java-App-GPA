package GPACalculator.classpanel;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.JTabbedPane;

import GPACalculator.classpanel.subClassTextPanel1;

public class subClassPanel1 extends JTabbedPane {

	public subClassPanel1(String s) {
		Font f = new Font("serif", Font.PLAIN, 24);
		Dimension d1 = new Dimension(600, 1200);
		this.setPreferredSize(d1);
		this.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		
		subClassTextPanel1 pnlInnerSettings = new subClassTextPanel1(s + " Settings");
		this.addTab(s + " Settings", pnlInnerSettings);
		this.setMnemonicAt(0, KeyEvent.VK_1);
		this.setFont(f);
	}
}