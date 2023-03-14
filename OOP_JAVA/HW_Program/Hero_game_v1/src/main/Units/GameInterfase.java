package OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units;

import java.util.ArrayList;

// Тут я пишу имена методов и параметры. которые они принимают, т.к. 
// их точно нужно реализовать в каждом классе наследнике и чтобы не упустить (забыть) пишу их тут.

public interface GameInterfase { 
    StringBuilder getInfo();
    
    void step(ArrayList<Human> team1, ArrayList<Human> team2);

}

// Если класс наследник абстрактный класс (public abstract class Human implements GameInterfase), который 
// реализует GameInterfase, то в нем (Human) описывать методы GameInterfase не нужно, 
// т.е. если нет нужны можно не писать.