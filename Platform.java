public class Platform {
    private int[] pos;
    private int[] vel;
    private int width, height;

    public Platform(int x, int y, int vx, int vy, int w, int h) {
        pos = new int[] {x, y};
        vel = new int[] {vx, vy};
        width = w;
        height = h;
    }

    public void move() {
        pos[0] += vel[0];
        pos[1] += vel[1];
    }

    public int[] getPos() {
        return pos;
    }

    public int[] getVel() {
        return vel;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
