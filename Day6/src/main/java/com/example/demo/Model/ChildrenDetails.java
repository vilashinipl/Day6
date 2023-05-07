package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ChildrenDetails {
	@Id
	private int id;
	private String babyfirstname;
	private String babylastname;
	private String fathername;
	private String mothername;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBabyfirstname() {
		return babyfirstname;
	}
	public void setBabyfirstname(String babyfirstname) {
		this.babyfirstname = babyfirstname;
	}
	public String getBabylastname() {
		return babylastname;
	}
	public void setBabylastname(String babylastname) {
		this.babylastname = babylastname;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "ChildrenDetails [id=" + id + ", babyfirstname=" + babyfirstname + ", babylastname=" + babylastname
				+ ", fathername=" + fathername + ", mothername=" + mothername + ", address=" + address + "]";
	}
}

	