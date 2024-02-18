import java.util.*;
public class waystoprint {
    static void firstway(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    static void secondway(int arr[])
    {
        System.out.println();
        for(int i:arr)
        System.out.print(i+" ");
    }
    static void thirdway(int arr[])
    {
        System.out.println();
        String arrasstring=Arrays.toString(arr);
        // System.out.println(Arrays.toString(arr));
        // System.out.println();
        System.out.print(arrasstring);//--------->simple string
    }
    public static void main (String args[])
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the 5 array elements: ");
        int arr[]=new int [5];
        for(int i=0;i<5;i++)
        arr[i]=sc.nextInt();

        firstway(arr);
        secondway(arr);
        thirdway(arr);

        sc.close();
    }
    
}
