/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;
//to implement circular queue
public class MyCircularQueue {
  private Student[] queue;
	private int head;
	private int tail;
	private int population;
	

	@Override
	public String toString() {
		return "CircularQueue [queue=" + Arrays.toString(queue) + ", head=" + head + ", tail=" + tail + ", population="
				+ population + "]";
	}

	public CircularQueue(int size) {
		queue=new Student[size];
		head=0;
		tail=0;
		population=0;
		
	}
	
	public boolean isEmpty() {
		boolean response=false;
		if(population==0) {
			response=true;
		}
		return(response);
	}
	
	
	public boolean enqueue(Student data) {
		
			if(population<queue.length) {
				queue[tail]=data;
				tail=(tail+1)%(queue.length);
				population=population+1;
				return(true);
			}
			else {
				return(false);
			}
	}
	public Student dequeue() {
		if(isEmpty()==false) {
			head=(head+1)%(queue.length);
			population=population-1;
			return(queue[head-1]);
		}
		else {
			return(-1);
		}
	}
	public Student peek() {
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
