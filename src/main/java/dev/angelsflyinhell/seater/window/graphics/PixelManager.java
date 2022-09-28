package dev.angelsflyinhell.seater.window.graphics;

import java.awt.*;

public class PixelManager {

    private final Color[][] pixels;
    public PixelManager(int resolution) {
        pixels = new Color[resolution][resolution];

        for (int i = 0; i < resolution; i++) {
            for (int j = 0; j < resolution; j++) {
                pixels[i][j] = Color.BLACK;
            }
        }
    }

    public void setPixel(int x, int y, Color newColor) {
        pixels[x][y] = newColor;
    }

    public Color getPixel(int x, int y) {
        return pixels[x][y];
    }
}
