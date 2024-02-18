import java.util.*;
import java.util.ArrayList;
// import java.util.Collections;
public class Listtbasic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // ArrayList<Integer> arr=new ArrayList<Integer>();
        // ArrayList<Integer> obj2=new ArrayList<>();
        // arr.add(19);
        // arr.add(39);
        // arr.set(0,22);
        // arr.add(2999);
        // arr.get(1);
        // System.out.println(arr);
        // arr.remove(0);
        // Collections.sort(arr);
        // // int a=arr.size();
        
        // System.out.println(arr);
        // for(int i:arr)
        // System.out.print(i+" ");
        // System.out.println(arr.isEmpty());
        // System.out.println("Enter arraylist elements");
        // for(int i=0;i<5;i++){
        //     arr.add(sc.nextInt());
        // }
        // System.out.println(arr.get(2));//--->pass the index  
        // System.out.println(arr);

        ArrayList<ArrayList<Integer>> arr2d=new ArrayList<>(); 

        for(int i=0;i<3;i++){//--->intitilization
            arr2d.add(new ArrayList<>());
        }

        //add element
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr2d.get(i).add(sc.nextInt());
            }
        }
        System.out.println(arr2d);
        sc.close();

    }
    
}
