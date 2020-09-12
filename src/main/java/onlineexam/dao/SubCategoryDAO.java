package onlineexam.dao;

import java.util.List;

import onlineexam.model.SubCategory;


public interface SubCategoryDAO {

	void addSubCategory(SubCategory subcategory);
	List<SubCategory> getAllSubCategories();
	SubCategory getSubCategory(int scId);
	SubCategory getSubCategory(String subcategoryName);
	SubCategory getCategory(int cId);
	void removeSubCategory(int scId);
	void updateSubCategory(int scId,SubCategory subcategory);
}
