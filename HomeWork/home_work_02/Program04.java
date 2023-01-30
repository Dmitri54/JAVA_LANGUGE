// 4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 
// 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
// ------------------------------------------------------------------------------------------------
// 5. Замените символ “=” на слово “равно”. 
// Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
// ------------------------------------------------------------------------------------------------
// 6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
// ===============================================================================================
package HomeWork.home_work_02;

public class Program04 {
    public static void main(String[] args) {
        
        int a = 3;
        int b = 56;

        // int sum = a + b;
        // int diff = a - b;
        // int mult = a * b;
        // float div = (float) a / b;

        // System.out.println(sum); // 59
        // System.out.println(diff); // -53
        // System.out.println(mult); // 168
        // System.out.println(div); // 0.05357143

        StringBuilder sum = new StringBuilder();
        sum
                .append(a)
                .append(" + ")
                .append(b)
                .append(" = ")
                .append(a+b);
        System.out.println(sum); // 3 + 56 = 59
        // System.out.println(sum.replace(7, 8, " равно ")); // 3 + 56  равно  59

        sum.deleteCharAt(7); // Удалит элемент под index 7.
        sum.insert(7, "равно"); // Добавит элемент.
        System.out.println("After insertion: ");
        System.out.println(sum.toString()); // 3 + 56 равно 59

        StringBuilder dif = new StringBuilder();
        dif
                .append(a)
                .append(" - ")
                .append(b)
                .append(" = ")
                .append(a-b);
        System.out.println(dif); // 3 - 56 = -53
        // System.out.println(dif.replace(7, 8, " равно ")); // 3 - 56  равно  -53

        dif.deleteCharAt(7);  
        dif.insert(7, "равно");
        System.out.println("After insertion: ");
        System.out.println(dif.toString()); // 3 - 56 равно -53

        StringBuilder mult = new StringBuilder();
        mult
                .append(a)
                .append(" * ")
                .append(b)
                .append(" = ")
                .append(a * b);
        System.out.println(mult); // 3 * 56 = 168
        // System.out.println(mult.replace(7, 8, " равно ")); // 3 * 56  равно  168

        mult.deleteCharAt(7);
        mult.insert(7, "равно");
        System.out.println("After insertion: ");
        System.out.println(mult.toString()); // 3 * 56 равно 168

        StringBuilder div = new StringBuilder();
        div
                .append(a)
                .append(" / ")
                .append(b)
                .append(" = ")
                .append((float)a / b);
        System.out.println(div); // 3 / 56 = 0.05357143
        // System.out.println(div.replace(7, 8, " равно ")); // 3 / 56  равно  0.05357143

        div.deleteCharAt(7);
        div.insert(7, "равно");
        System.out.println("After insertion: ");
        System.out.println(div.toString()); // 3 / 56 равно 0.05357143
    }
}
