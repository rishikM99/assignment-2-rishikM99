/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
import problem1.mybst.*;
import problem1.node.*;

package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
  public void traverse(TreeNode node,int mode) {
    /*preorder is 1 and postorder is 0*/
		if(mode==0) {
			if(node!=null) {
				traverse(node.getLower(),2);
				traverse(node.getHigher(),2);
				System.out.print(node.getData()+" ");
			}
		}
		else if(mode==1) {
			if(node!=null) {
				System.out.print(node.getData()+" ");
				traverse(node.getLower(),2);
				traverse(node.getHigher(),2);
				
				
			}
		}
	}
	public static void main(String[] a) {
		Tree tree = new Tree();
		tree.insert(5);
		tree.insert(2);
		tree.insert(9);
		tree.insert(1);
		tree.insert(3);
		tree.insert(6);
		tree.insert(10);
		tree.insert(4);
		tree.insert(8);
    /*this mode 0 shows the postorder traversal and we can see the root '5' is at the last*/
    traverse(tree.getRoot(),0);
    /*this mode 1 shows the preorder traversal and we can see the root '5' is at the first position */
    traverse(tree.getRoot(),1);
    /*and the mid positions are different for both traversal methods*/
	
		
		
	}
}
