package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("studentName");
		
	}
	
	public void studentdept() {
		System.out.println("studentdept");
		
	}
	
	public void studentid() {
		System.out.println("studentid");
		
	}
	
	//multilevel inheritance
	public static void main(String[] args) {
		Student st = new Student();
		st.studentName();
		st.studentid();
		st.studentdept();
		st.deptname();
		st.CollegeCode();
		st.CollegeName();
		st.CollegeRank();
		
	}

}
