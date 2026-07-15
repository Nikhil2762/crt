public class FrequencyInArrays {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 1, 1, 1 };
    int freq = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 2) {
        freq++;
      }
    }
    System.out.println(freq);
  }
}
