public class StackLinkedList {
  static int count = 1;

  public static void main(String[] args) {
    StackList head = new StackList(-1);
    StackList top = head;
    top = push(head, top, 10);
    top = push(head, top, 20);
    top = push(head, top, 30);
    top = push(head, top, 40);
    top = pop(head, top);
    top = pop(head, top);
    top = pop(head, top);
    top = pop(head, top);
    top = pop(head, top);
    top = pop(head, top);
    top = pop(head, top);
    top = pop(head, top);
    display(head, top);
  }

  public static StackList push(StackList head, StackList top, int value) {
    StackList newNode = new StackList(value);
    top.next = newNode;
    if (count == 1) {
      head.next = newNode;
      count = 0;
    }
    return newNode;
  }

  public static StackList pop(StackList head, StackList top) {
    if (head == top) {
      System.out.println("Cannot Pop Stack Is Empty");
      return top;
    }
    StackList current = head;
    while (current.next != top) {
      current = current.next;
    }
    current.next = null;
    return current;
  }

  public static int peek(StackList top) {
    return top.value;
  }

  public static void display(StackList head, StackList top) {
    StackList current = head.next;
    while (current != null) {
      System.out.println(current.value);
      current = current.next;
    }
  }
}
