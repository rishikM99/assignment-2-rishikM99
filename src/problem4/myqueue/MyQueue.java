/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

public class MyQueue {
  private int[] queue;
	private int head;
	private int tail;
	private int population;
	@Override
	public String toString() {
		return "CustomQueue [queue=" + Arrays.toString(queue) + ", head=" + head + ", tail=" + tail + ", population="
				+ population + "]";
	}

	public CustomQueue(int size) {
		queue=new int[size];
		head=0;
		tail=0;
		population=0;
		
	}
	
	public boolean isEmpty() {
		boolean response=false;
		if(head==tail) {
			response=true;
		}
		return(response);
	}
	public boolean isFull() {
		boolean response=false;
		if((head-tail)>=queue.length) {
			response=true;
		}
		return(response);
	}
	
	public boolean enqueue(int data) {
		
		if (isFull()==false){
			queue[tail]=data;
			tail=tail+1;
			population=population+1;
			return(true);
		}
		else {
			return(false);
		}
		
	}
	public int dequeue() {
		if(isEmpty()==false) {
			head=head+1;
			population=population-1;
			return(queue[head-1]);
		}
		else {
			return(-1);
		}
	}
	public int peek() {
		if(isEmpty()==false && (population)>=2) {
			return(queue[head+1]);
		}
		else {
			return(-1);
		}
			
	}

	public int getPopulation() {
		return population;
	}
}
