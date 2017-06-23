package com.qait.svm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		int i = 0;
		Student st = new Student();

		List<List<Student>> lists = new ArrayList<List<Student>>();
		List<Student> list = new ArrayList<>();

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		// System.out.println("Enter the number of lists");

		int n = scan.nextInt();

		while (i < n) {
			// Addding ith List
			lists.add(list);

			// Getting id,nmae and cgpa
			int id = scan.nextInt();
			String name = scan.next();
			Double cgpaMarks = scan.nextDouble();
			// Adding id,name,cgpa to the list of type Student
			list.add(new Student(id, name, cgpaMarks));

			i++;

		}

		// Calling sort method of Student class
		st.sort(list);

		// Iterating the sorted list in reverse order to match the output format
		/*for (i = list.size()-1; i >= 0; i--) {

			System.out.println(list.get(i).getName());
		}*/

	}

}
