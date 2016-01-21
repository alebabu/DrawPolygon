import java.awt.*;

public abstract class Polygon{

    protected Point center;

    private Polygon(Point center) {
        this.center = center;
    }

    public Polygon(int x, int y) {
        this(new Point(x,y));
    }

    public abstract void paint(Graphics g);
}
