import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int first=(num/100);
    int sec=(num/10)%10;
    int last=(num%10);
    int reverse=(last*100)+(sec*10)+first;
    System.out.println(reverse);
  }
}