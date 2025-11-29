package com.example.SBP_DB_CRUD.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User_data_Table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer uid;
    private String uname;
    private Integer uage;
    private String ugender;
    private String uemail;
    private String ulocation;
    
	public User() {
	}

	public User(Integer uid, String uname, Integer uage, String ugender, String uemail, String ulocation) {
		this.uid = uid;
		this.uname = uname;
		this.uage = uage;
		this.ugender = ugender;
		this.uemail = uemail;
		this.ulocation = ulocation;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Integer getUage() {
		return uage;
	}

	public void setUage(Integer uage) {
		this.uage = uage;
	}

	public String getUgender() {
		return ugender;
	}

	public void setUgender(String ugender) {
		this.ugender = ugender;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUlocation() {
		return ulocation;
	}

	public void setUlocation(String ulocation) {
		this.ulocation = ulocation;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", uage=" + uage + ", ugender=" + ugender + ", uemail="
				+ uemail + ", ulocation=" + ulocation + "]";
	}
    
    
}
