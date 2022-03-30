package net.cnam.window.surface;

import javax.swing.JFrame;

import net.cnam.App;

public class NewSurfaceFrame extends JFrame {
    private NewSurfacePanel panel;

    public NewSurfaceFrame(App app) {
        panel = new NewSurfacePanel(3, 100, 100, 62548759613L, 127);

        // Caractéristiques de la fenêtre
        this.setTitle("Fractals - Nouvelle surface");
        this.setSize(1280, 720);
        this.setLocationRelativeTo(app.getMainFrame());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Ajout du panel
        this.add(panel);
    }
}
