package org.department;

import org.college.College;

public class Department extends College {

	public void deptname() {
		System.out.println("deptname");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department dp = new Department();
		dp.deptname();
		dp.CollegeCode();
		dp.CollegeName();
		dp.CollegeRank();

	}

}
