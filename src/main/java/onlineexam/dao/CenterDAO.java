package onlineexam.dao;

import java.util.List;

import onlineexam.model.Center;




public interface CenterDAO {

	void addCenter(Center center);
	List<Center> getAllCenters();
	Center getCenter(int cId);
	void removeCenter(int cId);
	void updateCenter(int cId,Center center);
}
