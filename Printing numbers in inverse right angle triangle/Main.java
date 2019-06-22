import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
        Scanner sc=new Scanner(System.in);
  int n = sc.nextInt();
      int val = n;
  for(int row = 1;row <= n;row++)
  {
  /*  for(int space = 1;space <= row;space++)
    {
    System.out.print(" ");
    }*/
  for(int col = val;col >= 1 ;col--)
  {
  System.out.print(col); 
  }
    val--;
    System.out.print("\n");
  }
	}
}