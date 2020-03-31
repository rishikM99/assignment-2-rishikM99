/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
import problem1.node.TreeNode;
package problem1.mybst;
// to implement BinarySearchTree
public class MyBinarySearchTree {
  private TreeNode root;
	
	public void insert(int data) {
		TreeNode node = new TreeNode(data);
		if(root==null) {
			root=node;
		}
		else {
			TreeNode temp=root;
			TreeNode parent = null;
			while(temp!=null) {
				parent = temp;
				if(temp.getData()<=node.getData()) {
					temp=temp.getHigher();
				}
				else {
					temp=temp.getLower();
				}
				
			}
			if(node.getData()<=parent.getData()) {
				parent.setLower(node);
			}
			else {
				parent.setHigher(node);
			}
			
		}
		
	}
	public TreeNode getRoot() {
		return root;
	}
	public boolean search(int data) {
		boolean answer=false;
		TreeNode temp=root;
		while(temp!=null) {
			if(temp.getData()<data) {
				temp=temp.getHigher();
			}
			else if(temp.getData()>data) {
				temp=temp.getLower();
			}
			else {
				answer=true;
			}
		
		}
		return(answer);
		
	}
	public boolean delete(int data) {
		boolean answer=false;
		TreeNode node=root;
		TreeNode parent=null;
		while(node!=null) {
			parent=node;
			if(node.getData()>data) {
				if(node.getLower()!=null) {
					parent=node;
					node=node.getLower();
				}
				else {
					break;
				}
				
				
			}
			else if(node.getData()<data) {
				if(node.getHigher()!=null) {
					parent=node;
					node=node.getHigher();
				}
				else {
					break;
				}
			}
			else {
				
				answer=true;
				if(node.getHigher()==null && node.getLower()==null) {
					if(parent.getHigher()==node) {
						parent.setHigher(null);
					}
					else if(parent.getLower()==node) {
						parent.setLower(null);
					}
				}
				else if(node.getHigher()!=null){
					if(parent.getHigher()==node) {
						parent.setHigher(node.getLower());
					}
					else if(parent.getLower()==node) {
						parent.setLower(node.getLower());
					}
				}
				else if(node.getLower()!=null){
					node=node.getLower();
					if(parent.getHigher()==node) {
						TreeNode temp=node.getLower();
						if(temp.getHigher()!=null) {
							temp=temp.getHigher();
						}
						parent.setHigher(temp);
					}
					else if(parent.getLower()==node) {
						TreeNode temp=node.getLower();
						if(temp.getHigher()!=null) {
							temp=temp.getHigher();
						}
						parent.setLower(temp);
					}
				}
					
				}
				break;
			}
		
		return(answer);
	}
	
	

}
