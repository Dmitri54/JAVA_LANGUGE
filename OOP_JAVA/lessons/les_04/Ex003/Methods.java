package OOP_JAVA.lessons.les_04.Ex003;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Methods {
    // public static Integer getElementFromIntegerCollection(List<Integer> col, int index) {
    //     return col.get(index);
    // }

    // public static String getElementFromStringCollection(List<String> col, int index) {
    //     return col.get(index);
    // }

    // public static Double getElementFromDoubleCollection(List<Double> col, int index) {
    //     return col.get(index);
    // }

    // #region 
// Обобщение
    public static <U> U getElementFromUCollection(List<U> col, int index) {
        return col.get(index);
    }


    // #endregion

    //#region
// Если использовать несколько общений типа.
    public static <T1, T2> T2 put(T1 arg1, T2 arg2) {
        // Map<Integer,String> hm = new HashMap<>(); // Это пример, т.е. такие конструкции использовал в Map.
        // hm.put(key, value)
        return arg2;
    }

    //#endregion
}