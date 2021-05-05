package javaReact;

public class UserManager {
    public void Add(Instructor instructor) {
    	System.out.println(instructor.userType + " eklendi");
    }
    
    public void Add(Student student) {
    	System.out.println(student.name + " eklendi");
    }
}
