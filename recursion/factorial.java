public class factorial {
  static int  factoriala(int n)
  {
if(n==1)
  {
   return 1;
  }
    return n*factoriala(n-1);
  }
  
  public static void main(String[] args) {
     int ans =factoriala(3);
     System.out.println(ans);
  }
}
  