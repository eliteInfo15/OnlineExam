package onlineexam.dao;

import java.util.List;

import onlineexam.model.Category;





public interface CategoryDAO {

	void addCategory(Category category);
	List<Category> getAllCategories();
	Category getCategory(int cId);
	Category getCategory(String categoryName);
	void removeCategory(int cId);
	void updateCategory(int cId,Category category);
}
