public class StackArray {
  int[] arr;
  int top;
  int size;

  StackArray(int size) {
    this.size = size;
    this.top = -1;
    this.arr = new int[size];
  }

  public boolean push(int value) {
    if (this.top == this.size) {
      return false;
    }
    top += 1;
    this.arr[top] = value;
    return true;
  }

  public boolean pop() {
    if (top == -1) {
      return false;
    }
    top -= 1;
    return true;
  }

  public void display() {
    for (int i = this.top; i >= 0; i--) {
      System.out.println(this.arr[i]);
    }
  }
}
