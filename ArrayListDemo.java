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
    boolean result = arrayList.contains(10); // NOTE: Contains returns boolean value as the result
    System.out.println(result);
    System.out.println(arrayList);
    int sum = 0;
    for (int value : arrayList) {
      sum += value;
      System.out.println(value);
    }
    System.out.println("Sum Of The Numbers : " + sum);
    System.out.println("Max Element is : " + returnLargestElement(arrayList));
  }

  public static Integer returnLargestElement(ArrayList<Integer> arrayList) {
    Integer max = arrayList.get(0);
    for (int i = 1; i < arrayList.size() - 1; i++) {
      if (max < arrayList.get(i)) {
        max = arrayList.get(i);
      }
    }
    return max;
  }
}
// NOTE: Difference between Array and ArrayList
// NOTE: Size -> Array is fixed size while the ArrayList can grow Dynamically
// NOTE: DataTypes -> For Arrays you can use primitive and Wrapper Classes for
// ArrayList you can only use the Wrapper Classes
// NOTE: Printing in Console -> if you print the Array directly to the console
// you will get the memory address but for Array List you will get list output
// with [<values>]
