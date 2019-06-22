import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
              // Get the value for n
              Scanner in  = new Scanner(System.in);

	    int n = in.nextInt();
      int sum = 0;
        // Extract last digit
      while(n > 0)
      {
        int rem = n % 10;
        sum = sum + rem;
        n = n / 10;
      }
      System.out.println(sum);
	}
}