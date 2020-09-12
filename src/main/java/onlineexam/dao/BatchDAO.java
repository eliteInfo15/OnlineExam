package onlineexam.dao;

import java.util.List;

import onlineexam.model.Batch;





public interface BatchDAO {

	void addBatch(Batch batch);
	List<Batch> getAllBatches();
	Batch getBatch(int bId);
	Batch getBatch(String batchTime);
	void removeBatch(int bId);
	void updateBatch(int bId,Batch batch);
}
