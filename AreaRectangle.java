package fire;

import java.util.Scanner;

public class AreaRectangle {

	public static void main(String[] args) {
		
	    @SuppressWarnings("resource")
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the lenght of the rectangle :");
		double length = scanner.nextDouble();
		System.out.println("Enter the width of the rectangle :");
		double width = scanner.nextDouble();
		double area = length*width;
		System.out.println("Area od rectangle is :" +area);
	}

}
