import java .util.*;
public class AtBottom {
    public static void Bottom(Stack<Integer>st)
    {
        if(st.size()==0){
            st.push(100);
            return;
        }
        int top=st.pop();
        Bottom(st);
        st.push(top);
        return;
    }
    public static void DeletionAtbottom(Stack<Integer>st)
    {
        if(st.size()==1){
            st.pop();
            return;
        }
        int top=st.pop();
        DeletionAtbottom(st);
        st.push(top);
        return;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Stack<Integer>st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st+" ");
        Bottom(st);
        System.out.println("Ater Enserting at bottom: ");
        System.out.println(st+" ");
        
        DeletionAtbottom(st);
        System.out.println("After Deletion At bottom");
        System.out.println(st);
        sc.close();
        
    }
}

