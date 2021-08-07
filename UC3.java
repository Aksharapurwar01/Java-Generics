
public class UC3 {
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
	    T max = x; // assume x is initially the largest

	    if (y.compareTo(max) > 0)
	      max = y; // y is the largest so far

	    if (z.compareTo(max) > 0)
	      max = z; // z is the largest

	    return max; // returns the largest object
	  } // end method maximum

	  public static void main(String args[]) {
		  String s1 = "Physics", s2 = "Math", s3 = "Chemistry";
		  
		  System.out.printf("Maximum of %s, %s and %s is %s\n", s1, s2, s3, maximum(
			        s1, s2, s3));
			    System.out.printf("Maximum of %s, %s and %s is %s\n", s1, s2, s3, maximum(
			            s2, s1, s3));
			    System.out.printf("Maximum of %s, %s and %s is %s\n", s1, s2, s3, maximum(
			            s1, s3, s1));

}
}
