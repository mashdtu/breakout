public class GameSetup 
{
    private int width = 30;
    private int height = 7;
    private int[] pos = new int[] {135, 500};

    private int xSize = 7;
    private int ySize = 4; 
    private Block[][] nrOfTargets = new Block[xSize][ySize];

    public void drawBlocks()
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

   
}
