package Assignment;
import java.util.Scanner;
import java.util.ArrayList;

public class Marksheet {
	
	/**
	 * Calculate and returns the average grade of all students.
	 * 
	 * @param grade The Input ArrayList which contains grade of Students.
	 * @return Average grade (double)
	 * @throws ArithmeticException If there's a division by zero error during average calculation
	 */
	private static double averageMarks(ArrayList<Integer> grade) throws ArithmeticException {
		if(grade.size() == 0) {
			throw new ArithmeticException("Cannot calculate average for zero students");
		}
		
		double sum = 0;
		for(int index = 0; index < grade.size(); index++) {
			sum += grade.get(index);
		}
		double average = sum/grade.size();
		return average;
	}
	
	/**
	 * Finds and returns the maximum grade among all students.
	 * 
	 * @param grade The Input ArrayList which contains grade of Students.
	 * @return Maximum marks obtained by student
	 * @throws ArithmeticException If there's a division by zero error during average calculation
	 */
	private static int maxGrade(ArrayList<Integer> grade) throws ArithmeticException {
		if(grade.size() == 0) {
			throw new ArithmeticException("Cannot find max grades for zero students");
		}
		
		int max = grade.get(0);
		for(int index = 1; index < grade.size(); index++) {
			if(grade.get(index) > max) {
				max = grade.get(index);
			}
		}
		return max;
	}
	
	/**
	 * Finds and return the minimum grade among all students.
	 * 
	 * @param grade The Input ArrayList which contains grade of Students.
	 * @return Minimum marks obtained by student
	 * @throws ArithmeticException If there's a division by zero error during average calculation
	 */
	private static int minGrade(ArrayList<Integer> grade) throws ArithmeticException {
		if(grade.size() == 0) {
			throw new ArithmeticException("Cannot find min grades for zero students");
		}
		
		int min = grade.get(0);
		for(int index = 1; index < grade.size(); index++) {
			if(min > grade.get(index)) {
				min = grade.get(index);
			}
		}
		return min;
	}
	
	
	/**
	 * Calculates and returns the percentage of students who passed 
	 * 
	 * @param grade The Input ArrayList which contains grade of Students.
	 * @return Percentage of students passed (double)
	 * @throws ArithmeticException If there's a division by zero error during average calculation
	 */
	private static double studentsPassed(ArrayList<Integer> grade) throws ArithmeticException {
		if(grade.size() == 0) {
			throw new ArithmeticException("Cannot calculate pass percentage for zero students");
		}
		
		double count = 0;
		for(int index = 0; index < grade.size(); index++) {
			if(grade.get(index) >= 40) {
				count++;
			}
		}	
		double percentage = (count/grade.size())*100;
		return percentage;
	}
	
	/**
	 * 
	 * Main method to demonstrate usage of Marksheet class
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
//			Taking Input from user for number of students
			System.out.print("Enter the Number of Students: ");
			int students = sc.nextInt();
			ArrayList<Integer> grades = new ArrayList<>(students);
			
//			Adding the grades
			for(int i=0; i<students; i++) {
				System.out.print("Enter the Student: "+i+" Marks: ");
				int mark = sc.nextInt();
				grades.add(mark);
			}
			
//			calculate and display average marks
			System.out.printf("Average marks of all students: %.2f",averageMarks(grades));
			
//			find and display min/max grades
			System.out.println("\nMinimum grade obtained by Student is: "+minGrade(grades));
			System.out.println("Maximum grade obtained by Student is: "+maxGrade(grades));
			
//			calculate and display pas percentage
			System.out.printf("Percentage of students passed in exam: %.2f",studentsPassed(grades));
			
			
		}catch(Exception e) {
			System.err.print("Enter Valid Input");
		}
		
		
		sc.close();
		
	}

}
