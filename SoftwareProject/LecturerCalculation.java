/*Software Assignment, part 5
* Written by Anna Ruth
* First written 28/10/2013
* Last updated 07/11/2013
*/

import sheffield.*;
public class LecturerCalculation {
	public static void main(String[] args) {
		//Compute lecturer workload
		/*For testing, can be removed*/int[][] testStudent = {{/*Ucard*/},{/*Year*/},{/*Module1Code*/},{/*Module1Credits*/},{/*Module1Mark*/}};
		/*For testing, can be removed*/int[][] testLecturer = {{12345/*Ucard*/,2345/*Module1Code*/,20/*Module1Weight*/,50/*Module1NoOfStudents*/,2346/*Module2Code*/,10/*Module2Weight*/,40/*Module2NoOfStudents*/},{12349/*Ucard*/,2342/*Module1Code*/,20/*Module1Weight*/,60/*Module1NoOfStudents*/,2348/*Module2Code*/,20/*Module2Weight*/,50/*Module2NoOfStudents*/}};
		for (int r=0; r<testLecturer.length; r++) {
			//Read out original inputs
			System.out.println("Lecturer number " + (r + 1) + ",");
			System.out.println("Ucard number: " + testLecturer[r][0]);
			System.out.println("Module 1:");
			System.out.println("  - Code: " + testLecturer[r][1]);
			System.out.println("  - Weight: " + testLecturer[r][2]);
			System.out.println("  - Number of Student: " + testLecturer[r][3]);
			//Calculate the workload for module 1
			int module1Workload = testLecturer[r][2] * testLecturer[r][3];
			System.out.println("  - Workload: " + module1Workload);
			System.out.println("Module 2:");
			System.out.println("  - Code: " + testLecturer[r][4]);
			System.out.println("  - Weight: " + testLecturer[r][5]);
			System.out.println("  - Number of Student: " + testLecturer[r][6]);
			//Calculate the workload for module 2
			int module2Workload = testLecturer[r][5] * testLecturer[r][6];
			System.out.println("  - Workload: " + module2Workload);
			System.out.println("Total workload: " + (module1Workload + module2Workload));
			//This is just to make the divide between lecturer's data clearer
			System.out.println();
			System.out.println("----------");
			System.out.println();
			
		}
	}
}

