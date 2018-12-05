package com.scp.Hibernate.hibernateDemo2.ManyToOneMapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="College")
public class College {
	
@Id
 private int collageId;
 private String collageName;

@ManyToOne(cascade=CascadeType.ALL)
private University university;

@Override
public String toString() {
	return "College [collageId=" + collageId + ", collageName=" + collageName + ", university=" + university + "]";
}

/**
 * 
 */
public College() {
	super();
	// TODO Auto-generated constructor stub
}

public int getCollageId() {
	return collageId;
}

public void setCollageId(int collageId) {
	this.collageId = collageId;
}

public String getCollageName() {
	return collageName;
}

public void setCollageName(String collageName) {
	this.collageName = collageName;
}

public University getUniversity() {
	return university;
}

public void setUniversity(University university) {
	this.university = university;
}

/**
 * @param collageId
 * @param collageName
 * @param university
 */
public College(int collageId, String collageName, University university) {
	super();
	this.collageId = collageId;
	this.collageName = collageName;
	this.university = university;
}


}
