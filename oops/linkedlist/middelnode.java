// class node {
//     int data;
//     node next;

//     node(int data) {
//         this.data = data;
//     }
// }

// class middelnode{
    

//     public static class mid {
//         node head = null;//instance variable
//         node tail = null;

//         node middle() {//node middle(node head) 
//             if (head == null)
//                 return null;
//             node slow = head;
//             node fast = head;
//             while (fast.next != null && fast.next.next != null) {//odd then even
//                 slow = slow.next;
//                 fast = fast.next.next;
//             }
//             return slow;
//         }

//         void atend(int val) {
//             node newnode = new node(val);
//             if (head == null) {
//                 head = newnode;
//                 tail = newnode;
//             } else {
//                 tail.next = newnode;
//                 tail = newnode;
//             }
//         }

//         void display() {
//             node t = head;
//             while (t != null) {
//                 System.out.print(t.data + " ");
//                 t = t.next;
//             }
//         }

//     }

//     public static void main(String[] args) {
//         mid ll = new mid();
//         ll.atend(20);
//         ll.atend(21);
//         ll.atend(22);
//         ll.atend(23);
//         ll.atend(24);
//         ll.atend(25);
//         ll.display();
//         System.out.println();
//        node midi=ll.middle();//or if head need to be passed ll.middle(ll.head);
//        System.out.println("middle element is : "+ midi.data);
//        System.out.println();
//          ll.atend(20);
//         ll.atend(21);
//         ll.atend(22);
//         ll.atend(23);
//         ll.atend(24);
//         ll.atend(25);
//         // ll.display();
//         System.out.println();
//        node mid=ll.middle();//or if head need to be passed ll.middle(ll.head);
//        System.out.println("middle element is : "+ mid.data);
//     }
// }