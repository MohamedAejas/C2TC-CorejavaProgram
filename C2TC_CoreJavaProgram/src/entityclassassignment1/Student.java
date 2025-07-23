package entityclassassignment1;

public class Student
{
		private int id;
	    private String name;
	    private String department;
	    public Student(int id, String name, String department) 
	    {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	    }

	    public void displayDetails()
	    {
	        System.out.println("Student ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Department: " + department);
	        System.out.println("----------------------------");
	    }
	
}


