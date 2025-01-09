import java.awt.event.KeyEvent;

public class Platform {
    public static void main(String[] args) {
        // Platformens dimensioner
        double platformX = 0.5;
        double platformY = 0.1;
        double platformBredde = 0.1;
        double platformHoejde = 0.025;
        double speed = 0.02;

        // Canvas størrelse
        StdDraw.setCanvasSize(800, 600);
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);

        while (true) {
            // Opdater skærmen, for at lægge det nye frame på
            StdDraw.clear(StdDraw.BLACK);

            // Checker om højre og venstre knapperne er trykket, for at få platformen til at flytte sig
            if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) {
                platformX -= speed;
            }
            if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) {
                platformX += speed;
            }

            // Sørger for at platformen ikke gå ud af bounds
            if (platformX - platformBredde / 2 < 0) {
                platformX = platformBredde / 2;
            }
            if (platformX + platformBredde / 2 > 1) {
                platformX = 1 - platformBredde / 2;
            }

            // Konstruktionen af platformen
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledRectangle(platformX, platformY, platformBredde / 2, platformHoejde / 2);

            // Opdatere framesne, så det ikke lagger
            StdDraw.show(10);
        }
    }
}