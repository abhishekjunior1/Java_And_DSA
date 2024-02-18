import java.util.*;
public class declear
{
    static void change(int arr[])
    {
        arr[0]=1000;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[]={1,2,3};
        System.out.println(Arrays.toString(array));
        change(array);//----->changes will be made to oringinal array
        System.out.println(Arrays.toString(array));
            // int arr[]=new int[5];
            // System.out.println(array.length);
            // for(int i=0;i<arr.length;i++)
            // {
            //     arr[i]=sc.nextInt();
            // }
            // for(int i:arr)
            // System.out.print(i+" ");
        sc.close();
  }
}