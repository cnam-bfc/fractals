package net.cnam.fractals.gui.view.strates;

import net.cnam.fractals.Fractals;

import javax.swing.*;
import java.awt.*;

public class StratesComponent extends JComponent {
    private final Fractals fractals;

    public StratesComponent(Fractals fractals) {
        this.setLayout(null);

        this.fractals = fractals;

        this.setSize(fractals.getDimension3D());
    }

    @Override
    public void paint(Graphics g) {
        fractals.viewStrates((Graphics2D) g);

        super.paint(g);
    }
}
