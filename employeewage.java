class employeewage
{
	public static void main(String[] args)
	{
<<<<<<< HEAD
		int isPresent=1;
<<<<<<< HEAD
=======
		int empRatePerHr=20;
		int salary=0;
		int empHr=0;
>>>>>>> 2_DailyEmployeeWage_UC2
		int res=(int)(Math.random()*10)%2;
		if(res==isPresent)
		{
			System.out.println("Employee is present");
<<<<<<< HEAD
=======
			empHr=8;
>>>>>>> 2_DailyEmployeeWage_UC2
=======
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
>>>>>>> 3_AddPartTime_UC3
		}
		else
		{
			System.out.println("Employee is absent");
<<<<<<< HEAD
<<<<<<< HEAD
		}
=======
			empHr=0;
		}
		salary=(empRatePerHr*empHr);
		System.out.println("Salary is " +salary);
>>>>>>> 2_DailyEmployeeWage_UC2
=======
			empHr=0;
		}
		salary=(empHr*empRatePerHr);
		System.out.println("Salary is "+salary);
>>>>>>> 3_AddPartTime_UC3
	}
}

