public class DequeueInJava {
  static int [] arr = new int[10];
  static int head = 0;
  static int tail = 0;
  static int size = arr.length ;
  public static void main(String[] args) {
    addValue(10); 
    addValue(20); 
    addValue(30); 
    addValue(40); 
    display();
    System.out.println("Head of The Array : " + peek());
    System.out.println("Is Dequeue Empty : "+isEmpty());
    System.out.println("Is Dequeue Full : "+isFull());
  }
  public static void addValue(int val){
    if(tail == size - 1){
      System.out.println("OverFlow Errro");
      return;
    }
    arr[tail] = val;
    tail += 1;
  }
  public static void display(){
    if(tail == head)return;
    for(int i = head;i<tail;i++){
      System.out.println(arr[i]);
    }
  }
  public static int peek(){
    return arr[head];
  }
  public static boolean isEmpty(){
    if(head == tail)return true;
    return false;
  }
  public static boolean isFull(){
    if(tail == size - 1)return true;
    return false;
  }
}
