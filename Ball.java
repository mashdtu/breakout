public class Ball {
    private int[] pos;
    private int[] vel;
    private int radius;

    public Ball(int x, int y, int vx, int vy, int r) {
        pos = new int[] {x, y};
        vel = new int[] {vx, vy};
        radius = r;
    }

    public void move() {
        pos[0] += vel[0];
        pos[1] += vel[1];
    }

    public boolean outOfBounds() {
        return pos[1] < 0;
    }

    public void setPos(int x, int y) {
        pos[0] = x;
        pos[1] = y;
    }

    public void setVel(int vx, int vy) {
        vel[0] = vx;
        vel[1] = vy;
    }

    public int[] getPos() {
        return pos;
    }

    public int[] getVel() {
        return vel;
    }

    public int getRadius() {
        return radius;
    }
}
