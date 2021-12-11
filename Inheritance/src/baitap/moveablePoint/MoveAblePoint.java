package baitap.moveablePoint;

public class MoveAblePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float x, float y) {
        this.xSpeed = x;
        this.ySpeed = y;
    }

    public float[] getSpeed() {
        float[] xy = new float[2];
        xy[0] = this.xSpeed;
        xy[1] = this.ySpeed;
        return xy;
    }

    public MoveAblePoint move() {
        float x = super.getX();
        float y = super.getY();
        x += xSpeed;
        y += ySpeed;
        super.setX(x);
        super.setY(y);
        return this;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Speed(x,y) = " + "(" +
                getxSpeed() + ", " +
                getySpeed() + ")";
    }
}
