package OOP_JAVA.lessons.les_01.Ex006;

import java.util.Random;

public class Teams {
    public static void main(String[] args) {
        int teamCount = 10; // Создаю условное колличество персонажей.
        Random rand = new Random(); 
        int magicianCount = rand.nextInt(0, teamCount); // Генерирую количетво магов
        int priestCount = teamCount - magicianCount; // отнего будет зависить количество жрецов.

        System.out.printf("magicalCount: %d priestCount: %d \n", magicianCount, priestCount);

        Priest[] priests = new Priest[priestCount]; // Создал массив для хранения жрецов
        Magician[] magicians = new Magician[magicianCount]; 

        for (int i = 0; i < priestCount; i++) { // Пробегаю циклом, чтобы наполнить массив.
            priests[i] = new Priest();
            System.out.println(priests[i].getInfo());
        }
        System.out.println();

        for (int i = 0; i < magicianCount; i++) {
            magicians[i] = new Magician();
            System.out.println(magicians[i].getInfo());
        }

    }

}
