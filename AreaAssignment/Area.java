package AreaAssignment;

import java.util.Scanner;

public class Area {
	/**
	 * 
	 * Main method to demonstrate usage of Area class
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Creating object of CalculateArea class
		CalculateArea areaCalculation = new CalculateArea();
		
		try {
			while(true) {
				System.out.println("\n1.Area of Triangle \n2.Area Rectangle \n3.Area of Square \n4.Area of Circle"
						+ "\nPress Any other number to exit\n");
				System.out.print("Enter your choice: ");
				int choice = sc.nextInt();
				
				if(choice == 1) {
					System.out.print("\nEnter the height: ");
					double height = sc.nextDouble();
					System.out.print("Enter the width: ");
					double width = sc.nextDouble();
					System.out.printf("Area of Triangle is: %.2f",areaCalculation.calculateTriangleArea(width, height));
					
				}else if(choice == 2) {
					System.out.print("\nEnter the Length: ");
					double length = sc.nextDouble();
					System.out.print("	Enter the Breadth: ");
					double breadth = sc.nextDouble();
					System.out.println("Area of Rectangle is: "+areaCalculation.calculateRectangleArea(length, breadth));
					
					
				}else if(choice == 3) {
					System.out.print("\nEnter the side: ");
					double side = sc.nextDouble();
					System.out.println("Area of Square is: "+areaCalculation.calculateSquareArea(side));
					
				}else if(choice == 4) {
					System.out.print("\nEnter the radius: ");
					double radius = sc.nextDouble();
					System.out.printf("Area iof Circle is: %.2f",areaCalculation.calculateCircleArea(radius));				
				}else {
					break;
				}
			}
		}catch(Exception e) {
			System.out.print("Enter Valid choice");
		}
			
		sc.close();

	}

}
