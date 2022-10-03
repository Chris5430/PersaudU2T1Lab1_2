public class Point {

    private int x;

    private int y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public Point(int x){
        this.x = x;
        this.y = x;
    }

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }



}
