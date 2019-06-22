import java.util.Scanner;
class Main
{
  public static int square(int m)
  {
  int x=m*m;
    return x;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner sc=new Scanner(System.in);
      int n  = sc.nextInt();
      System.out.println(square(n));
	} 
  
}