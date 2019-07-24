package day3;

import java.util.Scanner;

public class createaproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner project = new Scanner(System.in);
		
		int basics = 10;
	    boolean blue = true;
	    double twins = 1.2;
	    float pie = 3.14f;
	    long money= 100;
	    String pull = "" ;
	    String name = "" ;
	    boolean yellow = true;

	    System.out.println("welcome to my creative project");
	    
	    System.out.println("What is your name?");
	    name= project.next();//string
 
	    System.out.println("what is your favorite color");
	    pull= project.next();//string
	    
	    System.out.println("Whats your favorite number");
	    basics= project.nextInt();//number
	    
	    System.out.println("how old are you ");
	    basics= project.nextInt();//number

	    

	    System.out.println( name + "favorite color is " + pull);
	    System.out.println("her favorite nmber is" + money);
	    System.out.println("she is" + basics + "years old");
	    
	    int color= 15;
	    int green= 14;
	    int purple= 12;
	    
	    		
	    System.out.println("True or False, Our project is better then the others" + name);
	    yellow = project.next() != null;
	    		
	    		
	    System.out.println("these are your lucky numbers: "
	     +color + ", " + green + ","  + purple + "! " );
	    
	    System.out.println("True or False question");
	    System.out.println("Do you like sports");
	    yellow = project.next() != null;
	    
	   System.out.println("enter a number to see a magic trick");
	   int color1= project.nextInt(); 
	   
	   
	   for (int x=color1; x<100; x++) {
		
	   		
	   		if(color>2) {
	        System.out.println(x);
	   		
	        
		
	   }
	   
	   }
	   
	}
	
}



