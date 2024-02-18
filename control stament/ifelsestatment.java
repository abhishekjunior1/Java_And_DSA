import java.util.*;

class ifelsestatment {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
        System.out.println(" enter the value of n ");
        int n= sc.nextInt();
        // for(int i=1;i<=n;i++)
        {
          if(n%2==0 ) {System.out.println("number is even");
        }
          else System.out.println("number is odd number  ");
        }
        sc.close();

            }
}
