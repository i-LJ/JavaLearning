import java.util.Scanner;

public class BMICalculator2
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi;
		int inches, lbs;

		System.out.print( "Your height in inches: " );
		inches = keyboard.nextInt();
		m = inches * 0.0254;

		System.out.print( "Your weight in lbs: " );
		lbs = keyboard.nextInt();
		kg = lbs / 2.205;

		bmi = kg / (m*m);

		System.out.println( "Your BMI is " + bmi );
	}
}