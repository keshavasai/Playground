import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
        Scanner in  = new Scanner(System.in);
        // Get the value for n
	    int n = in.nextInt();
        // Extract last digit
      while(n >= 100)
      {
      n = n / 10;
      }
      int sec_digit= n % 10;
      System.out.println(sec_digit);
	}
}