package GPACalculator.semesterpanel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;

import GPACalculator.buttontabcomponents.ButtonTabComponent2;
import GPACalculator.buttontabcomponents.ButtonTabComponent3;
import GPACalculator.buttontabcomponents.ButtonTabComponent4;


public class SemesterPanel extends JPanel{
	
	private static JComponent pnlAll;
	private static subSemesterPanel1 tabbedPane1;
	private static subSemesterPanel2 tabbedPane2;
	private static subSemesterPanel3 tabbedPane3;
	static JComponent pnlInnerSemester;
	static JComponent pnlInnerSettings;
	static JComponent pnlSemester;
	static JComponent pnlSettings;
	static JComponent pnlTreeContainer;
	static JComponent pnlTree;
	static String s2;
		
	public SemesterPanel(String s) {

		super(new GridLayout(2, 1));
		Dimension d1 = new Dimension(400, 800);
		Dimension d2 = new Dimension(900, 800);
		Dimension d3 = new Dimension(200, 800);
		Dimension d4 = new Dimension(1500, 800);

		tabbedPane1 = new subSemesterPanel1(s);
		tabbedPane2 = new subSemesterPanel2(s);
		tabbedPane3 = new subSemesterPanel3(s);
			
		pnlAll = new JPanel();
		pnlAll.setPreferredSize(d4);
		pnlAll.setLayout(new BoxLayout(pnlAll, BoxLayout.X_AXIS));
			
		pnlTreeContainer = new JPanel();
		pnlTreeContainer.setPreferredSize(d3);
		pnlTreeContainer.add(tabbedPane3);
			
		pnlSettings = new JPanel();
		pnlSettings.setPreferredSize(d1);
		pnlSettings.add(tabbedPane1);

		pnlSemester = new JPanel();
		pnlSemester.setPreferredSize(d2);
		pnlSemester.add(tabbedPane2);
			
			// Add the tabbed pane to this panel.
		initTabComponent(0);
		initTabComponent2(0);
		initTabComponent3(0);
			
		pnlAll.add(pnlTreeContainer);
		pnlAll.add(pnlSemester);
		pnlAll.add(pnlSettings);
			
		add(pnlAll);
	}

	private static void initTabComponent(int i) {
		tabbedPane1.setTabComponentAt(i, new ButtonTabComponent3(tabbedPane1));
	}
		
	private static void initTabComponent2(int i) {
		tabbedPane2.setTabComponentAt(i, new ButtonTabComponent2(tabbedPane2));
	}
		
	private static void initTabComponent3(int i) {
		tabbedPane3.setTabComponentAt(i, new ButtonTabComponent4(tabbedPane3));
	}

	protected static JComponent makeTextPanel1(String text) {
		subSemesterTextPanel1 textPanel1 = new subSemesterTextPanel1(text);
		return textPanel1;
	}

	protected static JComponent makeTextPanel2(String text) {
		subSemesterTextPanel2 makeTextPanel2 = new subSemesterTextPanel2(text);
		return makeTextPanel2;
	}
		
	protected static JComponent makeTextPanel3(String text) {
		subSemesterTextPanel3 textPanel3 = new subSemesterTextPanel3(text);
		return textPanel3;
	}
		
	public static BufferedImage resize(BufferedImage img, int newW, int newH) {  
		int w = img.getWidth();  
	    int h = img.getHeight();  
	    BufferedImage dimg = new BufferedImage(newW, newH, img.getType());  
	    Graphics2D g = dimg.createGraphics();  
	    g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
	    RenderingHints.VALUE_INTERPOLATION_BILINEAR);  
	    g.drawImage(img, 0, 0, newW, newH, 0, 0, w, h, null);  
	    g.dispose();  
	    return dimg;  
		}  

		
	public final static void addSemester(String s) {

		Font f = new Font("serif", Font.PLAIN, 24);
		JComponent pnlSemester1 = makeTextPanel2(s);
		tabbedPane2.addTab(s , pnlSemester1);
		tabbedPane2.setFont(f);
		initTabComponent2(tabbedPane2.getTabCount() - 1);

		JComponent pnlSettings1 = makeTextPanel1(s + " Settings");
		tabbedPane1.addTab(s + " Settings", pnlSettings1);
		tabbedPane1.setFont(f);
		initTabComponent(tabbedPane1.getTabCount() - 1);
		// frame.add(new GPA_Gui(), BorderLayout.NORTH);
	}
		
	public final static void addSettingView(String semester) {
		Font f = new Font("serif", Font.PLAIN, 24);
		JComponent pnlSemester = makeTextPanel1(semester);
		tabbedPane1.addTab(semester, pnlSemester);
		tabbedPane1.setFont(f);
		initTabComponent(tabbedPane1.getTabCount() - 1);
	}
		
}
