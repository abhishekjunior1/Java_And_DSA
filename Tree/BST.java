public class BST {
    static class node{
        int data;
        node left;
        node right;
        node(int data)
        {
            this.data=data;
            right=left=null;
        }
    }
    static node create(node root, int data)
    {
        if(root==null)
        {
            node newnode=new node(data);
            return newnode;
        }
        if(data<root.data)
        {

            root.left=create(root.left, data);
        }
         else{

             root.right=create(root.right, data);
         }
         return root;


    }
    public static void main(String args[])
    {
        int arr[]={1,10,201,12,2};
        node root=null;
        for(int i=0;i<arr.length;i++)
            root=create(root, arr[i]);
    }
}
