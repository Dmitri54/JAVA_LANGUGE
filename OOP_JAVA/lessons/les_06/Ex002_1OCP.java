package OOP_JAVA.lessons.les_06;

// Open-closed principle
// Принцип открытости/закрытости
// Можно улучшать, но нельзя изменять
public class Ex002_1OCP {
    public static void main(String[] args) {
        System.out.println(new Client(1).getDiscount(100));
    }
}

class Client { // Есть Клиент и я могу предоставить скидку.
    public int clientType;

    public Client(int type) {
        clientType = type;
    }

    public double getDiscount(double price) { // Скидка
        return (clientType == 1) ? price *0.85 : price *0.95;

// Минус в точ, что есть нужно будет поменять градацию скидок, то нужно будет переписывать весь код.
// И писать каскад if'ов.
// Смотри Ex002_2OCP
    }
}

// Больше клиентов = больше if'ов

/**
 * Open-closed principle
 * Принцип открытости/закрытости
 * 
 * классы должны быть открыты для расширения и одновременно закрыты для модификации.
 * Иными словами, должна быть возможность добавлять новые свойства и расширять класс
 * без изменения внутренней реализации существующих свойств.
 * «закрыт для модификации» «Открыт для расширений»
 *
 */
