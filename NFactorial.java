public class NFactorial {
  public static double recursion(int n) {
    if (n == 1 || n == 0.0)
      return 1;
    return n * recursion(n - 1);
  }

  public static void main(String[] args) {
    System.out.println(recursion(10));
  }
}
