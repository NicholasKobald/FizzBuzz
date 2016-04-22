/*
Nicholas Kobald 2016-04-09
FizzBuzz with no control structures or loops
*/
public class FizzBuzz{
	private static final int ZERO = 0;
	private static final int MAX_INT = 101;
	private static final int ONE = 1;
	
	/*   
		~~~~			______________
			 /. .\  \\/~~~~~| Buzzzzzzzzzz |
			| _  | //      \_____________/
			 \  / //
			 _||_//
			//||
			||||
			 //\\
			|| ||
			/_  _\
	*/ 
	public static void main(String[] args){
		int Buzzer = 0;
		System.out.print(Buzzer++);
		DoFizzBuzz(Buzzer);
	}
	public static void DoFizzBuzz(int Buzzer){
		int DivFive = Buzzer%5;
		int DivThree = Buzzer%3;
		int Helper = 1337;
		try{
			Helper = (Helper)/(MAX_INT-Buzzer);
		} catch(ArithmeticException e) {
			System.out.println("We're done.");
			System.exit(-1);
		}
		try{
			Helper = Helper/DivFive;
			try{
				Helper = Helper/DivThree;
			} catch(ArithmeticException e) {
				DoEvenMoreFizzBuzz(Buzzer);
			}
		} catch(ArithmeticException e) {
			MoreFizzBuzz(Buzzer);
		}
		System.out.print(" " + Buzzer + " ");
		Helper = 1337;
		DoFizzBuzz(++Buzzer);
		
	}
	public static void DoEvenMoreFizzBuzz(int Buzzer){
		System.out.print(" Fizz ");
		DoFizzBuzz(++Buzzer);
	}
	public static void MoreFizzBuzz(int Buzzer) {
		int Helper = 1337;
		int DivThree = Buzzer%3;
		try{
			Helper = Helper/DivThree;
		} catch(ArithmeticException e) {
			System.out.print(" FizzBuzz ");
			DoFizzBuzz(++Buzzer);
		}
		System.out.print(" Buzz " ); 
		DoFizzBuzz(++Buzzer);
	}
}
