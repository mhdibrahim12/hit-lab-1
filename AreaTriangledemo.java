package fire;
import java.util.Scanner;
public class AreaTriangledemo {

	public static void main(String[] args) {
      
		@SuppressWarnings("resource")
		Scanner  scanner = new Scanner (System.in);
        System.out.println("Enter the width of the triangle :");
        double base = scanner.nextDouble();
        
        System.out.println("Enter the height of the triangle :");
        double height = scanner.nextDouble();
        
        double area = (base*height);
        System.out.println("Area of the triangle :" +area);
	}

}
