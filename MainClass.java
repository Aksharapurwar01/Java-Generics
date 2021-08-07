public class MainClass {
 
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
   double x1 = 9.1 , y2 = 6.3 , y3 = 2.6;
   String s1 = "Physics", s2 = "Math", s3 = "Chemistry";
    
	 //UC1 
    System.out.printf("Maximum of %d, %d and %d is %d\n\n", x, y, z, maximum(x, y, z)); // tc1.1
    System.out.printf("Maximum of %d, %d and %d is %d\n\n", y, x, z, maximum(y, x, z)); //tc1.2
    System.out.printf("Maximum of %d, %d and %d is %d\n\n", y, z, x, maximum(y, z, x)); //tc1.3
    
    //UC2
    System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", x1, y2, y3, maximum(x1,
        y2, y3));
    System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", y2, x1, y3, maximum(y2,
            x1, y3));
    System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", y3, y2, x1, maximum(y3,
            y2, x1));
    
    //UC3
    System.out.printf("Maximum of %s, %s and %s is %s\n", s1, s2, s3, maximum(
        s1, s2, s3));
    System.out.printf("Maximum of %s, %s and %s is %s\n", s1, s2, s3, maximum(
            s2, s1, s3));
    System.out.printf("Maximum of %s, %s and %s is %s\n", s1, s2, s3, maximum(
            s1, s3, s1));
  }
}
