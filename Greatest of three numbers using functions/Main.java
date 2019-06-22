import java.util.Scanner;
class Main{
   public static int Greatest(int n1,int n2)
  {
  int great;
    if(n1 > n2)
    {
    great = n1;
    }
    else
    {
      great = n2;
    }
     return great;
   }
  
	public static void main (String[] args){
	    // Type your code here
       Scanner sc= new Scanner(System.in);
      int n1= sc.nextInt();
      int n2= sc.nextInt();
      int n3= sc.nextInt();
      int result = Greatest(n1,n2);
      System.out.println(Greatest(result,n3));      
	}
}