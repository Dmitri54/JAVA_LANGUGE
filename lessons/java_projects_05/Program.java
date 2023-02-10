// Урок 5. Хранение и обработка данных ч2: множество коллекций Map
/**
 * План занятия:
 * 1. Обзор функционала Map
 * 2. Зачем нужен HashMap
 * 3. HashMap и работа с ним
 * 4. Обзор функционала TreeMap
 * 5. Обзор функционала LinkedHashMap
 * 6. Примеры
 */
// -----------------------------------------------------------------------------------------------
/**
 * Иерархия коллекций Map:
 * 
 *                  Map
 *              /     |    \
 *             /      |     \
 *           |/      \|/     \|
 *       HashMap  SortedMap HashTable
 *         |          |
 *        \|/        \|/
 * LinkedHashMap  NavigableMap
 *                    |
 *                   \|/
 *                 TreeMap
 */
// ----------------------------------------------------------------------------------------------------
/**
 * HashMap - коллекция
 * 
 * Map – это множество коллекций, работающих с данными по принципу <Ключ / Значение>.
 * Ключевые особенности:
 * ● ускоренная обработка данных;
 * ● порядок добавления не запоминается; 
 * ● допускаются только уникальные ключи, значения могут повторяться;
 * ● помните про null значения*;
 * ● ускоренная обработка данных;
 * ● порядок добавления не запоминается.
 * 
 * В HashMap элементы располагаются как угодно и могут менять свое положение.
 * Пример: Ex001_HashMap.java
 * 
 * HashMap методы:
 * put(K,V) – добавить пару если или изменить значение, если ключ имеется.
 * putIfAbsent(K,V) – произвести добавление если ключ не найден.
 * get(K) - получение значения по указанному ключу.
 * remove(K) – удаляет пару по указанному ключу.
 * containsValue(V) – проверка наличия значения.
 * containsKey(V) – проверка наличия ключа.
 * keySet() – возвращает множество ключей.
 * values() – возвращает набор значений.
 * 
 * Цикл for.
 * Пример: Ex002_HashMapEntry.java
 * 
 * Если при решении задачи примерно понятно, какое количество элементов будет задействовано, для HashMap,
 * то можно сразу определить
 * Пример: Ex003_HashMapBoost.java
 * 
 * HashMap. Любознательным:
 * ● Хэш-функции и хэш-таблицы
 * ● Прямое связывание (хэширование с цепочками)
 * ● Хэширование с открытой адресацией
 * ● Теория графов:
 * ● деревья построенные на списках
 * ● бинарные деревья
 * ● сбалансированные деревья
 * ● *алгоритм балансировки дерева
 * ● ** красно-черные деревья, деревья поиска
 */
// -------------------------------------------------------------------------------------------
/**
 * TreeMap - коллекция.
 * Методы:
 * put(K,V) – добавить пару если или изменить значение, если ключ имеется.
 * get(K) - получение значения по указанному ключу.
 * remove(K) – удаляет пару по указанному ключу.
 * descendingKeySet(V) - возвращает множество ключей.
 * descendingMap() – возвращает набор значений.
 * tailMap() - покажет значения больше чем().
 * headMap() - покажет значения меньше чем().
 * lastEntry() - покажет последний записанный элемент.
 * firstEntry() - покажет первый записанный элемент.
 * 
 * В основе данной коллекции лежат красно-чёрное деревья.
 * Позволяют быстрее искать, но могут возникнуть «заминки» при добавлении.
 * 
 * Пример: Ex004_TreeMap.java
 */
// --------------------------------------------------------------------------------------------------
/**
 * LinkedHashMap - коллекция.
 * “Старший брат” коллекции HashMap, который всё помнит…
 * Помнит порядок добавления элементов ➜ более медлительный.
 * 
 * Пример: Ex005_LinkedHashMap.java
 */

/**
 * HashTable - коллекция.
 * «Устаревший брат» коллекции HashMap, который не знает про null.
 * 
 * Пример: Ex006_HashTable.java
 */

// Переопределил equals – переопредели hashCode