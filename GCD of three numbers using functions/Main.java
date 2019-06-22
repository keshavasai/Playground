import java.util.Scanner;
public class Main{
  public static int GCD(int n1,int n2,int n3)
  {
  int min,gcd = 0;
    if(n1 < n2)
    {
    min = n1;
    }
    else
    {
      min = n2;
    }
    while(min >= 1)
    {
    if((n1 % min == 0)&&(n2 % min == 0))
    {
    gcd = min;
      break;
    }
      min--;
      n3 = n1 % n2;
      //int result = n3;
    }
    return min;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc= new Scanner(System.in);
      int n1= sc.nextInt();
      int n2= sc.nextInt();
      int n3= sc.nextInt();
      System.out.println(GCD(n1,n2,n3));

	}
}