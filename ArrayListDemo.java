import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(10);
    arrayList.add(20);
    arrayList.add(30);
    for (Integer value : arrayList) {
      System.out.println(value);
    }
  }
}
