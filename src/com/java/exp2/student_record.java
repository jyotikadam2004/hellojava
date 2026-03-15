package com.java.exp2;

	import java.util.*;

	// Student Class
	class Student {
	    int id;
	    String name;
	    double marks;

	    // Constructor
	    Student(int id, String name, double marks) {
	        this.id = id;
	        this.name = name;
	        this.marks = marks;
	    }

	    // Display method
	    void display() {
	        System.out.println(id + " " + name + " " + marks);
	    }
	}

	public class student_record{

	    public static void main(String[] args) {

	        ArrayList<Student> students = new ArrayList<>();

	        // Adding student records
	        students.add(new Student(101, "jyoti", 85.5));
	        students.add(new Student(102, "teju", 92.0));
	        students.add(new Student(103, "nikita", 78.0));
	        students.add(new Student(104, "aprana", 88.5));
	        students.add(new Student(105, "vaishu", 79.5));

	        System.out.println("Original Records:");
	        display(students);

	        // Sort by Name
	        Collections.sort(students, Comparator.comparing(s -> s.name));

	        System.out.println("\nSorted by Name:");
	        display(students);

	        // Sort by Marks
	        Collections.sort(students, Comparator.comparingDouble(s -> s.marks));

	        System.out.println("\nSorted by Marks:");
	        display(students);

	        // Find Topper
	        Student topper = Collections.max(students, Comparator.comparingDouble(s -> s.marks));
	        System.out.println("\nTopper: " + topper.name + " - " + topper.marks);

	        // Calculate Average Marks
	        double total = 0;
	        for(Student s : students) {
	            total += s.marks;
	        }

	        double avg = total / students.size();
	        System.out.println("Average Marks: " + avg);
	    }

	    static void display(ArrayList<Student> list) {
	        for(Student s : list) {
	            s.display();
	        }
	    }

}
