import java.util.HashMap;

public class FrequencyInHashMap {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1, 1, 1 };
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (hashMap.containsKey(arr[i])) {
        Integer value = hashMap.get(arr[i]);
        value++;
        hashMap.put(arr[i], value);
      } else {
        hashMap.put(arr[i], 1);
      }
    }
    System.out.println(hashMap.get(1));
  }
}
