// 3*. Напишите программу, чтобы перевернуть строку с помощью рекурсии.

package HomeWork.home_work_02;

public class Program03 {
    public static void main(String[] args) {
        String str = "They say, dolphins say";

        System.out.println(reverseStr(str)); // yas snihplod ,yas yehT
      }
    
    private static String reverseStr(String s) {
      if (s.length() == 1) return s; // Base step
      return "" + s.charAt(s.length() - 1) + reverseStr(s.substring(0, s.length() - 1)); // Recursive step

      }
}

