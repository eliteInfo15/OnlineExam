package onlineexam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int uId;
	private String username;
	private String useremail;
	private String userpassword;
	private String userpassword_md5;
	private int userStatus;
	private  String areaPermistion;
	
	
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	public String getUserpassword_md5() {
		return userpassword_md5;
	}
	public void setUserpassword_md5(String userpassword_md5) {
		this.userpassword_md5 = userpassword_md5;
	}
	public int getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}
	public String getAreaPermistion() {
		return areaPermistion;
	}
	public void setAreaPermistion(String areaPermistion) {
		this.areaPermistion = areaPermistion;
	}
	
	
}
