package dev.angelsflyinhell.seater.window.graphics;

public class Sequence {
    private String baseName;
    private int frames;
    private int x;
    private int y;


    public Sequence(String baseName, int frames, int x, int y) {
        this.baseName = baseName;
        this.frames = frames;
        this.x = x;
        this.y = y;
    }

    public int getFrames() {
        return frames;
    }

    public String getBaseName() {
        return baseName;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
