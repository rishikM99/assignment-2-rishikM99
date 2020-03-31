/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
import problem3.nyqueue.*;
package problem3.myqueue;

public class MyPriorityQueue {
  private CustomLinkedList l;
	private int population;
	public LinkedQueue() {
		l=new CustomLinkedList();
		population=0;
		
	}
	public void enqueue(Student data) {
    Node nods=new Node();
    nods.setData(data);
		Node temp=l.head;
    
    while(temp.getData().getId()<data.getId()):
    
      temp=temp.getNext();
  }
  Node temp2=temp;
  
  temp.setNext(nods);
  temp=temp.getNext();
  temp.setNext(temp2);
		population=population+1;
		
	}
	public int dequeue() {
		if(population>0) {
			population=population-1;
			int data=l.head.getData();
			l.head=l.head.getNext();
			return(data);
		}
		else {
			return(-1);
		}
	}
	
	public int peek() {
		if(population>1) {
			return(l.head.getNext().getData());
		}
		else {
			return(-1);
		}
	}
	public int getPopulation() {
		return population;
	}

	@Override
	public String toString() {
		return "LinkedQueue [l=" + l +"]";
	}	

}
