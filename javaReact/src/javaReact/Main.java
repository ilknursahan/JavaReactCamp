package javaReact;



public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 =new Instructor();
		instructor1.instructorId=1;
		instructor1.name="Engin Demiroð";
		
		Instructor instructor2 =new Instructor();
		instructor2.instructorId=2;
		instructor2.name="Deniz Çimen";
		
		Category category1=new Category();
		category1.id=1;
		category1.instructorId=1;
		category1.name="JavaReact";
		
		Category category2=new Category();
		category2.id=2;
		category2.instructorId=1;
		category2.name="C#";
		
		Category category3=new Category();
		category3.id=3;
		category3.instructorId=2;
		category3.name="Angular";
		
		Category[] categories = {category1,category2,category3};
		for (Category category : categories) {
			
			System.out.println(category.name);
		}
		
		System.out.println("---------");
		
		Instructor[] instructors = {instructor1,instructor2};
        for (Instructor instructor : instructors) {
			
			System.out.println(instructor.name);
		}
		
        CategoryManager categoryManager=new CategoryManager();
        categoryManager.addCategory(category1);
        categoryManager.updateCategory(category3);
	}

}
