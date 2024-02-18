// import java.util.*;
public class selectionsorting {
  public static void main(String[] args) {
    int arr[]={5,1,3,4,6,2};
    // int n =length(arr);
    for(int i=0;i<arr.length-1;i++)
    {
      int min=i;
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[j]<arr[min])
        {
          min=j;
        }
      }
      if(min!=i)
      {
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
      }
    }  
    for(int i=0;i<6;i++)
  {
    System.out.println(arr[i]+" ");
  }  
  }
}
