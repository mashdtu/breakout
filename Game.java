public class Game {
    private Platform platform;
    private Ball ball;
    private Block[][] blocks;
    private Wall[] wall;
    private int width, height;
    private boolean gameOver = false;

    private GameSetup gameSetup = new GameSetup();

    /* 
    public Game(Platform p, Ball b, int w, int h) {
        platform = p;
        ball = b;
        width = w;
        height = h;
    }
    */

    public void gameLoop () {
        while (!gameOver) {
            platform.move();                
            ball.move();

            // Check for collisions
            

            // Check for win/lose conditions
            gameOver = ball.outOfBounds() ? true : gameOver;
            gameOver = blocks.length < 1 ? true : gameOver;


            // Draw the game


            // Delay to match framerate (~60fps, i.e. 1000/60 ms delay)
            try {
                Thread.sleep(16); 
            } catch(InterruptedException e) {
                // Do nothing.
            }

        }
    }

    public void drawStartSetup()
    {
        gameSetup.drawStartGame();
        platform = gameSetup.getPlatform();
        wall = gameSetup.getWalls();
        blocks = gameSetup.getBlocks();
        ball = gameSetup.getBall();
    }

    private void setInitialBlocks() {
        //
    }
    
    public Platform getPlatform() {
        return platform;
    }
    
    public Ball getBall() {
        return ball;
    }

    public Block[][] getBlocks() {
        return blocks;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
