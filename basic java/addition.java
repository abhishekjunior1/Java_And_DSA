package basic java;
import java.util.Scanner;
class addition
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    n=sc.nextInt();
    int sum1=(n*(n+1)/2);
    System.out.println(sum1);

    int sum =0;
//    int p=10;
//    int q=20;
//    if (p!=q) System.out.println("great");
    
   
    for(int i=1; i<=10; i++)
    {
       sum  = sum + i;
      
    }
    System.out.println(sum);
      sc.close();

  }
}