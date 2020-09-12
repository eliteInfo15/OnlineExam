package onlineexam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MainAnswer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int m_a_id;
	private int marks;
	private String ans;
	public int getM_a_id() {
		return m_a_id;
	}
	public void setM_a_id(int m_a_id) {
		this.m_a_id = m_a_id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	
	
	
	
}
