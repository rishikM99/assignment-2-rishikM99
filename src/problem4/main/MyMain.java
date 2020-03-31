/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
import problem4.myqueue.MyQueue;
import problem1.mybst.*;
package problem4.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
  MyQueue q = new MyQueue();
  MyQueue p = new MyQueue();
  MyBst t = new MyBst();
  t.insert(5);
  t.insert(3);
  t.insert(8);
  t.insert(9);
  t.insert(4);
  t.insert(1);
  public static int traverse(node n,MyQueue q){
  if(n!=null) {
				q.enqueue(node.getData());
				traverse(node.getLower(),q);
				traverse(node.getHigher(),q);
  }
  }
  traverse(t.getRoot(),q);
  int size=q.getSize();
  q.dequeue();
  for(int i=0,i<=size,i=i+1){
    p.enqueue(q.dequeue);
  }
  
  
  
}
  
}
    
