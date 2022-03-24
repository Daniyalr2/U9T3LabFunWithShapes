import java.awt.Graphics;

/**
 * Class Rectangle:  inherits from Shape and draws a rectangle
 * @author Barb Ericson
 */
public class Line extends Shape
{
    /** Constructor */
    public Line()
    {
        super();
    }


    @Override
    public void draw(Graphics g)
    {

        g.setColor(getColor());


        g.drawLine(getP1().x, getP1().y, getP2().x, getP2().y); // the getter methods here are INHERITED FROM SHAPE!
    }
}