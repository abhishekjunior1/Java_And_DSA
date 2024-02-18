import java .util.*;
public class diaplyrecursively {
    public static void display(Stack<Integer>st)
    {
        if(st.isEmpty()){
  
            return;
        }
        int top=st.pop();
        System.out.print(top+" ");
        display(st);//if u want to print in same manner then just print below this top element
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
        display(st);
        System.out.println();
        System.out.println(st+" ");
        sc.close();
        
    }
}
