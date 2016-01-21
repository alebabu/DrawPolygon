import java.awt.*;

public class Triangle extends Polygon{

    public Triangle(int x, int y) {
        super(x,y);
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(center.x, center.y-10, center.x-10, center.y+10);
        g.drawLine(center.x-10, center.y+10,
                center.x+10, center.y+10);
        g.drawLine(center.x+10, center.y+10, center.x, center.y-10);
    }
}
