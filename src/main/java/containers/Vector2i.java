package containers;

import java.util.StringJoiner;

//Simple 2D vector of integer values.
public class Vector2i
{
    public Integer x,y;
    public Vector2i()
    {
        x = 0;
        y = 0;
    }
    public Vector2i(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString()
    {
        return '[' + x.toString() + ", " + y.toString() + ']';
    }
}
