/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
  private int id;
  private int backlogs;
  private int appearCount;
  public void setId(int id){
    this.id=id;
  }
  public int getId(){
    return(this.id);
  }
  public void setbacklogs(int bg){
    this.backlogs=bg;
  }
  public int getbacklogs(){
    return(this.backlogs);
  }
  public void setappearCount(int ac){
    this.appearCount=id;
  }
  public int getappearCount(){
    return(this.appearCount);
  }
}
