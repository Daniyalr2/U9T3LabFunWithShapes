import java.awt.Graphics;

public class Arc extends Shape
{

    private int initialAngle;
    private int arcAngle;

    public Arc()
    {
        super();
        initialAngle = 30;
        arcAngle = 70;
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(getColor());
        g.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), initialAngle, arcAngle);
    }



}
