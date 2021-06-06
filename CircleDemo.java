package fire;
import java.util.Scanner;
public class CircleDemo {
    static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.println("Enter the radius :");
		
		double radius = sc.nextDouble();
		
		double area = Math.PI *(radius * radius);
		System.out.println("The area of the circle is :" +area);
		
		double circumference = Math.PI * 2*radius;
		
		System.out.println("The circumfernece of he circle is :" + circumference); 
 
	}

}
