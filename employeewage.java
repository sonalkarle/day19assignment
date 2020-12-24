public class employeewage
{
	//Calculating wages for month
	public static final int FULL_TIME=1;
	public static final int PART_TIME=2;
	public static final int EMP_RATE_PER_HR=20;
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
			//computation
			salary=(empHr*EMP_RATE_PER_HR);
			totalsalary += salary;
			System.out.println("Salary is "+salary);
		}
		System.out.println("Totalsalary is "+totalsalary);
	}
}
