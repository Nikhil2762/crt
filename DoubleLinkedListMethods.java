public class DoubleLinkedListMethods {
  public static void main(String[] args) {
    DoubleLinkedNode head = new DoubleLinkedNode(-1);
    addAtLast(head, 10);
    addAtLast(head, 20);
    addAtLast(head, 30);
    addAtStart(head, 40);
    display(head);
  }
  public static void addAtLast(DoubleLinkedNode head,int val){
    DoubleLinkedNode current = head;
    while(current.next != null){
      current = current.next;
    }
    DoubleLinkedNode newNode = new DoubleLinkedNode(val);
    current.next =  newNode;
    newNode.prev = current;
  }
  public static void addAtStart(DoubleLinkedNode head,int val){
    DoubleLinkedNode newNode = new DoubleLinkedNode(val);
    newNode.next = head.next;
    head.next.prev = newNode;
    head.next = newNode;
  }
  public static void display(DoubleLinkedNode head){
    DoubleLinkedNode current = head.next;
    while(current != null){
      System.out.println(current.val);
      current = current.next;
    }
  }
}
