public class CountingSort {
  public static void main(String[] args) {
    int[] arr = { 2, 1, 0, 1, 3, 5, 5, 4 };
    int[] freq = new int[6];
    // NOTE: First Step is to count the frequencies
    for (int i = 0; i < arr.length; i++) {
      freq[arr[i]]++;
    }

    // NOTE: Second Step is to compute the prefix sum
    for (int i = 1; i < freq.length; i++) {
      freq[i] += freq[i - 1];
    }
    int[] sortedArray = new int[arr.length];
    // NOTE: Next step is to sort the array
    // NOTE: loop from back then place at prefix value -1 and decrement the predix
    // value
    for (int i = arr.length - 1; i >= 0; i--) {
      int value = arr[i];
      int prefixValue = freq[value];
      sortedArray[prefixValue - 1] = value;
      freq[value]--;
    }

    for (int value : sortedArray) {
      System.out.println(value);
    }
  }
}
