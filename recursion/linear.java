public class linear {
 

    static int linera (int arr[],int n,int i) 
    {
        if(i==arr.length)
        return 0;
        if(arr[i]==n)
        return 1;
        return linera(arr,n,i+1);//sara call stack mi 0 pass hoga if not found 
    }
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        int arr[]={1,2,11};

         int m=linera(arr,3,0);

         if(m==1)
         System.out.println("Found");
         else
         System.out.println("Not found ");
         
         
       
    }

}
