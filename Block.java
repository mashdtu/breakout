public class Block {
    private double[] pos;
    private double width, height;

    //0.045, 0.016
    
    public Block(double x, double y, double w, double h) {
        pos = new double[] {x, y};
        width = w;
        height = h;
    }

    public double[] getPos() {
        return pos;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}