import java.util.Scanner;

public class BMICalculator3
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		double m, kg, bmi;
		int inches, ft, lbs;

		System.out.print( "Your height (ft only): " );
		ft = keyboard.nextInt();
		System.out.print( "Your height (inches only): " );
		inches = keyboard.nextInt();

		m = (ft * 0.3048) + (inches * 0.0254);

		System.out.print( "Your weight in lbs: " );
		lbs = keyboard.nextInt();
		kg = lbs / 2.205;

		bmi = kg / (m*m);

		System.out.println( "Your BMI is " + bmi );
	}
}