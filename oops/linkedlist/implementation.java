// public class implementation 
// {
//   public static class node{
//     int data;
//     node next;
//     node(int data)
//     {
//       this.data=data;
//     }
//   }
//   public static class linkedlist
//   {
//     node head=null;
//     node tail=null;
//     void insertatend(int val)
//     {
//       node temp = new node(val);
//       if(head!=null)//if node is already presemt 
//       {
//         tail.next=temp;
//         tail=temp;
//       }
//       else if(head==null){//if not not presnt
//         head = temp;
//         tail = temp;

//       }
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
//     void insertionAthead(int  val)
//     {
//       node temp = new node(val);
//       if(head==null)
//       {
//         head=temp;
//         tail=temp;
//       }
//       else if  (head !=null)
//       {
//          temp.next=head;
//          head=temp;
//       }


//     }
//      int sizee()
//     {
//       node temp=head;
//       int count=0;
//       while(temp!=null)
//       {
//         count++;
//         temp=temp.next;

//       }
//       return count;
//     }
//   }
//   public static void main(String[] args) {
//     linkedlist ll=new linkedlist();//it is just calling class linkedlist baki main wala tho i.e node walaa ander hai
//     ll.insertatend(3);
//     ll.insertatend(7);
//     ll.insertionAthead(22);
//     ll.display();
//     System.out.print("The number od nodes are ");
//     System.out.println(ll.sizee());
//   }
// }

