import java.util.*;
public class doubly{
    public static class node{
        int data;
        node next;
        node prev;
        node(int data)
        {
            this.data=data;
            next=prev=null;
        }
    }
    public static  class linked{
        node head;
        node tail;
        linked(){
            head=tail=null;
        }
        void atend(int data)
        {
            node newnode=new node(data);
            if(head==null)
            {
                head=tail=newnode;
                head.prev=null;
            }
            else{
                tail.next=newnode;
                newnode.prev=tail;
                tail=newnode;
            }
        }
        void display()
        {
            node temp=head;
            while(temp!=null){

                System.out.print(temp.data +" ");
                temp=temp.next;
            }
            System.out.println();
            System.out.println(tail.data);

        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        linked obj=new linked();
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int data=sc.nextInt();
            obj.atend(data);
        }
        obj.display();
        sc.close();

    }
}