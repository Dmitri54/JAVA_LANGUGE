package OOP_JAVA.lessons.les_06;

public class Ex002_2OCP {
    public static void main(String[] args) {

        System.out.println(new BaseClient().getDiscount(100)); // 95.0
        System.out.println(new SilverPartner().getDiscount(100)); // 85.5
        System.out.println(new VIPPartner().getDiscount(100)); // 76,95
    }
}

class BaseClient { // Выделил отдельную сущность клиент
    public double getDiscount(double price) {
        return price * 0.95; // По умолчанию скидка 5%
    }
}

// Выделил сущность Клиент серебрянного уровня, который наследует BaseClient.
class SilverPartner extends BaseClient { 
    @Override // Переопределил getDiscount
    public double getDiscount(double price) {
        return super.getDiscount(price) * 0.9; // Скидка 14,5%
    }
}

// Тоже самое.
class VIPPartner extends SilverPartner {
    @Override
    public double getDiscount(double price) {
        return super.getDiscount(price) * 0.9; // Скидка 23,05
    }
}
