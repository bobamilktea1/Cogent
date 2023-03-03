package com.cogent.Batch65_SpringBootTwo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//few Additional Annotation needed to make it
//complete and add Power to it
//ORM - Object relational Mapping - JPA and Hibernate
@Entity(name = "emp")
@Table     //('emp')
public class Performer {
	@Id   //primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	String project;
	String desAchievement;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getDesAchievement() {
		return desAchievement;
	}
	public void setDesAchievement(String desAchievement) {
		this.desAchievement = desAchievement;
	}
	public Performer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Performer [id=" + id + ", name=" + name + ", project=" + project + ", desAchievement=" + desAchievement
				+ "]";
	}
	
	
}

