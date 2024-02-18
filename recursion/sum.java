
public class sum {
//   static void  recursionsum(int num){
//   if (num==0)
//   {
//     return;
//   }
//   recursionsum(num-1);
//   System.out.print(num);
//   return ;
// }
static int  recursionsum(int sum,int n)
{
  if(n==0)
  {
    System.out.println(sum);
    return 12;
  }
       int k=recursionsum(sum+n, n-1);//k-->0,1,2--but 2 override by 12 
       System.out.println(k);
       return k;// go to k back for second time 

}
  public static void main(String[] args) {
    // int num=10;
    recursionsum(0,3);
    // System.out.println(k);
    
  }
  
}
