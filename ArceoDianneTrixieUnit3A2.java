package arceodiannetrixieunit3activities1and2;
import java.util.Scanner;

public class ArceoDianneTrixieUnit3A2{
	public static void main(String[] args) {
            
                System.out.print("enter a positive integer: ");
                int num = 0;
                
		Scanner pos = new Scanner(System.in);
                int n = pos.nextInt();
             
                
                
                
            while (n != 1) 
                 {
                    
                        if (n % 2 == 0)                 //even  
                             {
                            System.out.println(n);
                               n = n / 2;
                               num += 1;
                             }
                            
                        else                            //odd   
                             {    
                            System.out.println(n);
                                n = n/ 2;
                                num += 1;   
                             }
                 }
            
           System.out.println(n);
           System.out.println("Actions performed: "+num);
	}
}      
     
            