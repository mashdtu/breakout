public class Breakout {
    public static void main(String[] args) {
        Game game = new Game();
        game.drawStartSetup();
        game.gameLoop();
    }
}