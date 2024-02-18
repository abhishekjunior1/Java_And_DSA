// package java.practise session;
class node{
  int data;
  node next;
  node (int data)
  {
    this.data=data;
  }
}

public class linked {
  public static class linkedlist{
    node head=null;
    node tail=null;
    void addatlast(int val)
    {

      node temp=new node(val);
      if(head==null)
      {
        head=temp;
        tail=temp;
      }
      else
      {

        tail.next=temp;
        tail=temp;
      }
    }
    void atbig(int val)
    {
      node temp=new node(val);
      if(head==null)
      {
        head=temp;
        tail=temp;
      }
      else
      {
        temp.next=head;
        head=temp;
      }
    }
    void addatanypoint(int index,int value)
    {
      node t =head;
      node temp=new node(value);
      for(int i=0;i<=index-1;i++)
      {
        t=t.next;
      }
      temp.next=t.next;
      t.next=temp;

    }
    void display(){
      node t=head;
      while(t!=null)
      {
        System.out.print(t.data + " ");
        t=t.next;
      }
    }

    void deletatanyone(int index)
    {
      node t = head;
      for(int i=0;i<=index-1;i++)
      {
        t=t.next;
      }
      t.next=t.next.next;
    }
   
  }
  public static void main(String[] args) {
    linkedlist ll=new linkedlist();
    ll.addatlast(10);
    ll.atbig(22);
    ll.atbig(23);
    ll.addatlast(11);
    ll.addatanypoint(2,101);
    ll.display();
    System.out.println();
    ll.deletatanyone(2);
    ll.display();
  

  }
}
