package GPACalculator.popups;


import java.awt.Font;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class PopUpDemo2 extends JPopupMenu {
    JMenuItem anItem;
    public PopUpDemo2(String s){
    	Font f = new Font("serif", Font.PLAIN, 24);
        anItem = new JMenuItem("Edit " + s);
        anItem.setFont(f);
        add(anItem);
    }
}