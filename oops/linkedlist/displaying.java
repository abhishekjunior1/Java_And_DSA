
public class displaying {
  
  public static class node {
  int data;
  node next;
  node(int data)
  {
    this.data=data;
  }
}

 public static void display(node head)
  {
    node temp=head;//simimlar to int a
    while(temp!=null)
    {
      System.out.print(temp.data + " ");
      temp=temp.next;
    }
  }
  public static void recursion(node head)
  {
    if(head==null) return;
    System.out.print(head.data + " ");
    recursion(head.next);

    // System.out.print(head.data + " ");
  }
  
  public static void main(String[] args) {
    node a =new node (1);//similar to int a;
    node b =new node (2);
    node c =new node (3);
    node d =new node (4);

    //connection stablishing
    a.next=b;
    b.next=c;
    c.next=d;

    display(a);//similar to passinf value in function
    System.out.println();
    recursion(a);


  }
}