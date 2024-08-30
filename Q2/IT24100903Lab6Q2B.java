import java.util.Scanner;

public class IT24100903Lab6Q2B 
{
    public static void main(String[] args) 
	{
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10]; // Create an Array to store 10 numbers
        int count = 0;

        System.out.println("Please enter 10 numbers:");

        while (count < 10)
		{
            System.out.print("Enter number " + (count + 1) + ": ");
            numbers[count] = input.nextInt(); // Store the input in the array
            count++;
        }

        // Reset count for the output loop
        count = 0;

        // Displaying the numbers entered
        System.out.println("The numbers you entered are:");
		
		System.out.println("    ");

        // Using a while loop to display the output
        while (count < 10) 
		{
            System.out.print(numbers[count] + " ");
            count++;
        }
    }
}
