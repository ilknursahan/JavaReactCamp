package javaReact;



public class Main {

	public static void main(String[] args) {
		
		 Instructor instructor =new Instructor();
		 instructor.userType="Eğitmen";
		 
		 Student student = new Student();
		 student.name="ilknur";
		 
		 UserManager userManager=new UserManager();
		 userManager.Add(instructor);
		 userManager.Add(student);
		 
		 System.out.println("--------------");
		 
		 InstructorManager instructorManager = new InstructorManager();
		 instructorManager.Add(instructor);
		 
		 System.out.println("--------------");
		 
		 StudentManager studentManager = new StudentManager();
		 studentManager.Add(student);
		 studentManager.Hesapla();

	}

}
