import java.util.Scanner;
public class IT24100903Lab6Q2C 
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int count=0;
		int[] number= new int[10];
		int sum=0;
		double avg;
		
		System.out.println("Please enter 10 numbers:");
		
		System.out.print("Enter number "+(count+1)+" :");
		number[count]=input.nextInt();
		count++;
		
		while(count<10)
		{
			System.out.print("Enter number "+(count+1)+" :");
			number[count]=input.nextInt();
			count++;
		}
		System.out.println("  ");
		
		count=0;
		System.out.println("The numbers you entered are:");
		while(count<10)
		{
		    System.out.print(number[count]+" ");
			sum=sum+(number[count]);
			count++;
		}
		System.out.println("   ");
		System.out.println("   ");
		avg=sum/10.0;
		System.out.println("Sum of the numbers: "+sum);
		System.out.println("Average of the numbers: "+avg);
	}
}