public class employeewage
{
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	public static final int EMP_RATE_PER_HR=20;


	public static void main(String[] args)
	{

		int isPresent=1;

		int empRatePerHr=20;
		int salary=0;
		int empHr=0;
 2_DailyEmployeeWage_UC2
		int res=(int)(Math.random()*10)%2;
		if(res==isPresent)
		{
			System.out.println("Employee is present");

			empHr=0;
2_DailyEmployeeWage_UC2

		int isfulltime=1;
		int isparttime=2;
		int empRatePerHr=20;
		int empHr=0;
		int salary=0;
		int res=(int)(Math.random()*10)%3;
		if(res==isfulltime)
		{
			System.out.println("Employee is fulltime");
			empHr=8;
		}
		else if(res==isparttime)
		{
			System.out.println("Employee is Parttime");
			empHr=4;
 3_AddPartTime_UC3
		}
		else
		{
			System.out.println("Employee is absent");


		}
			empHr=0;
		}
		salary=(empRatePerHr*empHr);
		System.out.println("Salary is " +salary);
 2_DailyEmployeeWage_UC2

			empHr=0;
		}
		salary=(empHr*empRatePerHr);
		System.out.println("Salary is "+salary);
 3_AddPartTime_UC3

		//variable
		int empHr=0;
		int salary=0;
		//Computation
		int empCheck=(int)Math.floor(Math.random()*10)%3;
		switch (empCheck) {


	public static final int NUM_OF_WORKINGDAYS=2;
	public static final int MAX_HRS_IN_MONTH=10;

	public static void main(String[] args)
	{
		int empHr=0;
		int totalEmpHr=0;
		int totalWorkingDays=0;
		while (totalEmpHr<=MAX_HRS_IN_MONTH && totalWorkingDays<=NUM_OF_WORKINGDAYS)
		{
			totalWorkingDays++;
			int empCheck=(int) Math.floor(Math.random()*10)%3;
			switch (empCheck)
			{
 6_Tillnumberofworking_UC6
			case FULL_TIME:
			System.out.println("Employee is fulltime");
			empHr=8;
			break;
			case PART_TIME:
			System.out.println("Employee is parttime");
			empHr=4;
			break;
			default:
			System.out.println("Employee is absent");
			empHr=0;


		}
		salary=(empHr*EMP_RATE_PER_HR);
		System.out.println("Salary is "+salary);
 4_UsingSwitchCase_UC4

	public static final int NO_OF_WORKINGDAYS=2;

	public static void main(String[] args)
	{
		//variables
		int empHr=0;
		int salary=0;
		int totalsalary=0;

		for(int day=0; day< NO_OF_WORKINGDAYS; day++)
		{
		//computation
                	int empCheck=(int)Math.floor(Math.random()*10)%3;

			switch (empCheck)
			{
				case FULL_TIME:
				System.out.println("Employee is fulltime");
				empHr=8;
				break;
				case PART_TIME:
				System.out.println("Employee is parttime");
				empHr=4;
				break;
				default:
				empHr=0;
			
			}
			salary=(empHr*EMP_RATE_PER_HR);
			totalsalary += salary;
			System.out.println("Salary is "+salary);
		}
		System.out.println("Totalsalary is "+totalsalary);
 5_WagesforMonth_UC5

		}
		totalEmpHr += empHr;
	
		}
		int totalsalary = totalEmpHr * EMP_RATE_PER_HR;	
		System.out.println("Total salary: "+totalsalary);

				
 6_Tillnumberofworking_UC6
	}
}

