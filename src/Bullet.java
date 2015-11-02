/**
 * Created by DmitryZ on 02.11.2015.
 */
public class Bullet {

    public final int SPEED = 10;
    private int x;
    private int y;
    private int direction;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private void setX(int x) {
        this.x = x;
    }

    private void setY(int y) {
        this.y = y;
    }

    public int getDirection() {
        return direction;
    }

    private void setDirection(int direction) {
        this.direction = direction;
    }

    public int updateX(int x){
        return getX() + x;
    }

    public int updateY(int y){
        return getY() + y;
    }

    public void destroy(){
        setX(-100);
        setY(-100);
    }

}
