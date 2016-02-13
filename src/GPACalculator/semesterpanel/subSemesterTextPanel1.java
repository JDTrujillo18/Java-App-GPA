package GPACalculator.semesterpanel;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.TreeSelectionModel;

import GPACalculator.nodes.createNodes1;

public class subSemesterTextPanel1 extends JPanel {
	public subSemesterTextPanel1(String text) {
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		//Create the nodes.
        createNodes1 createNodes1 = new createNodes1(text);
 
        //Create a tree that allows one selection at a time.
        JTree tree = new JTree(createNodes1);
        tree.getSelectionModel().setSelectionMode
                (TreeSelectionModel.SINGLE_TREE_SELECTION);
        tree.setFont(new Font("serif", Font.PLAIN, 24));
        //Create the scroll pane and add the tree to it. 
        JScrollPane treeView = new JScrollPane(tree);
		this.add(treeView);
	}
}
