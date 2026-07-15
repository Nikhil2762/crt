public class StringsInJava {
  public static void main(String[] args) {
    // NOTE: Since Strings are immutable in java try using String Builder
    String a = "I Am God";
    a = a.concat(" God is Great");
    System.out.println(a);
    StringBuilder stringBuilder = new StringBuilder("I Am God");
    stringBuilder.append(" God is Great");
    System.out.println(stringBuilder);
  }
}
