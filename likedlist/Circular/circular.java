
// import java.util.*;
// public class circular {
//     public static class node{
//         int data;
//         node next;
//         node(int data)
//         {
//             this.data=data;

//         }
//     }
//     public static  class linked{
//         node head;
//         node tail;
//         linked(){
//             head=tail=null;
//         }
//         void atend(int data)
//         {
//             node newnode=new node(data);
//             if(head==null)
//             {
//                 head=tail=newnode;
//             }
//             else{
//                 tail.next=newnode;
//                 tail=newnode;
//             }
//             tail.next=head;//made it circular
//         }
//         void display()
//         {
//             node temp=head;
//             while(true){

//                 System.out.print(temp.data +" ");
//                 temp=temp.next;
//                 if(temp==head)
//                 break;
//             }
//             System.out.println();
//             System.out.println(tail.next.data);

//         }

//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         linked obj=new linked();
//         System.out.println("Enter the value of n: ");
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++)
//         {
//             int data=sc.nextInt();
//             obj.atend(data);
//         }
//         obj.display();
//         sc.close();

//     }
// }

