package onlineexam.dao;



import java.util.List;

import onlineexam.model.Admin;



public interface AdminDAO {

	void addAdmin(AdminDAO admin);
	List<Admin> getAllAdmins();
	Admin getAdmin(int uId);
	void changeAdminPassword(Admin username, String password);
	void removeAdmin(int uId);
	void updateAdmin(int uId,Admin admin);
}
