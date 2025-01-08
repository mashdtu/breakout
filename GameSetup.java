public class GameSetup 
{
    private int width = 30;
    private int height = 7;
    private int[] pos = new int[] {152, 500};

    private int xSize = 9;
    private int ySize = 4; 

    //objects
    private Block[][] nrOfTargets = new Block[xSize][ySize];
    private Platform platform;
    private Wall[] wall = new Wall[3];

    public void drawStartGame()
    {
        drawBackgound();
        drawBlocks();
        drawWalls();
        drawPlatform();
    }

    private void drawBackgound()
    {
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledRectangle(400, 300, 400, 300);
    }

    private void drawBlocks()
    {
        StdDraw.setPenColor(StdDraw.BLUE);
        for(int i = 0; i < ySize; i++)
        {
            for(int j = 0; j < xSize; j++)
            {
                nrOfTargets[j][i] = new Block(pos[0] + j * 62 , pos[1] - i * 35 , width , height);
                nrOfTargets[j][i].drawBlock();
            }
        }
    }

    private void drawWalls()
    {  
        StdDraw.setPenColor(StdDraw.BLACK);
        wall[0] = new Wall(100, 350, 5, 200);
        wall[1] = new Wall(700, 350, 5, 200);
        wall[2] = new Wall(400, 545, 300, 5);

        for(int i = 0; i < wall.length; i++)
        {
            wall[i].drawWall();
        }

        //StdDraw.filledRectangle(90, 350, 5, 200);
        //StdDraw.filledRectangle(740, 350, 5, 200);
        //StdDraw.filledRectangle(410, 545, 325, 5);
    }

    private void drawPlatform()
    {
        StdDraw.setPenColor(StdDraw.CYAN);
        //x, y, w, h, speed
        //platform = new Platform(400, 150, 50, 5, 0.02);

        //platform.draw();
    }

    public Block[][] getBlocks()
    {
        return nrOfTargets;
    }

    public Wall[] getWalls()
    {
        return wall;
    }

    public Platform gPlatform()
    {
        return platform;
    }
   
}
