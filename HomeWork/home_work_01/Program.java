/**
 * 1. семинар.
1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

int i = new Random().nextInt(k); //это кидалка случайных чисел!)
 */


package HomeWork.home_work_01;

import java.util.Arrays;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
           
        int i = new Random().nextInt(2000); // Выбросит случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        System.out.println("i = " + i);
        // System.out.println(Integer.toBinaryString(i)); // Преставление числа в двоичном виде.
        // String ibinaty = Integer.toBinaryString(i);
        // System.out.println(ibinaty); // Преставление числа в двоичном виде.
       
        int n = 0;
        while (i != 1) {
            i >>= 1;
            n++;
        }
        System.out.println("n = " + n); // Номер старшего значащего бита выпавшего числа.
                   
        // Short.MAX_VALUE – это константа, содержащая максимальное значение, 
        // которое может иметь короткое замыкание, 2^15 - 1 (32767).
        // Short.MIN_VALUE – содержащая минимальное значение короткого замыкания, -2^15 (-32768).
        
        int long_m1 = (32767-i)/n; // Длинна массива чисел кратных n, от i до Short.MAX_VALUE.
        int initialValue = i;
        int [] m1 = new int[long_m1];
        int index1 = 0;
        while (initialValue <= Short.MAX_VALUE){
            if (initialValue % n == 0){
                m1[index1] = initialValue;
                initialValue += n;
                index1 += 1;
            } else {
                initialValue += 1;
            }
        }
        System.out.println("массив m1");
        System.out.println(Arrays.toString(m1));

        int long_m2 = (32768 + i) - (32768/n + (i - 1)/n);
        int [] m2 = new int[long_m2];
        int index2 = 0;
        while (i >= Short.MIN_VALUE){
            if (i % n != 0){
                m2[index2] = i;
                i = i - 1;
                index2 += 1;
            } else{
                i = i - 1;
            }
        }
        System.out.println("массив m2");
        System.out.println(Arrays.toString(m2));
    }
}
