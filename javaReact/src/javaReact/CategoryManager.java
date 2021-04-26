package javaReact;

public class CategoryManager {
    
	public void addCategory(Category category)
	{
		System.out.println("Kategori eklendi : " + category.name);
	}
	public void updateCategory(Category category)
	{
		System.out.println("Kategori güncellendi : " + category.name);
	}
}
