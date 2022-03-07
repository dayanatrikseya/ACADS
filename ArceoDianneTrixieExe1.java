package Exercises;
 import java.util.Scanner;

   public class ArceoDianneTrixieExe1 {

	     private static Scanner scan;
		 public static void main(String[] argv) {

	        Scanner sc = new Scanner (System.in);

			 	// Enter values

	            String country;
                    country = sc.nextLine();
                    String pop;
                    pop = sc.nextLine();
                    String r;
                    r = sc.nextLine();
                    String name;
                    name = sc.nextLine();
                    int population = Integer.parseInt(pop);
                    double rate = Double.parseDouble(r);
	               
	        System.out.println
	        ("\n" + "\"Good morning " +country + "!\" it's so nice to be home again..." + "\n"
	        + "In this wonderful island with " + population + " million people." + "    And still growing at " 
                + "\n" + rate + " percent per year. " + "\n"
	        + "I will be staying here for good - love " + name);	     
			
       }
	 }