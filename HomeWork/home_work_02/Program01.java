/**
 * 2 семинар:
 * 1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
 * 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга 
 *   (вхождение в обратном порядке).
 * 3*. Напишите программу, чтобы перевернуть строку с помощью рекурсии.
 * 4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
 * 5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
 * 6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
 * 7**. Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
 */

package HomeWork.home_work_02;



public class Program01 {
    public static void main(String[] args) {
    // 1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
        StringBuffer builder1 = new StringBuffer(); // 7&Hello!false1.901
        builder1.append(7);
        builder1.append('&');
        builder1.append("Hello!");
        builder1.append(false);
        builder1.append(1.901);
        System.out.println(builder1);

        StringBuffer builder2 = new StringBuffer(); // 7&Hello!false1.901
        builder2.append(7);
        builder2.append('&');
        builder2.append("Hello!");
        builder2.append(false);
        builder2.append(1.901);
        System.out.println(builder2);

        System.out.println(builder1.toString().equals(builder2.toString())); // true // Строки одинаковы.
        
    // 3*. Напишите программу, чтобы перевернуть строку с помощью рекурсии.

        // System.out.println(builder2.reverse()); // 109.1eslaf!olleH&7
        // При помощи встроенного метода name_str.reverse() 

        String strRev = builder2.toString();
        System.out.println(reverseStr(strRev)); // 109.1eslaf!olleH&7
       
    // 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга 
        //   (вхождение в обратном порядке).
        
        System.out.println("Данные строки: " + builder1.toString() + "  и  " + reverseStr(strRev));
        System.out.println("\nКонкатенация первой строки дважды: "+ builder1.toString() + builder1.toString());
        if (checkForRotation(builder1.toString(), builder2.toString())){
            System.out.println("Вторая строка "+ reverseStr(strRev) +" существует в новой строке.");	
        }
        else
        {
            System.out.println("Вторая строка "+builder2.toString()+"  не существует в новой строке.");	
            System.out.printf("\nСтроки не являются поворотами друг друга");
        }
    }

    private static String reverseStr(String s) {
        if (s.length() == 1) return s; // Base step
        return "" + s.charAt(s.length() - 1) + reverseStr(s.substring(0, s.length() - 1)); // Recursive step
      
    }

    static boolean checkForRotation (String str1, String str2){
            return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
    }
    
}
