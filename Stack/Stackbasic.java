import java.util.*;
// import java.util.Stack;
class Stackbasic {
    public static void main(String[] args) {
        // System.out.println("
        Stack<Integer>st=new Stack<>();
        st.push(10);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.print(st + " ");
        System.out.println();

        Stack<Integer>cpy=new Stack<>();
        cpy.push(st.pop());
        cpy.push(st.pop());
        cpy.push(st.pop());
        cpy.push(st.pop());
        cpy.push(st.pop());
        System.out.print(cpy+" ");

    }
}