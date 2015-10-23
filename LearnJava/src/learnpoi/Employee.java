package learnpoi;

public class Employee {
	private String employee_id;
	private String name;
	private String designation;
	
	Employee(String employee_id, String name, String designation){
		this.employee_id = employee_id;
		this.name = name;
		this.designation = designation;
	}
	
	public String getID(){
		return employee_id;
	}
	
	public void setID(String employee_id){
		this.employee_id = employee_id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getDesignation(){
		return designation;
	}
	
	public void setDesignation(String designation){
		this.designation = designation;
	}

}
