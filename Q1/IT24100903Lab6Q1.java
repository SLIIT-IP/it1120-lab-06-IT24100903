import java.util.Scanner;

public class IT24100903Lab6Q1
{
   public static void main(String[]args)
   {
      Scanner input=new Scanner(System.in);
      
      double number,square,root;

      System.out.print("Enter a number : ");
      number=input.nextDouble();
      System.out.println("  ");

      square=number*number;
      root=Math.sqrt(number);

      System.out.println("The square of "+number+" is : "+square);
      System.out.println("The square root of "+number+" is : "+root);

   }

}