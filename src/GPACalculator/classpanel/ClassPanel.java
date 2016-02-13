package GPACalculator.classpanel;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;

import GPACalculator.buttontabcomponents.ButtonTabComponent2;
import GPACalculator.buttontabcomponents.ButtonTabComponent4;
import GPACalculator.buttontabcomponents.ButtonTabComponent5;
import GPACalculator.popups.PopClickListener2;
import GPACalculator.semesterpanel.subSemesterTextPanel1;
import GPACalculator.semesterpanel.subSemesterTextPanel2;
import GPACalculator.semesterpanel.subSemesterTextPanel3;

public class ClassPanel extends JPanel {
	private static JTabbedPane tabbedPane2;
	private static JComponent pnlAll;
	private static subClassPanel1 tabbedPane1;
	private static JTabbedPane tabbedPane3;
	static JComponent pnlInnerSemester;
	static JComponent pnlInnerSettings;
	static JComponent pnlSemester;
	static JComponent pnlSettings;
	static JComponent pnlTreeContainer;
	static JComponent pnlTree;
	
	static BufferedImage buttonIcon = null;
	static BufferedImage buttonIcon3 = null;
	
	public ClassPanel(String s) {
		super(new GridLayout(2, 1));
		Font f = new Font("serif", Font.PLAIN, 24);
		Dimension d1 = new Dimension(600, 1200);
		Dimension d2 = new Dimension(1350, 1200);
		Dimension d3 = new Dimension(300, 1200);
		Dimension d4 = new Dimension(2250, 1200);
		try {
			buttonIcon = ImageIO.read((getClass().getResource("/images/minus.png")));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			buttonIcon3 = ImageIO.read((getClass().getResource("/images/plus.png")));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
		tabbedPane1 = new subClassPanel1(s);
		tabbedPane2 = new subClassPanel2(s);
		tabbedPane3 = new subClassPanel3(s);

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
		
		this.add(pnlAll);
	}
	
	private static void initTabComponent(int i) {
		tabbedPane1.setTabComponentAt(i, new ButtonTabComponent5(tabbedPane1));
	}
	
	private static void initTabComponent2(int i) {
		tabbedPane2.setTabComponentAt(i, new ButtonTabComponent2(tabbedPane2));
	}
	
	private static void initTabComponent3(int i) {
		tabbedPane3.setTabComponentAt(i, new ButtonTabComponent4(tabbedPane3));
	}
	
	protected static JComponent makeTextPanel1(String text) {
		subClassTextPanel1 textPanel1 = new subClassTextPanel1(text);
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
	
	static int semesterNumber = 9;
	static String stringSemesterNumber = Integer.toString(semesterNumber);
	
	public final static void addClass() {
		String stringSemesterNumber = "Semester #" + Integer.toString(semesterNumber);
		// tabbedPane.add(stringSemesterNumber, new ScrollPane());

		Font f = new Font("serif", Font.PLAIN, 24);
		JComponent pnlSemester = makeTextPanel2(stringSemesterNumber);
		tabbedPane2.addTab(stringSemesterNumber, pnlSemester);
		tabbedPane2.setFont(f);
		initTabComponent(tabbedPane2.getTabCount() - 1);
		semesterNumber++;
		// frame.add(new GPA_Gui(), BorderLayout.NORTH);
	}
}
