public class StackInJava {

  public static void main(String[] args) {
    StackArray stackArray = new StackArray(10);
    stackArray.push(10);
    stackArray.push(20);
    stackArray.pop();
    stackArray.push(11);
    stackArray.display();
  }
}
