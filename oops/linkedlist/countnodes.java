public class countnodes {

   public static class node {
  int data;
  node next;
  node(int val)
  {
    data=val;
  }
}
  public static int  fun(node head)
  {
    int count =0;
    while(head !=null)
    {
      count++;
      head=head.next;
    }
    return count;
  }
  public static void main(String[] args) {
 node a=new node(1);
 System.out.println(a);
 node b=new node(2);
 System.out.println(b);
 node c=new node (3);
 a.next=b;
 b.next=c;
  System.out.println(fun(a));
    
  }
}
// class node {
//   int data;
//   node next;
//   node(int val)
//   {
//     data=val;
//   }
// }