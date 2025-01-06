public class Breakout {
    public static void main(String[] args) {
        Platform platform = new Platform(0, 0, 0, 0, 0, 0);
        Ball ball = new Ball(0, 0, 0, 0, 0);
        Game game = new Game(platform, ball, 800, 600);
        game.gameLoop();
    }
}