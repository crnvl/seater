package dev.angelsflyinhell.seater.window.graphics;

import java.util.HashMap;

public class SequenceHandler {
    private static HashMap<String, Sequence> animations = new HashMap<>();
    static int frameCount = 0;

    public static void updateAnimations(PixelManager pixelManager) {
        for (int i = 0; i < animations.size(); i++) {
            Sequence seq = animations.get(animations.keySet().toArray()[i]);
            SpriteUtil.renderToDisplay(pixelManager, seq.getBaseName() + "_" + (frameCount % seq.getFrames() + 1), seq.getX(), seq.getY());
        }
        frameCount++;
    }

    public static void addAnimation(String baseFile, int frames, int x, int y) {
        animations.put(baseFile, new Sequence(baseFile, frames, x, y));
    }
}
