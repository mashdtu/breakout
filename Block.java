public class Block {
    private int[] pos;
    private int width, height;

    
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

    private void drawBlock() {
        StdDraw.filledRectangle(pos[0], pos[1], width, height);
    }
}