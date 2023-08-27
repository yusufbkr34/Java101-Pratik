public class kelimeyiTerstenYazma {
    // Özyinelemeyi Kullanarak Bir Cümleyi Tersine Çevirme

  public static void main(String[] args) {
    String sentence = "Go work";
    String reversed = reverse(sentence);
    System.out.println("Tersine cevrilmis kelime: " + reversed);
  }

  public static String reverse(String sentence) {
    if (sentence.isEmpty())
      return sentence;

    return reverse(sentence.substring(1)) + sentence.charAt(0);
  }
}