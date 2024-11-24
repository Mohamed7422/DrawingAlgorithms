import java.awt.*;

public class Circle {


   private int xc, yc, radius;
    public Circle(int xc, int yc, int radius){
       this.xc = xc;
       this.yc = yc;
       this.radius = radius;
    }


    public void draw(Graphics g){

        int x = 0, y = radius;
        int p0 = 1-radius;
        plotCirclePoints(g,xc,yc,x,y);

        while (x < y) {
            x++;
            if (p0 < 0) {
                p0 += 2 * x + 1;
            } else {
                y--;
                p0 += 2 * (x - y) + 1;
            }
            plotCirclePoints(g, xc, yc, x, y);
        }
    }

    private void plotCirclePoints(Graphics g, int xc, int yc, int x, int y) {
        g.fillOval(xc + x, yc - y, 2, 2);

        g.fillOval(xc + y, yc - x, 2, 2);


        g.fillOval(xc + x, yc + y, 2, 2);
        g.fillOval(xc + y, yc + x, 2, 2);

        g.fillOval(xc - x, yc - y, 2, 2);
        g.fillOval(xc - y, yc - x, 2, 2);

        g.fillOval(xc - x, yc + y, 2, 2);
        g.fillOval(xc - y, yc + x, 2, 2);
    }

}
