public class Wall
{
    private int hight;
    private int width;

    private int x;
    private int y;


    public Wall(int x, int y, int hight, int width)
    {
        this.x = x;
        this.y = y;
        this.hight = hight;
        this.width = width;
    }

    /*
    public void collider()
    {

    }
    */

    public void drawWall()
    {
        StdDraw.filledRectangle(x, y, width, hight);
    }
    
}
