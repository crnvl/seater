package dev.angelsflyinhell.seater.window;

import javax.swing.*;

public class DisplayEmbedder {
    public static void quickEmbed() {
        JFrame frame = new JFrame();
        int scale = 9;
        int resolution = 64;
        frame.setSize(resolution * scale, resolution * scale);
        frame.setTitle("Display Test | seater v0.0.1 alpha, SNAPSHOT 2209a");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Display display = new Display(resolution, scale);
        frame.add(display);
        frame.setVisible(true);
    }
}
