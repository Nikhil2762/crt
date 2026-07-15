public class SearchTarget {
  public static void main(String[] args) {
    int[] arr = new int[5];
    for (int i = 0; i < 5; i++) {
      arr[i] = i;
    }
    int index = returnIndex(arr, 4);
    System.out.println(index);
  }

  public static int returnIndex(int[] arr, int target) {
    int left = 0;
    int right = arr.length;
    while (left < right) {
      int mid = (left + right) / 2;
      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] < target) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    return -1;
  }
}
