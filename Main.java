package ex2.work3;

import java.util.Scanner;

public class Main 
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());//2
        int b = Integer.parseInt(scanner.nextLine());//3
        int c = Integer.parseInt(scanner.nextLine());//1
        Equation e = new QuadEquation(a, b, c); // here're working both of logical blocks (static and non-static 
	    					// from class Equation)
        
        e.solve();        
        //e.print();
        System.out.println(e); // here will be printed the string which returns the overriden method toString() 
	    		       // (basic method of class Object)
        
        
        // e = new Equation(); - it's prohibited because of the class is abstract
        
        
        e = new LinEquation(3,6); // here's playing out non-static block of class Equation 
				  // (the first time an instance of a class is accessed - creating)

        e.solve();
        e.print();
        System.out.println(e);
    }
}
