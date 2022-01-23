import processing.core.PApplet;

public class FourBallsSketch extends PApplet {
    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    public static final int DIAMETER = 20;

    private Ball firstBall;
    private Ball secondBall;
    private Ball thirdBall;
    private Ball fourthBall;

    public static void main(String[] args) {
        PApplet.main("FourBallsSketch", args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        setupFirstBall();
        setupSecondBall();
        setupThirdBall();
        setupFourthBall();
    }

    private void setupFourthBall() {
        int fourthBallYPosition = HEIGHT * 4 / 5;
        int fourthBallSpeed = 4;
        fourthBall = new Ball(fourthBallYPosition, fourthBallSpeed);
    }

    private void setupThirdBall() {
        int thirdBallYPosition = HEIGHT * 3 / 5;
        int thirdBallSpeed = 3;
        thirdBall = new Ball(thirdBallYPosition, thirdBallSpeed);
    }

    private void setupSecondBall() {
        int secondBallYPosition = HEIGHT * 2 / 5;
        int secondBallSpeed = 2;
        secondBall = new Ball(secondBallYPosition, secondBallSpeed);
    }

    private void setupFirstBall() {
        int firstBallYPosition = HEIGHT / 5;
        int firstBallSpeed = 1;
        firstBall = new Ball(firstBallYPosition, firstBallSpeed);
    }

    @Override
    public void draw() {
        moveBall(firstBall);
        moveBall(secondBall);
        moveBall(thirdBall);
        moveBall(fourthBall);
    }

    public void moveBall(Ball ball){
        int yPosition = ball.getYPosition();
        int xPosition = ball.getXPosition();
        drawCircle(xPosition, yPosition);
        ball.moveRight();
    }

    private void drawCircle(int xPosition, int yPosition) {
        ellipse(xPosition, yPosition, DIAMETER, DIAMETER);
    }

}
