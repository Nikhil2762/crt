import java.util.Scanner;

public class SumOfNNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] arr = new int[10];
    for (int i = 0; i < 10; i++) {
      arr[i] = scanner.nextInt();
    }

    int sum = 0;
    for (int value : arr) {
      sum += value;
    }
    System.out.println(sum);
    scanner.close();
  }
}
