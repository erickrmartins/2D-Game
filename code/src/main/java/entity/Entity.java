package entity;

import java.awt.*;

public abstract class Entity {
    public int x, y;
    public int speed;

    public abstract void setDefault();
    public abstract void update();
    public abstract void draw(Graphics2D g2d);
}
