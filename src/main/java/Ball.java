public class Ball{
    private final int yPosition;
    private final int speed;
    private int xPosition = 0;

    public Ball(int yPosition, int speed) {
        this.yPosition = yPosition;
        this.speed = speed;
    }

    public int getYPosition() {
        return yPosition;
    }

    public int getXPosition() {
        return xPosition;
    }

    public void moveRight(){
        xPosition += speed;
    }
}
