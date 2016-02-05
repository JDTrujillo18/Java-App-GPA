package GPACalculator.buttontabcomponents;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class ButtonTabComponent5 extends JPanel {
	private final JTabbedPane pane;

	public ButtonTabComponent5(final JTabbedPane pane) {
		// unset default FlowLayout gaps
		super(new FlowLayout(FlowLayout.LEFT, 0, 0));
		if (pane == null) {
			throw new NullPointerException("TabbedPane is null");
		}
		this.pane = pane;
		setOpaque(false);

		// make JLabel read titles from JTabbedPane
		JLabel label = new JLabel() {
			public String getText() {
				int i = pane.indexOfTabComponent(ButtonTabComponent5.this);
				if (i != -1) {
					return pane.getTitleAt(i);
				}
				return null;
			}
		};

		add(label);
		// add more space between the label and the button
		label.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
		// tab button
		JButton button = new TabButton();
		add(button);
		// add more space to the top of the component
		setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
	}

	private class TabButton extends JButton implements ActionListener {
		public TabButton() {
			int size = 17;
			setPreferredSize(new Dimension(size, size));
			setToolTipText("close this tab");
			// Make the button looks the same for all Lafs
			setUI(new BasicButtonUI());
			// Make it transparent
			setContentAreaFilled(false);
			// No need to be focusable
			setFocusable(false);
			setBorder(BorderFactory.createEtchedBorder());
			setBorderPainted(false);
			// Making nice rollover effect
			// we use the same listener for all buttons
			addMouseListener(buttonMouseListener);
			setRolloverEnabled(true);
			// Close the proper tab by clicking the button
			addActionListener(this);
		}

		public void actionPerformed(ActionEvent e) {
			int i = pane.indexOfTabComponent(ButtonTabComponent5.this);
			if (i != -1) {
			    String title = "Confirm Delete";
			    // display the JOptionPane showConfirmDialog

			    int reply = JOptionPane.showConfirmDialog(null, getPanel(), title, JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
			    
			    if (reply == JOptionPane.OK_OPTION){
			    	pane.remove(i);
			    }
			}
		}
		
		private JPanel getPanel() {
	        JPanel panel = new JPanel();
	        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	        JLabel label = new JLabel("This class will be removed from view, but not deleted.");
	        JLabel confirm = new JLabel("         Confirm removal?");
	        JLabel empty = new JLabel("     ");
	        JCheckBox checkBox = new JCheckBox("Don't show this message in the future");
	        
	        BufferedImage image = null;
			try {
				image = ImageIO.read(new File(ButtonTabComponent.class.getResource("/images/question.png").toURI()));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (URISyntaxException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

	        BufferedImage image2 = resize(image, 20, 20);
	        ImageIcon buttonIcon = new ImageIcon(image2);
	        label.setIcon(buttonIcon);
	        panel.add(label);
	        panel.add(confirm);
	        panel.add(empty);
	        panel.add(checkBox);

	        return panel;
	    }
		
		public BufferedImage resize(BufferedImage img, int newW, int newH) {  
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
		
		// we don't want to update UI for this button
		public void updateUI() {
		}

		// paint the cross
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g.create();
			// shift the image for pressed buttons
			if (getModel().isPressed()) {
				g2.translate(1, 1);
			}
			g2.setStroke(new BasicStroke(2));
			g2.setColor(Color.BLACK);
			if (getModel().isRollover()) {
				g2.setColor(Color.RED);
			}
			int delta = 6;
			g2.drawLine(delta, delta, getWidth() - delta - 1, getHeight() - delta - 1);
			g2.drawLine(getWidth() - delta - 1, delta, delta, getHeight() - delta - 1);
			g2.dispose();
		}
	}

	private final static MouseListener buttonMouseListener = new MouseAdapter() {
		public void mouseEntered(MouseEvent e) {
			Component component = e.getComponent();
			if (component instanceof AbstractButton) {
				AbstractButton button = (AbstractButton) component;
				button.setBorderPainted(true);
			}
		}

		public void mouseExited(MouseEvent e) {
			Component component = e.getComponent();
			if (component instanceof AbstractButton) {
				AbstractButton button = (AbstractButton) component;
				button.setBorderPainted(false);
			}
		}
	};
}