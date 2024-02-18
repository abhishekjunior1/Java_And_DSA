public class pp{

    public static int binarysearch(int arr[] ,int search ,int begin ,int last)
    {

        if (last>=1){

            int mid=(begin+last)/2;
    
            if(search==arr[mid])
            return mid;
    
            else if(search>arr[mid])
            return binarysearch(arr,search,mid+1,last);
            
            else if  (search < arr[mid])
            return binarysearch(arr,search,begin,mid-1);
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        int search=1;
        int mid=binarysearch(arr,search,0,arr.length-1);
        System.out.println("found at "+mid);
    }
}