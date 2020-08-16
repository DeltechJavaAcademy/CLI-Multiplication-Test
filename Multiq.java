package multiq;
import java.util.*;
public class Multiq {

	public static void main(String[] args) {
				
	        Scanner input = new Scanner(System.in);
	        System.out.println("Math Time!");
	        
	        int n = 20;
	        int counter = 0;
	        int p = 0;
			int result = 0;
	        
	        while (counter < n) {
	        
	        int firstnum = (int)(Math.random() * 12);
	        int secondnum = (int)(Math.random ()* 12);	
	        int calcanswer = firstnum * secondnum;
	        
	                
	        System.out.println(firstnum + "*" + secondnum + "= " );	  	        	        
	        
	        System.out.println("Enter your answer: ");
	        
	        int answer = input.nextInt();
	        	             
	        System.out.println("Your answer is " + firstnum + "*" + secondnum + "= " + answer);	  
	        System.out.println("Correct answer: " + firstnum + "*" + secondnum + "= " + calcanswer);
	        
	        if (calcanswer == answer) {
	        	result = result + 5; }
	        	else { result = result + 0;}
	        	
			counter++;	
			
			System.out.println("Counter = " + counter);	 
			
			
		//	System.out.println("Result: " + " " + result);
	        
	                 
	   
	     //     if (answer == calcanswer) {
	        	  
	    //    	  if (counter = 21) {
	        	  System.out.println("Result: " + " " + result);
	    //  	  System.out.println("Result: "  + comp1 );
	     	
	    //  	else if; 	        }
	       
	      
	   //   System.outprintln(firstnum + " X " + secondnum " = " result1);        	
			
		}
	    }
}

       
       
       
       
       
       
       
       
       
       
       
       
       
       

	    

        
