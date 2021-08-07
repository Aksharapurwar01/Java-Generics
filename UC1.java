
public class UC1 {
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
	    T max = x; // assume x is initially the largest

	    if (y.compareTo(max) > 0)
	      max = y; // y is the largest so far

	    if (z.compareTo(max) > 0)
	      max = z; // z is the largest

	    return max; // returns the largest object
	  } // end method maximum

	  public static void main(String args[]) {
		  
	   int x = 10, y= 5, z= 1;
	  
	    
		 //UC1 
	    System.out.printf("Maximum of %d, %d and %d is %d\n\n", x, y, z, maximum(x, y, z)); // tc1.1
	    System.out.printf("Maximum of %d, %d and %d is %d\n\n", y, x, z, maximum(y, x, z)); //tc1.2
	    System.out.printf("Maximum of %d, %d and %d is %d\n\n", y, z, x, maximum(y, z, x)); //tc1.3
	    

}
}
