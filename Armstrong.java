package Day5;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int x;
		Scanner s= new Scanner(System.in);
        System.out.println("enter number");
		 x=s.nextInt();
	     int y;
		 y=x;
	     int rem;
		int sum=0;
		while(x!=0)
		{
		rem=x%10;
		sum+= Math.pow(rem, 3);
		System.out.print(rem);
		x=x/10;
		}
		if(y==sum)
			System.out.println("number is armstrong");
		else
			System.out.println("number not armstrong");
	}
}
