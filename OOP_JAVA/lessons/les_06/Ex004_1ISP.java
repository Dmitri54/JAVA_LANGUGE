package OOP_JAVA.lessons.les_06;

// Interface segregation principle
// Принцип разделения интерфейса 
// Модули высокого уровня не должны зависеть от модулей нижнего уровня.
//   И те, и другие должны зависеть от абстракций.
// Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.

public class Ex004_1ISP {
    public static void main(String[] args) {

    }
}
// Система, для работы с телефонами.
// Современные телефоны умеют многое

interface Phone { // Базовый интерфейс 
    void Call();   
    void SendSMS();    
    void SendEMail();
    void SendFax();
}


class Siemens implements Phone { // Описал класс Siemens, который умеет...

    @Override
    public void Call() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void SendSMS() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void SendEMail() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void SendFax() {
        // TODO Auto-generated method stub
        
    }
}

// Если Siemens обладает таким функционалом (interface Phone), то Nokia3310 точно нет.
// Что делать?????????????????????????????????????????????????????????????????????????????
class Nokia3310 implements Phone { 

    @Override
    public void Call() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void SendSMS() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void SendEMail() { 
        // ??? ... Правильнее будет вынести отдельный функционал в отдельные интерфейсы.
        // Смотри Ex004_2ISP
        
    }

    @Override
    public void SendFax() {
        // ??? ...
        
    }

    
}
/**
 * Interface segregation principle
 * Принцип разделения интерфейса 
 * 
 * Клиенты не должны реализовывать интерфейсы, которые они не используют.
 * Данный принцип требует разделения «толстых» интерфейсов на несколько специализированных,
 * связанных общей функциональностью.
 * =============================================================================================
 */