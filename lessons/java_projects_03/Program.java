package lessons.java_projects_03;
// Урок 3. Коллекции JAVA: Введение.
// ==============================================================================================
/**
 * План занятия:
1. Тип, который может быть чем угодно
2. Обобщения
3. Массивы и их проблемы
4. Самая «простая» коллекция
5. Функционал
6. Куда двигаться дальше
 */

/**
 * Object - это тип данных.
 * Любой тип данных можно положить в переменную типа Object, этот процесс - УПАКОВКА.
 * Преобразование Object-переменной в нужный тип - РАСПАКОВКА.
 * Иерархия типов – любой тип «ниже» Object’а.
 * 
 */
// ---------------------------------------------------------------------------------------------

// package seminars.java_projects_03;

// public class Program { // Пример: УПАКОВКА в Object тип Integer и Double.
//     public static void main(String[] args) {
        
//         Object o = 1; GetType(o); // java.lang.Integer
//         o = 1.2; GetType(o); // java.lang.Double
//     }

//     static void GetType(Object obj) {
//         System.out.println(obj.getClass().getName());
//     }
// }
// ----------------------------------------------------------------------------------------------
/**
 * Program
 */
// public class Program {

//     public static void main(String[] args) {
//         System.out.println(Sum(1, 2)); // 3
//         System.out.println(Sum(1.0, 2)); // 0
//         System.out.println(Sum(1, 2.0)); // 0
//         System.out.println(Sum(1.2, 2.1)); // 3.3
//     }
    // Чтобы выполнить действие, нужно сделать проверку и приведение типов.
    // static int Sum(int a, int b) { ...
    // }

    // static double Sum(double a, double b) { ...
    // }

    // static String Sum(String a, String b) { ...
    // }

    // Чтобы не писать метод под каждый из существующих типов данных в JAVA, можно и нужно писать один, 
    // для Object и в нем уже проверять тип данных переменной.

//     static Object Sum (Object a, Object b) {

//         if (a instanceof Double && b instanceof Double) { //Если a является Double и b принадлежит к Double.
//             return (Object) ((Double) a + (Double) b); // То я беру переменную a, привожу её явно к типу Double, 
//             // далее переменную b привожу явно к типу Double и вып.операцию сложения. 
//             // После привожу результат к Object, т.к метод возвращает этот тип данных.
//         }
//         else if (a instanceof Integer && b instanceof Integer) {
//             return (Object) ((Integer) a + (Integer) b);
//         }
//         else return 0;
//     }
// }
// ================================================================================================
/**
 * МАССИВЫ. 
 * Пример: 
 * Есть массив из 2 элементов.
 * Как увеличить размер массива?
 */

/**
 * Program
 */
// public class Program {

//     public static void main(String[] args) {
//         int[] a = new int[] { 1, 9 }; // массив из 2 элементов.
//         int[] b = new int[3]; // Создаю новый массив, чтобы добавить элемент.
//         System.arraycopy(a, 0, b, 0, a.length); 
//         // System.arraycopy(a, 0, b, 0, 0); - Скопирует данные из массива a в массив b, при чем начиная с
//         // нулевого элемента и всё длинну копируемого массива a.
//         for (int i : a) { System.out.printf("%d ", i);} // 1 9
//         System.out.println();
//         for (int j : b) { System.out.printf("%d ", j);} // 1 9 0

//     }
// }
// -------------------------------------------------------------------------------------------
// Если я захочу организовать функционал дабавления элементов в массив через отдельный метод.
/**
 * Program
 */
// public class Program {

//     public static void main(String[] args) {
//         int[] a = new int[] { 0, 9 };
//         for (int i : a) { System.out.printf("%d ", i); } // 0 9
//         a = AddItem(a, 2);
//         a = AddItem(a, 3);
//         System.out.println();
//         for (int j : a) { System.out.printf("%d ", j); } // 0 9 2 3

//     }
//     // Метод добавления элемента в массив.
//     static int[] AddItem(int[] array, int item) { // Передается массив данных и элемент, который нужно добавить.
//         int length = array.length; // Взял длинну массива. 
//         int[] temp = new int[length + 1]; // Создал новый массив с длинной на один элемент больше.
//         System.arraycopy(array, 0, temp, 0, length); // Копирую все элементы из arrayв temp.
//         temp[length] = item; // Добавляю новый элемент в новый массив.
//         return temp;
//     }
// }
// Что произходит с памятью ПК, при выполнении операции добавления элемента.
// RAM - оперативная память, делится на STACK и HEAP (управляемая куча).
// В STACK хранятся те типы данных , которые я инициализировал.
// Пример: int - этот тип занимает 4 byte и больше он быть не может. Поэтому, когда я инициализиовал
// переменную (a) в STACK выделилось 4 byte памяти.
// На следующем этапе, я определил переменную типа String, то сколько памяти выделять?
// т.к. в String можно положить от одного элемемнта до книги (Война и Мир).
// Тоже самое с массивами, т.к., когда я инициализирую переменную типа массив, я не знаю 
// сколько в ней будет элементов.
// В таком случае ссылка на массив будет храниться в STACK, а все элементы, которые я добавлю будут
// храниться в HEAP.
// Итого: при создании программы, лучше сразу заложить чуть больше места, для массива, чтобы потом его 
// непришлось увеличивать или уменьшать. Поэтому, если можно взять чуть чуть по больше, нужно взять больше.
// Если я хочу воспользоваться изменением размера массива при помощи метода, будет тоже самое (слишком много 
// операций копирования и затерания будет вып.ПК).
// Поэтому, если в рамках задачи мне потребуется массив из 10 элементов, то по умолчанию будет выделено место,
// для 10 элементов. Если вдруг я захотел добавить 11-й элемент, скорей всего мне понадобиться и добавить
// и 12-й элемент, поэтому размер массива увиличивается в 2 раза. 
// Пример: 
// 20 элементов + 1 элемент = размер массива будет на 40 элементов.
// 40 + 1 = 80 и так далее.
// На сколько элементов увиличивать массив я могу определить сам.
// ==================================================================================================
/**
 * Коллекции в JAVA. (Collection)
 * Иерархия коллекций (можно посмотреть в Google или в перезентации к лекции).
 */
// Пример использования коллекций (ArrayList()).
// ArrayList list = new ArrayList();
/**
 * Иерархия коллекций. List
 * List – пронумерованный набор элементов.
 * Пользователь этого интерфейса имеет точный контроль над тем,
 * где в списке вставляется каждый элемент.
 * Пользователь может обращаться к элементам по их целочисленному
 * индексу (позиции в списке) и искать элементы в списке.
 * Ссылка про коллецию типа List: https://docs.oracle.com/javase/8/docs/api/java/util/List.html
 * ArrayList, LinkedList (Vector, Stack - устаревшие).
 * 
 * Пример использования: фаил Ex003.java
 * Плюсы от использования такого метода:
 * Меньше ошибок на этапе компиляции кода;
 * Повторное использование кода.
 */
/**
 * Коллекции. Функционал:
 * add(args) – добавляет элемент в список ( в т.ч. на нужную позицию).
 * get(pos) – возвращает элемент из списка по указанной позиции.
 * indexOf(item) – первое вхождение или -1.
 * lastIndexOf(item) – последнее вхождение или -1.
 * remove(pos) – удаление элемента на указанной позиции и его возвращение.
 * set(int pos, T item) – помещает значение item элементу, который находится на позиции pos.
 * void sort(Comparator) – сортирует набор данных по правилу.
 * subList(int start, int end) – получение набора данных от позиции start до end.
 */
// --------------------------------------------------------------------------------------------------
/**
 * clear() – очистка списка.
 * toString() – «конвертация» списка в строку.
 * Arrays.asList – преобразует массив в список.
 * containsAll(col) – проверяет включение всех элементов из col.
 * removeAll(col) – удаляет элементы, имеющиеся в col.
 * retainAll(col) – оставляет элементы, имеющиеся в col.
 * toArray() – конвертация списка в массив Object’ов.
 * toArray(type array) – конвертация списка в массив type.
 * List.copyOf(col) – возвращает копию списка на основе имеющегося.
 * List.of(item1, item2,...) – возвращает неизменяемый список.
 * 
 * Пример использования: фаил Ex004.java, Ex005.java, Ex006.java
 */
// --------------------------------------------------------------------------------------------------
/**
 * Итератор.
 * Ссылка на коллекцию типа Iterator: https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
 * Получение итератора с целью более гибкой работы с данными.
 * Интерфейс Iterator<E>. 
 * Итератор коллекцией. 
 * Iterator занимает место Enumeration в Java Collections Framework. 
 * Итераторы отличаются от перечислений: 
 * Итераторы позволяют вызывающей стороне удалять элементы из базовой коллекции 
 * во время итерации с четко определенной семантикой.
 * hasNext(), next(), remove()
 * ListIterator<E> - это итератор, для списков. 
 * Ссылка на коллекцию типа ListIterator<E>: https://docs.oracle.com/javase/7/docs/api/java/util/ListIterator.html
 * hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)
 * 
 * Пример использования: фаил Ex007.java
 */





