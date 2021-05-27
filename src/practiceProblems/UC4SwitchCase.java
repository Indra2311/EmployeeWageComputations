package practiceProblems;
import java.util.Random;

class UC4SwitchCase {   
  private static final int wagePerHour=20;
  private static int fullDayHour=0; 
  private static double wage;	
	public void empCheck() {   
		Random ran=new Random();
		
		final int IS_Present=ran.nextInt(3);
		
		switch(IS_Present){
			case 1:
				System.out.println("Employee is Present");
						
				  fullDayHour=8;
				   break;
		    case 2:
				System.out.println("Employee Worked for PartTime");
					
				 fullDayHour=4;
				   break;
		     case 0:
				System.out.println("Employee is Absent");
					break;
      default:
					System.out.println("Invalid Value");
			
		}
		
		wage=UC4SwitchCase.dailyWageCalculation(fullDayHour);
			System.out.println("The wage of the Person is: "+wage);
	}
	public static double dailyWageCalculation(int fullDayHour){  
		return (wagePerHour*fullDayHour);
	}

	public static void main(String[] args) {   
		UC4SwitchCase E1 =new UC4SwitchCase();
		E1.empCheck();

	}
}
