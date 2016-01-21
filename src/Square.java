import java.awt.*;

public class Square extends Polygon{

    public Square(int x, int y) {
        super(x,y);
    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(center.x -10, center.y -10, 20, 20);
    }
}
