package com.qait.svm;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
	// Instance members
	private int Id;
	private String name;
	private double cgpa;

	// Default Cons.
	public Student() {
		super();
	}

	// Parameterised Cons.
	public Student(int id, String name, double cgpa) {
		this.Id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Id=" + Id + ", name=" + name + ", cgpa=" + cgpa;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	// Sorting method accepting a List of type Student
	public void sort(List<Student> list) {
		//Using Java 8 Lambda
		Comparator<Student> bycgpa = (one, two) -> Double.compare(two.getCgpa(), one.getCgpa());

	    Comparator<Student> byName = (one, two) -> one.getName().compareToIgnoreCase(two.getName());
	        
	    Comparator<Student> byid = (one, two) -> Integer.compare(two.getId(), one.getId());

	    list.stream().sorted(bycgpa.thenComparing(byName).thenComparing(byid))
	                                .forEach(e -> System.out.println(e.getName()));
		
}
}