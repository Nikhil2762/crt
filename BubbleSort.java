public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = { 10, 1, 4, 18, 130, 13 };
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          arr[j] = arr[j] + arr[j + 1];
          arr[j + 1] = arr[j] - arr[j + 1];
          arr[j] = arr[j] - arr[j - 1];
        }
      }
    }
    for (int value : arr) {
      System.out.println(value);
    }
  }
}
