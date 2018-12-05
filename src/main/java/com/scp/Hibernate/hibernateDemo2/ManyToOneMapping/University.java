package com.scp.Hibernate.hibernateDemo2.ManyToOneMapping;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="University")
public class University {
@Id
private int univId;
private String univName;

@OneToMany(mappedBy="university",cascade=CascadeType.ALL)
List<College>College;

public University(int univId, String univName,List<College> college) {
	super();
	this.univId = univId;
	this.univName = univName;
	this.College = college;
}
/**
 * 
 */
public University() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "University [univId=" + univId + ", univName=" + univName + ", College=" + College + "]";
}


public int getUnivId() {
	return univId;
}
public void setUnivId(int univId) {
	this.univId = univId;
}
public String getUnivName() {
	return univName;
}
public void setUnivName(String univName) {
	this.univName = univName;
}
public List<College> getCollege() {
	return College;
}
public void setCollege(List<College> college) {
	College = college;
}




}
