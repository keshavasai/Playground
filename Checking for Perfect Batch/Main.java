import java.util.Scanner;
class Main{ 
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int list[] = new int[n];
for(int i = 0; i < n; i++)
{
list[i] = sc.nextInt();
}
perfect_batch(list, n);
}
   public static void perfect_batch(int list[], int n)
{
  int temp = 0;
  int batch_sum = list[0] + list[1]+list[2];
  for(int i = 3;i <= (n-1);i = i + 3)
  {
  int curr_batch_sum = list[i] + list[i + 1] + list[i + 2];
    if(curr_batch_sum!= batch_sum)
    {
      temp = 1;
    }
 }
    if(temp == 0)
    {
  System.out.println("Perfect Batch");
  }
  else
  {
    System.out.println("Not a Perfect Batch");
  }
  }
}