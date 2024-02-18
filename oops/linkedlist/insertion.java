// public class insertion {
//   public static class node{
//     int data;
//     node next;
//     node(int data)
//     {
//       this.data=data;
      
//     }
//   } 
//   public static class linkedlist{
//     node head=null;
//     node tail=null;

//     void atbig(int val)
//     {
//       node temp =new node(val);
//       if(head==null)
//       {
//         head=temp;
//         tail=head;
//       }
//       else //agr pahle se nodes hai tub
//       {
//         temp.next=head;
//         head=temp;
//       }
//     }


//     void atend(int val)
//     {
//       node temp=new node(val);
//       if(head==null)
//       {
//         head=temp;
//         tail=temp;
//       }
//       else{
//         tail.next=temp;
//         tail=temp;
//       }
//     }


//     void atIndex(int index,int val)//1 2 3 --> 4 5 ---(3,11)
//     {                                    //11
//       node t = new node(val);
//       node temp=head;
//       for(int i=0;i<index-1;i++)
//       {
//         temp=temp.next;
//       }
//       t.next=temp.next;
//       temp.next=t;
      
//     }

//     void display()
//     {
//       node temp=head;
//       while(temp!=null)
//       {
//         System.out.println(temp.data+" ");
//         temp=temp.next;
//       }


//     }

//   }
//   public static void main(String[] args) {
//     linkedlist ll =new linkedlist();
//     ll.atbig(3);
//     // ll.display();
//     ll.atend(10);
//     ll.atIndex(1,33);
//     ll.display();

//   }
// }
