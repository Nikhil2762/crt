public class LinkedList {
  public static void main(String[] args) {
    LinkedNode head = new LinkedNode(-1);
    for (int i = 1; i <= 10; i++) {
      append(head, i * 10);
    }
    System.out.println("Initial list:");
    display(head);
    addFirst(head, 1000);
    System.out.println("After adding 1000 at the beginning:");
    display(head);
    System.out.println("Adding 2000 at the second place:");
    insertAfter(head, 1000, 2000);
    display(head);
    System.out.println("Inserting 69 at index 5:");
    insertAt(head, 5, 69);
    display(head);
    deleteFirst(head);
    System.out.println("After deleting first element:");
    display(head);
    deleteLast(head);
    System.out.println("After deleting last element:");
    display(head);
    deleteByValue(head, 50);
    System.out.println("After deleting value 50:");
    display(head);
  }

  private static void append(LinkedNode head, int value) {
    LinkedNode newNode = new LinkedNode(value);
    LinkedNode current = head;
    while (current.pointer != null) {
      current = current.pointer;
    }
    current.pointer = newNode;
  }

  private static void display(LinkedNode head) {
    LinkedNode current = head.pointer;
    while (current != null) {
      System.out.println(current.value);
      current = current.pointer;
    }
  }

  private static void addFirst(LinkedNode head, int value) {
    LinkedNode newNode = new LinkedNode(value);
    newNode.pointer = head.pointer;
    head.pointer = newNode;
  }

  private static boolean insertAfter(LinkedNode head, int targetValue, int newValue) {
    LinkedNode current = head;
    while (current != null) {
      if (current.value == targetValue && current.pointer != null) {
        LinkedNode newNode = new LinkedNode(newValue);
        newNode.pointer = current.pointer;
        current.pointer = newNode;
        return true;
      }
      current = current.pointer;
    }
    return false;
  }

  private static boolean insertAt(LinkedNode head, int index, int value) {
    LinkedNode current = head;
    int i = 1;
    while (current != null && current.pointer != null) {
      if (i == index) {
        LinkedNode newNode = new LinkedNode(value);
        newNode.pointer = current.pointer;
        current.pointer = newNode;
        return true;
      }
      current = current.pointer;
      i++;
    }
    return false;
  }

  private static void deleteFirst(LinkedNode head) {
    if (head.pointer != null) {
      head.pointer = head.pointer.pointer;
    }
  }

  private static void deleteLast(LinkedNode head) {
    LinkedNode current = head;
    if (current.pointer == null)
      return;

    while (current.pointer.pointer != null) {
      current = current.pointer;
    }
    current.pointer = null;
  }

  private static boolean deleteByValue(LinkedNode head, int value) {
    LinkedNode current = head;
    while (current.pointer != null) {
      if (current.pointer.value == value) {
        current.pointer = current.pointer.pointer;
        return true;
      }
      current = current.pointer;
    }
    return false;
  }
}
