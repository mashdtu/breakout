package Breakout;

import java.awt.event.KeyEvent;

public class Platform {
    private double platformX;
    private double platformY;
    private double platformBredde;
    private double platformHoejde;
    private double speed;

    // Konstruktør for platformens dimensioner
    public Platform(double platformX, double platformY, double platformBredde, double platformHoejde, double speed) {
        this.platformX = platformX;
        this.platformY = platformY;
        this.platformBredde = platformBredde;
        this.platformHoejde = platformHoejde;
        this.speed = speed;

        // Canvas størrelse
        StdDraw.setCanvasSize(800, 600);
        StdDraw.setXscale(0, 1);
        StdDraw.setYscale(0, 1);
    }

    // Metode til at starte spillet
    public void spil() {
        while (true) {
            frame();
            platform();
            // Opdatere framesne, så det ikke lagger
            StdDraw.show(10); 
        }
    }


    private void frame() {
        // Checker om højre og venstre knapperne er trykket, for at få platformen til at flytte sig
        if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) {
            platformX -= speed;
        }
        if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) {
            platformX += speed;
        }

        // Sørger for at platformen ikke går ud af bounds
        if (platformX - platformBredde / 2 < 0) {
            platformX = platformBredde / 2;
        }
        if (platformX + platformBredde / 2 > 1) {
            platformX = 1 - platformBredde / 2;
    }
}

    // Konstruktionen af platformen
    private void platform() {
        StdDraw.clear(StdDraw.BLACK);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.filledRectangle(platformX, platformY, platformBredde / 2, platformHoejde / 2);
    }

    public static void main(String[] args) {
        Platform platform = new Platform(0.5, 0.1, 0.1, 0.025, 0.02);
        platform.spil();
    }
}