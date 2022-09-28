package dev.angelsflyinhell.seater.window.graphics;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class SpriteUtil {

    public static HashMap<String, BufferedImage> sprites;

    public static void preload(String game) {
        sprites = new HashMap<>();

        File gameDir = new File("./games/" + game + "/");
        for (int i = 0; i < gameDir.listFiles().length; i++) {
            try {
                BufferedImage asset = ImageIO.read(gameDir.listFiles()[i]);
                sprites.put(gameDir.listFiles()[i].getName().replace(".png", ""), asset);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Preloaded " + sprites.size() + " assets.");
    }

    public static void renderToDisplay(PixelManager pixelManager, String spriteName, int x, int y) {
        BufferedImage sprite = sprites.get(spriteName);
        for (int i = 0; i < sprite.getWidth(); i++) {
            for (int j = 0; j < sprite.getHeight(); j++) {
                int rgb = sprite.getRGB(i, j);
                int red = (rgb & 0x00ff0000) >> 16;
                int green = (rgb & 0x0000ff00) >> 8;
                int blue = rgb & 0x000000ff;
                pixelManager.setPixel(i + x, j + y, new Color(red, green, blue, (rgb & 0xff000000) >>> 24));
            }
        }
    }
}
