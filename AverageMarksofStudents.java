package arrays;

import java.util.Scanner;

public class AverageMarksofStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of Students : ");
		int n = sc.nextInt();
		
		int [] marks = new int [n];
		int sum = 0;
		int averageMarks = 0;
		
		System.out.println("Enter the elements now : ");
		for(int i = 0; i<n; i++) {
			
			marks[i] = sc.nextInt();
			
			sum = sum + marks[i];
			
			}
		       
		averageMarks = sum/n;
		
		System.out.println("The average Marks are : " + averageMarks );
		
		

	}

}
