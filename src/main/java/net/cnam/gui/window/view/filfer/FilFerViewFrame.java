package net.cnam.gui.window.view.filfer;

import net.cnam.App;
import net.cnam.Fractals;

import javax.swing.*;

@Deprecated
public class FilFerViewFrame extends JFrame {
    @Deprecated
    public FilFerViewFrame(App app, Fractals fractals) {
        FilFerViewPanel panel = new FilFerViewPanel(fractals);

        // Caractéristiques de la fenêtre
        this.setTitle("Fractals - Vue en fil de fer");
        this.setSize(1280, 720);
        this.setLocationRelativeTo(app.getMenuFrame());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Ajout du panel
        this.add(new JScrollPane(panel));
    }
}
