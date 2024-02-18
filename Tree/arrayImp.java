import java .util.*;
public class arrayImp {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class tree {
        static int i = -1;

        static node built(int arr[]) {
            i++;
            if (arr[i] == -1)
                return null; // return null node

            node root = new node(arr[i]);
            root.left = tree.built(arr);
            root.right = tree.built(arr);
            return root;
        }

        static void preorder(node root) {
            if (root == null)
                return;
            System.out.print(root.data+ " ");
            preorder(root.left);
            preorder(root.right);
        }
        static node search(node root,int element)
        {
            if(root ==null)
            return null;//---->agr null node mila tho null node he wapas 
            if(root.data==element)
            return  root;
            if(root.data>element)
            search(root.left,element);
            if(element>root.data)
            search(root.right,element);
            return root;

        }
        static int height(node root)
        {
            if(root==null)
            return 0;
            int leftheight=height(root.left);
            int rightheight=height(root.right);
            int nayamax=Math.max(leftheight,rightheight);
            return 1+nayamax;
                    //or
            // return 1+Math.max(height(root.left),height(root.right));
        }
        static node  leftmax(node root)
        {
            while(root.left!=null)
            {
                root=root.left;
            }
            return root;
        }
        static void leveltraversal(node root)
        {
            Queue<node> q = new LinkedList<>(); 
            q.add(root);
            q.add(null);
            while(!q.isEmpty())
            {
                node current=q.remove();

                if(current==null)
                {
                    System.out.println();
                    if(q.isEmpty())
                    break;
                    else
                    q.add(null);
                }

                else{
                    System.out.print(current.data+" ");
                    if(current.left!=null)
                    q.add(current.left);
                    if(current.right!=null)
                    q.add(current.right);
                }
            }
        }

        static int countt(node root)
        {
            if(root==null)
            return 0;
            int totleft=countt(root.left);
            int totright=countt(root.right);
            int totalcount=totleft+totright;
            return  1 + totalcount;

        }
        static int sumofnode(node root)
        {
            if(root==null)
            return 0;
            int totleft=sumofnode(root.left);
            int totright=sumofnode(root.right);
            return  root.data + totleft+totright;

        }
        static int diameter(node root)
        {
            if(root==null)
            return 0;
            int dia1=diameter(root.left);
            int dia2=diameter(root.right);
            int dia3=height(root.left)+height(root.right)+1;
            return Math.max(dia3,Math.max(dia1,dia2));    
        }

    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        // tree obj = new tree();//not necessary to create obj
        node root = tree.built(arr);
        System.out.println(root.data);

        tree.preorder(root);
        node found=tree.search(root,2);
        if(found!=null)
        System.out.println("found");
        else
        System.out.println("not found");
        System.out.print("Height of tree is : ");
        System.out.println(tree.height(root));
        System.out.println("Level Traversal is: ");
        tree.leveltraversal(root);
        System.out.println("Counting number of node: "+ tree.countt(root));
        System.out.println("Counting number of node: "+ tree.sumofnode(root));
        
        
    }
}
