public class CycleInLinkedList {
  public static void main(String[] args) {
    LinkedNode head = new LinkedNode(-1);
    LinkedNode node1 = new LinkedNode(10);
    head.pointer = node1;
    LinkedNode node2 = new LinkedNode(20);
    node1.pointer = node2;
    LinkedNode node3 = new LinkedNode(30);
    node2.pointer = node3;
    LinkedNode node4 = new LinkedNode(40);
    node3.pointer = node4;
    LinkedNode node5 = new LinkedNode(50);
    node4.pointer = node5;
    node5.pointer = null;
    System.out.println(containsCycle(head));
  }

  public static boolean containsCycle(LinkedNode head) {
    LinkedNode slowPointer = head.pointer;
    LinkedNode fastPointer = head.pointer;
    while (fastPointer != null && fastPointer.pointer != null) {
      slowPointer = slowPointer.pointer;
      fastPointer = fastPointer.pointer.pointer;
      if (slowPointer == fastPointer) {
        return true;
      }
    }
    return false;
  }
}
