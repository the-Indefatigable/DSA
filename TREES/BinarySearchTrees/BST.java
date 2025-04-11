
/**
 * BST
*/
public class BST {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

        static class BinarySearchTrees
        {

            static int idx = -1;
            public static Node  insert(Node root , int value)
            {
                if (root == null) {
                   root  = new Node(value);
                   return root;

                }

                if(value < root.data)
                {
                   root.left =  insert(root.left , value);
                }
                
                else 
                {
                    root.right =insert(root.right, value);
                }

                return root;

            }
        }

        public static void inorderTraversal(Node root)   
        {
            if (root == null) {
                return ; 
             } 

            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
        

    

    public static void main(String[] args) {
        int node[] = {5,1,3,4,2,7};
        BinarySearchTrees binarySearchTrees = new BinarySearchTrees();
        Node root = null;


        for (int i = 0; i < node.length; i++) {

            root =     binarySearchTrees.insert(root, node[i]);   
        }

        inorderTraversal(root);

    
    }
}
