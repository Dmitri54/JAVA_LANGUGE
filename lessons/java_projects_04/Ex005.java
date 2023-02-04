// Пример использования Stack.
// Вычислить значение выражения в посфиксной форме.
// ====================================================================================================
package lessons.java_projects_04;

import java.util.Stack;

public class Ex005 {

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        // (1+2*3*4)*(10/5) - 20 // Инфиксная форма записи выражения.
        // 1 2 3 * 4 * + 10 5 / * 20 - // Постфиксная форма записи выражения
        
        // var exp = "20 30 - 10 *".split(" "); // (20-30)*10
        // var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3 // Инфиксная форма
        
        var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        int res = 0;
        System.out.println(exp);
        
        Stack<Integer> st = new Stack<>(); // В переменной типа Stack буду хранить данные.
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(exp[i])) { // Проверяю, если элемент число, то
                st.push(Integer.parseInt(exp[i])); // добавляю в Stack st.
            } else {
                switch (exp[i]) { // Если получаю операцию, то
                    case "+":
                        res = st.pop() + st.pop(); // Извлекаю два последних элемента из Stack st, выполняю операцию.
                        st.push(res); // Кладу результат выражения в Stack st.
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res =  st.pop()/ st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop()); // Результат выражения.
    }
}
