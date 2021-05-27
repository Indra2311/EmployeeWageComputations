package practiceProblems;
import java.util.Random;

public class UC2DailyWage {
	
 private static final int wagePerHour=20;
 private static int fullDayHour=0;
 private static double wage;
 
 public void empCheck() {
	 Random ran=new Random();
	 final int IS_Present = ran.nextInt(2);
	 
	 if (IS_Present==1) {
		 System.out.println("Employee is Present");
		 fullDayHour=8;
	 } else {
		 System.out.println("Employee is Absent");
		 
	 }
	 
	 wage=UC2DailyWage.DailyWageCalculate(fullDayHour);
	 	System.out.println("The wage of the Person is: " + wage);
	 
 }
 
 public static double DailyWageCalculate(int fullDayHour) {
	 return (wagePerHour * fullDayHour);
	
}
 
 public static void main(String[] args) {
	 UC2DailyWage Emp1= new UC2DailyWage();
	 Emp1.empCheck();
 }
 
}
