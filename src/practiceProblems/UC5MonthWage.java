package practiceProblems;
import java.util.Random;

	class UC5MonthWage {   
	    private static final int wagePerHour=20;
	    private static int fullDayHour=0; 
	    private static double totalWage;	
		private static final int numberOfDays=20;
		
		public void empCheck() {   
			Random ran=new Random();
			double wage=0;
			for(int i=0; i<20; i++) {
				final int IS_Present=ran.nextInt(3);
				
				switch(IS_Present) {
				case 1:
						fullDayHour=8;
						 break;

				case 2:
						fullDayHour=4;
						 break;
				case 0:
						 break;
				default:
					System.out.println("Invalid Value");
					
				}
				
				wage=UC5MonthWage.dailyWageCalculation(fullDayHour);
				totalWage+=wage;
					
			}
			System.out.println("The wage of the Person is: "+totalWage);
		}
	   
		public static double dailyWageCalculation(int fullDayHour) {   
			return (wagePerHour*fullDayHour);
		}

		public static void main(String[] args){  
			UC5MonthWage E1 =new UC5MonthWage();
			E1.empCheck();

		}
	}
		


