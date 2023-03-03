package OOP_JAVA.lessons.les_04.Ex002;

import java.util.UUID;

public class Program {
    public static void main(String[] args) {
// Создаю экземпляр класса Worker.
        Worker w = new Worker(28, "firstName", "lastName", 20, 22); 

        // #region ParameterizedWorker

        ParameterizedWorker<Integer> w1 = new ParameterizedWorker<Integer>( 
// При создании экземпляра ParameterizedWorker указываю тип <Integer>, тогда 
                1990, // индитификатор буду указывать число. 
                "firstName",
                "lastName",
                20,
                22);
        System.out.println(w1.getId());

        String uid = UUID.randomUUID().toString();
        ParameterizedWorker<String> w2 = new ParameterizedWorker<>( 
// Тут тип индитификатора указал <String> 
                uid,
                "firstName",
                "lastName",
                20,
                22);
        System.out.println(w2.getId());

        // #endregion

        // #region MultiParameterized
        // MultiParameterized<Integer, Double, String> mp1 = new MultiParameterized<>(
        //         1, 2.0, "3.0");
        // System.out.println(mp1);

        // MultiParameterized<String, String, String> mp2 = new MultiParameterized<>(
        //         "1", "2.0", "3.0");
        // System.out.println(mp2);

        // #endregion

    }
}
