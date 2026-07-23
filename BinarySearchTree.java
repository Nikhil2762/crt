public class BinarySearchTree {
  public static void main(String[] args) {
    BinaryNode root = null;
    root = addNode(root, 10);
    root = addNode(root, 5);
    root = addNode(root, 15);
    root = addNode(root, 3);
    root = addNode(root, 7);
    root = addNode(root, 12);
    root = addNode(root, 18);

    System.out.println("Search 7: " + searchNode(root, 7));   
    System.out.println("Search 10: " + searchNode(root, 10)); 
    System.out.println("Search 18: " + searchNode(root, 18));
    System.out.println("Search 1: " + searchNode(root, 1));
    System.out.println("Search 20: " + searchNode(root, 20));
    System.out.println("Search 6: " + searchNode(root, 6));

    System.out.println("inorder Traversal : ");
    inorder(root);

    System.out.println("preorder Traversal : ");
    preorder(root); 
    System.out.println("postorder Traversal : ");
    postOrder(root);
  } 
  public static BinaryNode addNode(BinaryNode root,int val){
      if(root == null) {
        return new BinaryNode(val);
      }
      if(val < root.val){
        root.left = addNode(root.left, val);
      }else if(val > root.val){
        root.right = addNode(root.right, val);
      }
      return root;
  }
  public static boolean searchNode(BinaryNode root,int val){
    BinaryNode current = root;
    while(current != null){
        if(current.val == val) {
          return true;
        }else if(current.val > val){
          current = current.left;
        }else{
          current = current.right;
        }
    }
    return false;
  }
  public static void inorder(BinaryNode root){
    if(root == null){
      return;
    }
    inorder(root.left);
    System.out.println(root.val);
    inorder(root.right);
  }
  public static void preorder(BinaryNode root){
    if(root == null){
      return;
    }
    System.out.println(root.val);
    preorder(root.left);
    preorder(root.right);
  }
  public static void postOrder(BinaryNode root){
    if(root == null){
      return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.println(root.val);
  }
}
