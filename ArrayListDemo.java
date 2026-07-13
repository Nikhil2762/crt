import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    System.out.println(arrayList);
    // NOTE: Array List Add Method
    arrayList.add(10);
    arrayList.add(20);
    arrayList.add(30);
    arrayList.add(1, 100);
    arrayList.addFirst(1000);
    arrayList.addLast(1000000);
    // NOTE: Unlike in array where you will get the memory reference of the array
    // for array list you will get the values instead

    // NOTE: Accessing ArrayList Elements
    int index = arrayList.indexOf(10); // NOTE: This Returns the First Occurance of the element 10
    System.out.println(index);
    index = arrayList.get(arrayList.size() - 1); // NOTE: You need to pass index value to get the element at that index
    arrayList.add(20);
    index = arrayList.lastIndexOf(20); // NOTE: It Returns the Last Index of the element 20
    System.out.println(index);
    System.out.println(arrayList);
    for (int value : arrayList) {
      System.out.println(value);
    }
  }
}
// NOTE: Difference between Array and ArrayList
// NOTE: Size -> Array is fixed size while the ArrayList can grow Dynamically
// NOTE: DataTypes -> For Arrays you can use primitive and Wrapper Classes for
// ArrayList you can only use the Wrapper Classes
// NOTE: Printing in Console -> if you print the Array directly to the console
// you will get the memory address but for Array List you will get list output
// with [<values>]
