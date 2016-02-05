package GPACalculator.semesterpanel;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.TreeSelectionModel;

import GPACalculator.nodes.createNodes2;


public class subSemesterTextPanel3 extends JPanel{
	
	public subSemesterTextPanel3(String text) {
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		//Create the nodes.
        createNodes2 createNodes2 = new createNodes2(text);
        //Create a tree that allows one selection at a time.
        JTree tree = new JTree(createNodes2);
        tree.getSelectionModel().setSelectionMode
                (TreeSelectionModel.SINGLE_TREE_SELECTION);
 
        //Create the scroll pane and add the tree to it. 
        JScrollPane treeView = new JScrollPane(tree);
		this.add(treeView);
	}
}
