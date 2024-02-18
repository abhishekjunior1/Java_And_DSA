import java .util. *;
class div 
{
  public static void main(String[] args) {
    int num =10;
    Scanner sc = new Scanner (System.in);
    System.out.println("enter your number ");
    System.out.println(num>=10);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++)
    {
    
      if(i%5==0 || i%3==0)
      {
      if(i%15!=0)
       System.out.println(i);
      }


    }
    
    sc.close();
  }
}