package OOP_JAVA.lessons.les_01.Ex004;

public class Program {
    public static void main(String[] args) {
        // #region Robot1 demo

        //  Robot1 robot1 = new Robot1("name_1", 1);
        
        // robot1.level = 100500;
        // System.out.printf("%s %d\n", robot1.name, robot1.level);
         
        // //#endregion
       
        // // #region processing

        // robot1.startBIOS();
        // robot1.startOS();
        // robot1.sayHi();

        // robot1.work();

        // robot1.sayBye();
        // robot1.stopOS();
        // robot1.stopBIOS();

        // // #endregion

        // System.out.println();
// ----------------------------------------------------------------------------------------------------- 
// Минус данного кода, в том, что пользователь может поменять порядок запуска программ или задать значение 
// роботу. Это может привести к ошибке. Нужно прописать логику взоимодействия функций между собой, 
// чтобы у пользователя не было возможности нажать не ту кнопку или задать не то значение.
// -----------------------------------------------------------------------------------------------------
        // #endregion

        // #region Robo2 demo

        // Robot2 robot2 = new Robot2("name_2", 1);

        // System.out.printf("%s %d\n", 
        // robot2.getName(), robot2.getLevel());
        
        // robot2.work();
        // robot2.work();
        // robot2.work();
        // robot2.powerOff();

// ----------------------------------------------------------------------------------------------------
// Взял поля private int level и private String name, описал для них отдельные методы только на чтение 
// (getLevel, getName).
// Раньше у меня был целый набор методов (startBIOS, startOS, sayHi, stopBIOS, stopOS, sayBye, work) и
// их можно было вызывать, это не правильно.
// Сделал два метода "Кнопки" (powerOn, powerOff) включение и выключения системы.
// Заменил слово public на private, чтобы скрыть поля от пользователя.
// ----------------------------------------------------------------------------------------------------- 
// Система стала лучше, меньше кнопок, которые может нажимать (вызывать) пользователь.
// Нет возможности изменить name и level.
// Но и тут пользователь может сначала попробовать запустить задачу, потом включение системы, что приведет 
// к ошибке.
// -----------------------------------------------------------------------------------------------------

        // #endregion

        //#region Robo3 demo

        Robot3 robot3 = new Robot3("name_3");
        System.out.println("-------------");
        System.out.println(robot3);
        robot3.power();
        robot3.work();
        robot3.power();
        robot3.work();

        robot3.power();
        
        //#endregion

    }

}
