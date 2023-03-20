package OOP_JAVA.lessons.les_06;

import java.util.ArrayList;
import java.util.List;

// Interface segregation principle
// Принцип разделения интерфейса 
// Модули высокого уровня не должны зависеть от модулей нижнего уровня.
//   И те, и другие должны зависеть от абстракций.
// Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.

public class Ex004_2ISP {
    public static void main(String[] args) {
        List<BasePhone> phones1 = new ArrayList<BasePhone>();
        phones1.add(new IPhone());
        phones1.add(new Nokia3311());
        for (BasePhone basePhone : phones1) {
            basePhone.Call(); // Со всех телефонов произойдет звонок
        }

        // List<Fax> phones2 = new ArrayList<IPhone>();
        // phones2.add(new IPhone());
        // phones2.add(new Nokia3311()); // Не даст добавить объект не имеющего функции Fax.
    }
}

interface BasePhone { // Есть Базовый интерфейс Телефон
    void Call();
    void SendSMS();
}

interface Fax { // Интерфейс Факс
    void SendFax();

}

interface EMail extends BasePhone { // Интерфейс Имеил. Можно сделать его наследником BasePhone, тогда в классе нужно убрать.
    void SendEMail();
}

// Если описать современный телефон, то он будет в себе содержать несколько интерфейсов.
class IPhone implements BasePhone, Fax, EMail {

    @Override
    public void Call() {
    }

    @Override
    public void SendSMS() {  

    }

    @Override
    public void SendEMail() {
        

    }

    @Override
    public void SendFax() {
    }
}

class Nokia3311 implements BasePhone { // Простой телефон, имплементирует только Базовый интерфейс

    @Override
    public void Call() {
    }

    @Override
    public void SendSMS() {

    }
}
