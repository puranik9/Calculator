import java.util.*;

public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		double a, b, c = 0.0;
		
		System.out.print("Please enter the first number \n");
		a = in.nextDouble();
		System.out.print("Now enter the second number \n");
		b = in.nextDouble();
		System.out.print("Choose the operation to perform: " + 
		"\n1.Addition" + 
		"\n2.Subtraction" + 
		"\n3.Multiplication" + 
		"\n4.Division" + 
		"\n5.Power" + 
		"\n#Please enter the number of the operator \n");
		
		double numEntered = in.nextDouble();
		double addition = 1;
		double subtraction = 2;
		double multiplication = 3;
		double division = 4;
		double power = 5;
		
		if(numEntered == addition) {
			c = a + b;
			System.out.println(a + " + " + b + " = " + c);
		} else if(numEntered == subtraction) {
			c = a - b;
			System.out.println(a + " - " + b + " = " + c);
		} else if(numEntered == multiplication) {
			c = a * b;
			System.out.println(a + " * " + b + " = " + c);
		} else if(numEntered == division) {
			c = a / b;
			System.out.println(a + " / " + b + " = " + c);
		} else if(numEntered == power) {
			System.out.println("Enhance a or b?" + "\n1.a" + "\n2.b");
			double enhanced = in.nextDouble();
			double first = 1;
			double second = 2;
			if(enhanced == first) {
				System.out.println(Math.pow(a, b));
			} else if(enhanced == second) {
				System.out.println(Math.pow(b, a));
			}
		}
		
	}

}
