package OOP_JAVA.lessons.les_02.Ex004;

public class Program {
    public static void main(String[] args) {
        // Иерархия вызова конструкторов
        System.out.println("\nDwarf dw1 = new Dwarf()");
        Dwarf dw1 = new Dwarf();
        // System.out.println(dw1); // OOP_JAVA.lessons.les_02.Ex004.Dwarf@7a81197d

        System.out.println("\nDruid dw2 = new Dwarf();");
        Druid dw2 = new Dwarf();

        System.out.println("\nBaseHero dw3 = new Dwarf();");
        BaseHero dw3 = new Dwarf();
    }    
}
