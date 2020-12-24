class employeewage
{
	public static void main(String[] args)
	{
		//variable
		int isPresent=1;
		//computation
		int res=(int)(Math.random()*10)%2;
		//computation
		if(res==isPresent)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}
}

