class hight{
    public static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
    
        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int treeHeight(TreeNode root) {
        if (root == null) {
            return 0; // Empty tree has a height of -1
        }
        int leftHeight = treeHeight(root.left);
        int rightHeight = treeHeight(root.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        System.out.println("hii");
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Height of the binary tree is: " + treeHeight(root));
    }
}