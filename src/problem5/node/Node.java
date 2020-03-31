/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
import problem5.student.*;
package problem5.node;
// to define node properties
public class Node {
  public String toString() {
		return "["+data + ", "+ next + "]";
	}
	private Student data;
	private Node next;
	public Node(Student data) {
		this.data=data;
		next=null;
		// TODO Auto-generated constructor stub
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Student getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}


}
