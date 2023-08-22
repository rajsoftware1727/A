import java.util.*;
public class EligibleNotEligible {
	public static void main(String args[])
	{
		int Age;
		Scanner reader=new Scanner(System.in);
		System.out.println("Hai Sir/Madam Please Enter Your Age");
		int userAge=reader.nextInt();
		if((userAge>=18)&(userAge<=35))
		{
			System.out.println("Yes Your Are Eligible");
		}
		else
		{
			System.out.println("Sir/Madam Your Are Not Eligible");
		}
	}

}
