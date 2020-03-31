package adt;
import node.Node;
public class CustomLinkedList {
	Node head;
	private int size;
	public CustomLinkedList() {
		this.size=0;
		}
	public void insertAtStart(int data) {
		Node temp=new Node(data);
		temp.setNext(head);
		head=temp;
		size=size+1;
	}
	public void insertAtEnd(int data) {
		Node temp=head;
		Node temp2=new Node(data);
		while(temp.getNext()!=null) {
			temp=temp.getNext();
			
		}
		temp.setNext(temp2);
		size=size+1;
	}
	public void deleteAtStart() {
		if(head.getNext()!=null) {
		head=head.getNext();
		size=size-1;}
	}
	public void deleteAtEnd() {
		Node temp=head;
		if(head.getNext()!=null) {
		while(temp.getNext().getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(null);
		size=size-1;
		}
		
	}
	public void traverse() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
	}
	public int elementAt(int pos) {
		int currPos=0;
		Node curr=head;
		if (pos<size){
		while(currPos!=pos) {
			curr=curr.getNext();
			currPos=currPos+1;
		}
		return(curr.getData());
		}
		else {
			System.out.println("position out of bound");
			return(-1);
		}
	}
	public boolean hasElement(int term) {
		boolean response=false;
			Node temp=head;
		
		while(temp!=null){
			if(temp.getData()==term) {
				response=true;
				break;
			}
			temp=temp.getNext();
			
		}
		return(response);
		
	}
	public void sort() {
		int iters2=0;
		if (head!=null){
		Node temp=head;
		while(iters2<=size) {
			int iters=0;
			temp=head;
		while(iters<=size && temp.getNext()!=null) {
		if(temp.getNext().getData()<temp.getData()) {
			int var=temp.getData();
			temp.setData(temp.getNext().getData());
			temp.getNext().setData(var);
		}
		temp=temp.getNext();
		iters=iters+1;
		}
		iters2=iters2+1;
		}
		}
	}
	public int getSize() {
		return size;
	}
	public void clear() {
		head=null;
	}
	public void merge(CustomLinkedList list) {
		if (head!=null) {
			Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
		}
		temp.setNext(list.head);
		this.setSize(this.getSize()+list.getSize());
	}
		
	}
	public void setSize(int size) {
		this.size = size;
	}

}
