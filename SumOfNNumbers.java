public class SumOfNNumbers {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int sum = 0;
    for (int value : arr) {
      sum += value;
    }
    System.out.println(sum);
  }
}
