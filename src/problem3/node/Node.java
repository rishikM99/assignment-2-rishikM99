/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
import problem3.student.Student;
package problem3.node;

public class Node {
	private Student data=new Student();
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
