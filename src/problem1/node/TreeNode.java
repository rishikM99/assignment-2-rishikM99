/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.node;

public class TreeNode {
  private int data;
	private TreeNode lower;
	private TreeNode higher;
	
	public TreeNode(int data) {
		this.data=data;
		higher=null;
		lower=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLower() {
		return lower;
	}

	public void setLower(TreeNode lower) {
		this.lower = lower;
	}

	public TreeNode getHigher() {
		return higher;
	}

	public void setHigher(TreeNode higher) {
		this.higher = higher;
	}
	

}
