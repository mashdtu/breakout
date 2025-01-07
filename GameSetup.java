public class GameSetup 
{
    private int width = 30;
    private int height = 7;
    private int[] pos = new int[] {135, 500};

    private int xSize = 7;
    private int ySize = 4; 

    //objects
    private Block[][] nrOfTargets = new Block[xSize][ySize];
    private Platform platform;
    private Wall[] wall = new Wall[3];

    public void drawStartGame()
    {
        drawBlocks();
        drawWalls();
        drawPlatform();
    }

    private void drawBlocks()
    {
        for(int i = 0; i < ySize; i++)
        {
            for(int j = 0; j < xSize; j++)
            {
                nrOfTargets[j][i] = new Block(pos[0],pos[1],width,height);
                nrOfTargets[j][i].drawBlock();
                pos[0] = pos[0] + i * 80;
                pos[1] = pos[1] + i * 35;
            }
        }
    }

    private void drawWalls()
    {
        wall[0] = new Wall(90, 350, 5, 200);
        wall[1] = new Wall(740, 350, 5, 200);
        wall[2] = new Wall(410, 545, 325, 5);

        //StdDraw.filledRectangle(90, 350, 5, 200);
        //StdDraw.filledRectangle(740, 350, 5, 200);
        //StdDraw.filledRectangle(410, 545, 325, 5);
    }

    private void drawPlatform()
    {
        //x, y, w, h, speed
        //platform = new Platform(400, 150, 50, 5, 0.02);

        //platform.draw();
    }

   
}
