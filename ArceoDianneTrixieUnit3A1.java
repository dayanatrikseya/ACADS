package arceodiannetrixieunit3activities1and2;
import java.util.Scanner;

public class ArceoDianneTrixieUnit3A1 {

    public static Scanner scan;
    public static void main(String[] Argv) {
              
                Scanner scanner = new Scanner(System.in);    
               
                    final int numberOfSubjects = 10; 
                    System.out.println("enter the number of subject you have:" +numberOfSubjects );
                        
                        int theMarks[] = new int[numberOfSubjects];     
                        int i;
                        int total =0;
                        float theAverage;

                    for (i = 0; i < numberOfSubjects; i++) 
                            {                  
                                System.out.print("enter grade (" + (i + 1) + ") : ");
                                theMarks[i] = scanner.nextInt();
                                total = total + theMarks[i];
                            }
             
                    System.out.println("\n"+"total: "+total);                
                    theAverage = total / numberOfSubjects;
                    System.out.println("average: "+theAverage);

                    scanner.close();
                
		}
	}

        
