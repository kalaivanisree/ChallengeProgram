package challengeprogram;

public class SquareRoot {

	
		public static double square(double number){
		    double t;
		  
		    double squareroot = number / 2;
		  
		    do {
		        t = squareroot;
		        squareroot = (t + (number / t)) / 2;
		    } while ((t - squareroot) != 0);
		  
		    return squareroot;
		}
		 
		public static void main(String[] args)
		{
		    double number = 8;
		    double root;
		    root = (int)square(number);
		    System.out.println("Number : "+number);
		    System.out.println("Square Root : "+root);
	}
	}


