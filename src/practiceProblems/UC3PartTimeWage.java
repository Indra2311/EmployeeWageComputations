package practiceProblems;
import java.util.Random;

public class UC3PartTimeWage {
	private static final int wagePerHour=20;
	private static int fullDayHour=0;
	private static double wage;
	
	public void empCheck() {
		Random ran= new Random();
		
		final int IS_Present=ran.nextInt(3);
		
		if(IS_Present==1) {
			System.out.println("Employee is Present");
			fullDayHour=8;
		} 
		else if(IS_Present==2) {
			System.out.println("Employee Worked for Part Time");
			fullDayHour=4;
		}
		else {
			System.out.println("Employee is absent");
		}
		
		wage= UC3PartTimeWage.dailyWageCalculate(fullDayHour);
		System.out.println("Wage of the Person is: "+ wage);
	}

	public static double dailyWageCalculate(int fullDayHour) {
		return (wagePerHour * fullDayHour);
	}
	
		public static void main(String[] args) {
			UC3PartTimeWage E1=new UC3PartTimeWage();
			E1.empCheck();
		}
	
	
}
