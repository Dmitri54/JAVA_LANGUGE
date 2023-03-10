package OOP_JAVA.lessons.les_03;
/**
 * Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
 * =================================================================================================
 * План занятия:
 * 1. Введение
 * 2. Iterator<E>
 * 3. Iterable<E>
 * 4. Comparator<E>
 * 5. Comparable<E>
 * 6. Comparable, equals, ==
 * 7. foreach для своих типов
 * 8. Примеры
 * 9. Итоги
 * ===============================================================================================
 * В прошлый раз я узнал, что такое абстрактные классы.
 * Классы могут быть полностью абстрактными со всеми абстракными членами.
 * Далее, чтобы создать экземпляр такого класса возможности нет, но я могу иерархию, т.е. наследовать
 * какой-то класс, от полностью абстрактного. В классе наследнике уже реализовать всю логику и 
 * создавать экземпляры.
 * Все это можно сделать проще.
 */ 

public class Program {
    public static void main(String[] args) {
        // Foo foo = new Foo(); // Как создать экземпляр класса, если он abstract.
        Foo foo1 = new Foo() { // При помощи Iterator<E>
// Foo() - было выделено красным, если навести, то Java сама предложет сделать методы.

            @Override
            public void m1() {
                System.out.println("m1");
            }

            @Override
            public void m2() {
                System.out.println("m2");
            }
                      
        };
        foo1.m1();

        Foo foo2 = new Foo() { 
            
            
            @Override
            public void m1() {
                System.out.println(">>>m1");
            }
            
            @Override
            public void m2() {
                System.out.println(">>>m2");
            }
                                  
        };
        foo2.m1();
    }
}
/**
 * Где это нужно?????????????????????????????????????????????????????????????????????????????????
 * Пример: Ex001 - Iterator<E>
 * Как создать Итератор для коллекции.
 * ----------------------------------------------------------------------------------------------
 * Пример: Ex002
 * Как заставить Итератор ходить по отдельным членам моего класса (к примеру Worker).
 * Нужно в классе Worker имплементировать Интерфейс Итератор с типом String (в данном примере).
 * ----------------------------------------------------------------------------------------------
 * Пример: Ex004
 * ----------------------------------------------------------------------------------------------
 * Пример: Ex005 - Comparable<E>
 * Если бы понадобилось коллекцию наполненную моими типами, можно было отсортировать по какому-то
 * заданному мной правилу, т.е. 
 * Есть коллекция чисел, то я её сортирую и получаю упорядоченный список элементов.
 * А если я наполню эту коллекцию условными рабочими, то как определить, что значит один рабочий 
 * больше другого?
 * -----------------------------------------------------------------------------------------------
 * Привер: Ex006
 * Показаны разные способы сравнения объектов.
 * Что значит один экземпляр класса равен другому?
 * ------------------------------------------------------------------------------------------------
 * Пример: Ex007
 * Как настроить так чтобы не было повторений в конечном выводе.
 */

// -----------------------------------------------------------------------------------------------
 /**
  * Введение:
 * Некоторые стандартные интерфейсы и придание нового поведения своим типам.
 * -----------------------------------------------------------------------------------------------
 * Iterator<E>
 * Итератор над «коллекцией». Iterator занимает место Enumeration’в Java Collections Framework.
 * 
 * hasNext()
 * next()
 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * Iterable<E>
 * Позволяет собственному типу быть типом оператора «for-each loop»
 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * Comparator<E>
 * Предназначен для упорядочивания собственных типов.
 * 
 * obj.compare(x, y) <= 1
 * obj.compare(x, y) <= 0
 * obj.compare(x, y) <= -1
 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * Comparable<E>
 * Списки (и массивы) собственных типов позволяют автоматически сортироваться при помощи 
 * 
 * Collections.sort
 * Arrays.sort 
 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * Comparable, equals, ==
 * ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
 * Итого:
 * Интерфейсов много
 * 
 * Cloneable
 * Serializable
 * *able и др.
 * 
 * «Заставить» работать стандартный функционал.
 * Работа со своими свои типы «как нужно».
 * Определить «свою» логику работы.
 */

