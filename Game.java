public class Game {
    private Platform platform;
    private Ball ball;
    private Block[] blocks;
    private int width, height;
    private boolean gameOver = false;
    
    public Game(Platform p, Ball b, int w, int h) {
        platform = p;
        ball = b;
        width = w;
        height = h;
    }

    public void gameLoop () {
        while (!gameOver) {
            platform.move();                
            ball.move();

            // Check for collisions
            

            // Check for win/lose conditions


            // Draw the game


            // Delay to match framerate (~60fps, i.e. 60/1000 ms delay)
            try {
                Thread.sleep(16); 
            } catch(InterruptedException e) {
                // Do nothing.
            }

        }
    }

    private void setInitialBlocks() {
        // Block block = new Block(0, 0, 0, 0);
    }
    
    public Platform getPlatform() {
        return platform;
    }
    
    public Ball getBall() {
        return ball;
    }

    public Block[] getBlocks() {
        return blocks;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
