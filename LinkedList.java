public class LinkedList {
  public static void main(String[] args) {
    LinkedNode head = new LinkedNode(-1);

    int i = 1;
    // NOTE: Adding 10 Elements
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
    // NOTE: Adding Element At The Beginning
    LinkedNode addNewFirstElement = new LinkedNode(1000);
    addNewFirstElement.pointer = head.pointer;
    head.pointer = addNewFirstElement;
    current = head.pointer;
    while (current != null) {
      System.out.println(current.value);
      current = current.pointer;
    }
    // NOTE: Adding Element At the Second Place
    System.out.println("Adding Element At the Second Place");
    current = head;
    while (current != null) {
      if (current.value == 1000 && current.pointer.value == 10) {
        LinkedNode newNode = new LinkedNode(2000);
        newNode.pointer = current.pointer;
        current.pointer = newNode;
        break;
      }
      current = current.pointer;
    }
    current = head.pointer;
    while (current != null) {
      System.out.println(current.value);
      current = current.pointer;
    }
  }
}
