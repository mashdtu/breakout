public class Block {
    private int[] pos;
    private int width, height;

    //0.045, 0.016
    
    public Block(int x, int y, int w, int h) {
        pos = new int[] {x, y};
        width = w;
        height = h;
    }

    public int[] getPos() {
        return pos;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}