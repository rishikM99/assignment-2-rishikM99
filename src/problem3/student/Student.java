package student;

public class Student implements Comparable<Student>{
	private Integer id;
	private String name;
	private int backlogs;
	
	
	public Integer getId() {
		return id;
	}


	public int getBacklogs() {
		return backlogs;
	}


	public void setBacklogs(int backlogs) {
		this.backlogs = backlogs;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPercent() {
		return percent;
	}


	public void setPercent(int percent) {
		this.percent = percent;
	}


	private int percent;
	

	
	public String toString() {
		return("Student [ id= "+ id +", name = "+name+", percent = "+percent+"]");
	}

	public int compareTo(Student s) {
		return(this.getId().compareTo(s.getId()));
	}
	public boolean equals(Student s) {
		return((this.getId().equals(s.getId()))&&(this.getName().equals(s.getName())));
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}

}
