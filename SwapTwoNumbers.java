package fire;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int first = 120;
		int second =220;
		System.out.println("--Before swap--");
		System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
     float temporary = first;
     first=second;
     second= (int) temporary;
     System.out.println("--after swap--");
     System.out.println("First number =" + first);
     System.out.println("second number = " +second);

	}

}
