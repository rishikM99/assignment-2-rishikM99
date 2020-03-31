/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
import problem1.node.*;
import problem1.mybst.*;
package problem1.main;
// executable class

public class MyMain {
  public static int travleft(TreeNode node,int count) {
		if (node.getLower()!=null) {
			System.out.println(node.getLower().getData());
		}
		else {
			count=count+1;
		}
		if(node.getLower()!=null) {
			count=travleft(node.getLower(),count);
		}
		if(node.getHigher()!=null) {
			count=travleft(node.getHigher(),count);
		}
		return(count);
		
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
		int count=0;
		System.out.println(travleft(tree.getRoot(),count));
	
		
		
	}

}
