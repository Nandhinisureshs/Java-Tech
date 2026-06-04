package Tree;
class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
        right = left = null;
    }
}
class BinaryTree{
    Node root;

    BinaryTree(){
        root = null;
    }

    void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

     void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
public class Tree_BinaryTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.left.left = new Node(82);
        tree.root.left.right = new Node(70);
        tree.root.right = new Node(55);
        tree.root.right.left = new Node(42);
        tree.root.right.right = new Node(12);

        System.out.println("Pre-Order: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.println("Post-Order: ");
        tree.postorder(tree.root);
        System.out.println();

        System.out.println("In-Order: ");
        tree.inorder(tree.root);




    }
}