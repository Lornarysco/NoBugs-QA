package Point;

public class Point implements Movable{

    private int x;
    private int y;

    public void setX(int xCore){
         this.x = xCore;
    }

    public void setY(int yCore){
        this.y = yCore;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    @Override
    public void moveUp(int yMoveUp){
        setY(this.y += yMoveUp);
    }

    @Override
    public void moveDown(int yMoveDown){
        setY(this.y -= yMoveDown);
    }

    @Override
    public void moveLeft(int xMoveleft){
        setX((this.x -= xMoveleft));

    }

    @Override
    public void moveRight(int xMoveRight){
        setX((this.x += xMoveRight));
    }

    @Override
    public void pointCore(){
        System.out.println("\nCoordination: (" + getX() + "," + getY() + ")" + '\n');

    }

}
