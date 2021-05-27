package practiceProblems;
import java.util.Random;

public class UC6TotalWorkHr {

	private static final int wagePerHour=20;
    private static int fullDayHour=0; 
    private static double totalWage;	
	private static final int numberOfDays=20;
	private static final int totalHours=100;
	public void empCheck() {   
		Random rand=new Random();
		double wage=0;
		int day=0;
		while(day<numberOfDays && fullDayHour<=totalHours) {	
			final int IS_Present=rand.nextInt(3); 

			switch(IS_Present) {
				case 1:
					fullDayHour+=8;
					 break;

			    case 2:
			        fullDayHour+=4;
					 break;
			    case 0:
			    	 break;
			default:
				System.out.println("Invalid Value");
			day+=1;
				
			}
				
		}
		totalWage=UC6TotalWorkHr.dailyWageCalculation(fullDayHour);
			
		System.out.println("The wage of the Person is: "+totalWage);
	}
     
	public static double dailyWageCalculation(int fullDayHour){  
		return (wagePerHour*fullDayHour);
	}


	public static void main(String[] args) {   
		UC6TotalWorkHr E1 =new UC6TotalWorkHr();
		E1.empCheck();

	}
}
