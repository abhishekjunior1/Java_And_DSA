import java.util.*;
public class all {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size ");
        int n=sc.nextInt();

    System.out.println("plz enter array element");
    int arr[]=new int [n];
    for(int i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }
    System.out.println("enter the number to be searched ");
    int search=sc.nextInt();
    int count =0;
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]==search)
      {
        for(int j=i;j<arr.length-1;j++)
        {
          arr[j]=arr[j+1];
        }
        count++;
        break;
      }
     }
     if(count ==0)
     {
      System.out.println("invalid");
     }
     else
     {
      for(int i=0;i<arr.length-1;i++)
      {
        System.out.print(arr[i]+" ");
      }
     }
      


  sc.close();
}
}
  

