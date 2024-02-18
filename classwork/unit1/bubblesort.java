public class bubblesort {//last wala bubble out hota hai her baar so -i
  public static void main(String[] args) {
    int arr[]={111,4,5,9,88};
    int temp;
    for(int i=0;i<arr.length-1;i++)//for controling iteration 
    {//in 0 itteration 111 will be at the end and in 1st 88 (n-1 bez last me aak space buchega )
      for(int j=0;j<arr.length-i-1;j++)//for sorting
      {
      if(arr[j]> arr[j+1])
      {
        temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
      }
      }
    }
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+ " "  );
    }
  }

  
}
