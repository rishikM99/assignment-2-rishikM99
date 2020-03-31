/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
import problem3.myPriorityQueue.*;
import problem3.student.*;

package problem3.main;
// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
  public static void main([]String a){
    Student s = new Student();
    myPriorityQueue q= new myPriorityQueue();
    for(int i = 0;i<10;i=i+1){
    s.setId(i);
    
    q.enqueue(s);
    }
    
  }
}
