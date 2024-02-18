import java .util.*;
public class searching {
  public static void main(String[] args)
   {
    Scanner sc = new Scanner (System.in);
    // int i;
    System.out.println("enter element to be searched");
    int num=sc.nextInt();
    System.out.println("plz enter your array elements");
    int arr[]=new int[10];
    
    for( int i=0;i<10;i++)
    {
      arr[i]=sc.nextInt();
    }
    {

    
    int i;
    for( i=0;i<arr.length;i++)
    {
      if(arr[i]==num)
      {
        int pos=i;
        System.out.println("position of element : "+ pos);
        break;
      }
      
    }
    if(i==10){
    System.out.println("not present");
    }
   }
   
    sc.close();
     }
      }
