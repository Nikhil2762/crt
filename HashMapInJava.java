import java.util.HashMap;
import java.util.Scanner;

public class HashMapInJava {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("238T1A0511", "Mukesh Balaji");
    hashMap.put("238T1A0528", "Dattu");
    hashMap.put("238T1A0522", "Revanth");
    hashMap.put("238T1A0562", "Nikhil");
    String key = scanner.nextLine();
    if (hashMap.containsKey(key)) {
      System.out.printf("The Student With the Roll Number : %s is %s\n", key, hashMap.get(key));
    } else {
      System.out.println("The Student With the Roll Number " + key + " Not Found");
    }
    scanner.close();
  }
}
