
public class UC2 {
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
	    T max = x; // assume x is initially the largest

	    if (y.compareTo(max) > 0)
	      max = y; // y is the largest so far

	    if (z.compareTo(max) > 0)
	      max = z; // z is the largest

	    return max; // returns the largest object
	  } // end method maximum

	  public static void main(String args[]) {
		  
	
	   double x1 = 9.1 , y2 = 6.3 , y3 = 2.6;
	   
	        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", x1, y2, y3, maximum(x1,
		        y2, y3));
		    System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", y2, x1, y3, maximum(y2,
		            x1, y3));
		    System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", y3, y2, x1, maximum(y3,
		            y2, x1));
		    
	    
		

}
}
