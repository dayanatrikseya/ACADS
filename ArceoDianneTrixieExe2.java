package Exercises;
import java.util.Scanner;

public class ArceoDianneTrixieExe2 {

    private static Scanner scan;
	public static void main(String[] argv) {
     
        scan = new Scanner(System.in);
		
		System.out.print("Enter a string 1: ");
		String str1 = scan.nextLine();
                System.out.print("Enter a string 2: ");
		String str2 = scan.nextLine();
                
		System.out.print("Enter a char 1: ");
		char cha1 = scan.next().charAt(0);
                System.out.print("Enter a char 2: ");
		char cha2 = scan.next().charAt(0);
                
                
		System.out.print("Enter an integer 1: ");
		int num1 = scan.nextInt();
                System.out.print("Enter an integer 2: ");
		int num2 = scan.nextInt();
                
                
		System.out.print("Enter a decimal number: ");
		double dec1 = scan.nextDouble();	
		System.out.print("Enter a decima2 number: ");
		double dec2 = scan.nextDouble();	
                
                
                	System.out.print ("\n"+ "Final Output: " + "\n\n");
               
              
		System.out.print((str1 + cha1)+ "         " + (str2 + cha2) + "\n");
                scan.nextLine();
                System.out.print((num1+dec1) +  "           "  + (num2 + dec2) + "\n");
                scan.nextLine();
    }}

