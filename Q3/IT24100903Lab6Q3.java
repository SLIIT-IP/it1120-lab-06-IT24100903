import java.util.Scanner;
public class IT24100903Lab6Q3{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int sqrsum=0;
	int num=0;
	int count=0;
	double rootMeanSq;
	System.out.println("Enter positive integer . terminate input with -99");
	System.out.println("Enter a number : ");
	num=input.nextInt();
	while(num != -99){
		if (num>0){
			sqrsum=sqrsum+num*num;
			count=count+1;
		
}
		else{
			System.out.println("Invalid input. Please enter a positive integer 			or -99 to termninate");
}
		System.out.println("Enter a number : ");
		num=input.nextInt();
				
}
	 rootMeanSq=Math.sqrt(sqrsum/count);
	System.out.println("The root mean square (RMS) is : "+rootMeanSq);
	
	
	
 }
}
