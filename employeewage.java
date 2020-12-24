class employeewage
{
	public static void main(String[] args)
	{
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
		}
		else
		{
			System.out.println("Employee is absent");
<<<<<<< HEAD
		}
=======
			empHr=0;
		}
		salary=(empRatePerHr*empHr);
		System.out.println("Salary is " +salary);
>>>>>>> 2_DailyEmployeeWage_UC2
	}
}

