package OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units;

public class Mag extends Unit{ // Колдун
        
        protected int mana; // Мана.
        protected boolean magiсBook; // Магическая книга
    
        public Mag(String name) {
            super(name, 80, 1, 50, false, 12, 80, 5, 10, 30, 0, 0);
            this.mana = mana;
            this.magiсBook = magiсBook;
        }
    
        @Override
        public void step() {
            super.step();
        }
    
        @Override
        public String getInfo() {
            return "Я, маг! ";
        }
    
        public void custSpell(){
            System.out.println("Кастует заклинание"); // Заклинание
        }
}
