/**
 * Created by DmitryZ on 02.11.2015.
 */
public class Bullet {

    public final int SPEED = 5;
    private int x;
    private int y;
    private int direction;

    public Bullet(int x, int y, int direction){
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public int getDirection() {
        return direction;
    }


    public int updateX(int x){
        return this.x + x;
    }

    public int updateY(int y){
        return this.y + y;
    }

    public void destroy(){
        x = -100;
        y = -100;
    }

}
