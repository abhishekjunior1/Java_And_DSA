public class summ {
  static int  cal(int n)
  {
    if (n == 0) {
      return 0;
  }
  return n + cal(n - 1);

  }
  public static void main(String args[])
  {
     System.out.println((5*(4)/2)-1);
   int result = cal(5);
   System.out.println("The resukt is : " + result);
  }
}
