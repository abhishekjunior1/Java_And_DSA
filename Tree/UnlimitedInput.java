import java .util.*;
public class UnlimitedInput {

    static Scanner sc = new Scanner(System.in);
    static class node{
        int data;
        node left;
        node right;
        node (int data)
        {
            this.data=data;
            left=right=null;
        }
    }
    static node built()
    { System.out.println("Enter data: ");
          int a=sc.nextInt();
        if(a==-1)
        return null;
        node root= new node(a);//1
        System.out.println("Enter left for "+a);
        root.left=built();//2;
        System.out.println("Enter right for "+a);
        root.right=built();
        System.out.println("I am root value "+ root.data);
        return root;
    }
    public static void main(String[] args) {
        // Scanner sc= new Scanner (System.in);
        System.out.println("Hello, World!");
        node root=built();
        System.out.println(root.data);
    }
}

