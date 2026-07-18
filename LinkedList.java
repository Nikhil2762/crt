public class LinkedList {
  public static void main(String[] args) {
    LinkedNode head = new LinkedNode(-1);

    int i = 1;
    while (i <= 10) {
      LinkedNode newNode = new LinkedNode(i * 10);
      LinkedNode current = head;
      while (current.pointer != null) {
        current = current.pointer;
      }
      current.pointer = newNode;
      i++;
    }

    LinkedNode current = head.pointer;
    while (current != null) {
      System.out.println(current.value);
      current = current.pointer;
    }
    System.out.println("Adding At The Start");
    LinkedNode addNewFirstElement = new LinkedNode(1000);
    addNewFirstElement.pointer = head.pointer;
    head.pointer = addNewFirstElement;
    current = head.pointer;
    while (current != null) {
      System.out.println(current.value);
      current = current.pointer;
    }
  }
}
