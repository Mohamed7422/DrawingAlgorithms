import javax.swing.*;

public class CircleDrawingApp {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Circle Drawing");


        Circle circle = new Circle(200, 200, 100);


        DrawingPanel panel = new DrawingPanel(circle);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(panel);
        frame.setVisible(true);
    }

}