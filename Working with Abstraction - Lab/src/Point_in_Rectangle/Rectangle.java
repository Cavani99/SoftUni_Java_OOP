package Point_in_Rectangle;

public class Rectangle {
    private int bottomLeftX;
    private int bottomLeftY;
    private int topRightX;
    private int topRightY;

    public boolean contains(Point point){

        boolean inX = point.getX() >= bottomLeftX && point.getX() <= topRightX;
        boolean inY = point.getY() >= bottomLeftY && point.getY() <=topRightY;

        if(inX && inY)
            return true;

        return false;
    }

    public Rectangle(int bottomLeftX, int bottomLeftY, int topRightX, int topRightY){
        this.bottomLeftX = bottomLeftX;
        this.bottomLeftY = bottomLeftY;
        this.topRightX = topRightX;
        this.topRightY = topRightY;
    }

}
