package OOP_JAVA.HW_Program.Hero_game_v1.src.main.Units;

public class Vector2D {
    protected int posX;
    protected int posY;

    public Vector2D(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    protected Double getDistance(Vector2D oponent){
        return Math.sqrt(Math.pow(posX - oponent.posX,2) + Math.pow(posY - oponent.posY,2));
    }

}
