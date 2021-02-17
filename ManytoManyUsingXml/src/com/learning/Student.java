package com.learning;

import java.util.Set;

public class Student 
{
	private int stuid;
	private String name;
	private int stumarks;
	private Set<Course> course;
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStumarks() {
		return stumarks;
	}
	public void setStumarks(int stumarks) {
		this.stumarks = stumarks;
	}
	public Set<Course> getCourse() {
		return course;
	}
	public void setCourse(Set<Course> course) {
		this.course = course;
	}
	
}
