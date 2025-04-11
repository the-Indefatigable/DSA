import java.util.LinkedList;
import java.util.Queue;




/**
 * BinaryTreeB
 */
public class BinaryTreeB {

    static class Node
    {
        int data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BinaryTree {

       static int idx = -1;
        public static Node buildTree(int []node)
        {
            idx++;
            if (node[idx]==-1) {
               return null; 
            }

            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);

            return newNode;
        }
    }

       public static void preorderTraversal(Node root)
       {
           if (root == null) {
              return;
           }
            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
       }

       public static void inorderTraversal(Node root)
       {
//           if(root == null) return null ;
//
//           Node leftNode = inorderTraversal(root.left);
//           System.out.println(leftNode.data);
//           Node right = inorderTraversal(root.right);
//           System.out.println(right.data);
//           return root;
//
           if (root == null) {
               return; 
           }
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);

       }

       public static void postorderTraversal(Node root)
       {
           if (root == null) return;

           postorderTraversal(root.left);
           postorderTraversal(root.right);
           System.out.print(root.data + " ");
       }

       public static void levelorderTraversal(Node root)
       {
           if (root == null) return ;
           Queue<Node> queue = new LinkedList<>();
           queue.add(root);

           while (!queue.isEmpty()) {
              Node curr = queue.remove();
              System.out.print(curr.data + " ");

              if(curr.left != null)  queue.add(curr.left);

              if(curr.right  != null)  queue.add(curr.right);
           }

               
       }

       public static void microsoftLevelOrder(Node root)
       {

           Queue<Node> queue = new LinkedList<>();
           queue.add(root);
           queue.add(null);

           while (!queue.isEmpty()) {
              Node curr = queue.remove();

              if(curr == null){
                  System.out.println();

                  if(queue.isEmpty()) break ;

                  else queue.add(null);
              }
              else{
              System.out.print(curr.data + " ");

              if(curr.left != null)  queue.add(curr.left);

              if(curr.right  != null)  queue.add(curr.right);
              }
           }
           
       }

       public static int heightOfTree(Node root)
       {
           if(root == null) return 0;

           int lh = heightOfTree(root.left);
           int rh = heightOfTree(root.right);

           int height = Math.max(lh, rh) +1;

           return height;


       }

       public static int countNodes(Node root)
       {

           if (root == null) {
              return 0; 
           }

          int lc = countNodes(root.left);
          int rc = countNodes(root.right);

          int count = lc+rc+1;
          return count;
        
       }

       public static int sumOfNodes(Node root){

           if(root == null) return 0; 
           

           int sumL = sumOfNodes(root.left);
           int sumR = sumOfNodes(root.right);

           int sum = sumL + sumR + root.data; 
           return sum;
       }


    public static void main(String[] args) {
        int node [] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree binaryTree = new BinaryTree();
        Node root =  binaryTree.buildTree(node);
        System.out.println(root.data);

        preorderTraversal(root);
        System.out.println();
        inorderTraversal(root);
        System.out.println();
        postorderTraversal(root);
        System.out.println();
        levelorderTraversal(root);
        System.out.println();
        microsoftLevelOrder(root);
        System.out.println();
        System.out.println(heightOfTree(root));
        System.out.println();
        System.out.println(countNodes(root));
        System.out.println();
        System.out.println(sumOfNodes(root));
        
        
    }
}
