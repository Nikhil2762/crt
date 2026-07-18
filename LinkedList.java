public class LinkedList {
  public static void main(String[] args) {
    LinkedNode head = new LinkedNode(-1);
    LinkedNode newNode = new LinkedNode(10);
    head.pointer = newNode;
    System.out.println(head.pointer.value);
  }
}
