package GPACalculator.popups;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import GPACalculator.student.Student;

public class PopClickListener3 extends MouseAdapter {
	

	public static MouseListener createDialog(JLabel b, final String message, Student student) {
	    //                                    ^^^^^
	    MouseListener mouseListener = new MouseAdapter() {
	        public void mousePressed(MouseEvent mouseEvent) {
	            if (SwingUtilities.isRightMouseButton(mouseEvent)) {
	               doPop(mouseEvent, message, student);
	            }
	        }
	    };
	    return mouseListener;
	}
	
	
	//public void mousePressed(MouseEvent e, String s){
		//if (e.isPopupTrigger())
			//doPop(e, s);
    //}
	
    //public void mouseReleased(MouseEvent e, String s){
        //if (e.isPopupTrigger())
            //doPop(e, s);
    //}

    private static void doPop(MouseEvent e, String s, Student student){
    	//String s = new String("Class 1");
        PopUpDemo3 menu = new PopUpDemo3(s, student);
        menu.show(e.getComponent(), e.getX(), e.getY());
    }
}