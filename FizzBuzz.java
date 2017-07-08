/*
 *FizzBuzz with no control structures or loops
 *
 * Nicholas Kobald 2016-04-09
 * Modified 2017-07-07
 */

 
public class FizzBuzz {

	private static final int ZERO = 0;
	private static final int MAX_INT = 101;
	private static final int ONE = 1;

	public static void main(String[] args) {
		int Buzzer = 0;
		System.out.println(Buzzer++);
		DoFizzBuzz(Buzzer);
	}

	public static void DoFizzBuzz(int Buzzer) {
		int DivFive = Buzzer%5;
		int DivThree = Buzzer%3;
		int Helper = 1337;

		try {
			Helper = (Helper)/(MAX_INT-Buzzer);
		} catch(ArithmeticException e) {
			System.exit(-1);
		}

		try {
			Helper = Helper/DivFive;
			try {
				Helper = Helper/DivThree;
			} catch(ArithmeticException e) {
				DoEvenMoreFizzBuzz(Buzzer);
			}
		} catch(ArithmeticException e) {
			MoreFizzBuzz(Buzzer);
		}

		System.out.println(Buzzer);
		Helper = 1337;
		DoFizzBuzz(++Buzzer);
	}

	public static void DoEvenMoreFizzBuzz(int Buzzer) {
		System.out.println("Fizz");
		DoFizzBuzz(++Buzzer);
	}

	public static void MoreFizzBuzz(int Buzzer) {
		int Helper = 1337;
		int DivThree = Buzzer%3;

		try {
			Helper = Helper/DivThree;
		} catch(ArithmeticException e) {
			System.out.println("FizzBuzz");
			DoFizzBuzz(++Buzzer);
		}
		System.out.println("Buzz");
		DoFizzBuzz(++Buzzer);
	}
}
