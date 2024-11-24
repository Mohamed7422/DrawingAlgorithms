import javax.swing.*;
import java.awt.*;

class DrawingPanel extends JPanel {
    private Circle circle;


    public DrawingPanel(Circle circle) {
        this.circle = circle;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        circle.draw(g);
    }
}