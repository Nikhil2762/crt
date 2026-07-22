import java.util.Scanner;
public class BinaryTree {
  public static TreeNode createNode(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter data (-1) for NULL: ");
    int data = scanner.nextInt();
    TreeNode root = new TreeNode(data);
    System.out.println("Enter Data for Left Child: ");
    root.left = createNode();
    System.out.println("Enter Data for Right Child: ");
    root.right= createNode();
    scanner.close();
    return root;
  }
  public static void inorder(TreeNode root){
    if(root == null){
      return;
    }
    inorder(root.left);
    System.out.println(root.value);
    inorder(root.right);
  }
}
