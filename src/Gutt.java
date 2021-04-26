import java.awt.*;
import java.awt.geom.RoundRectangle2D;

public class Gutt extends GameObject {

    Handler handler;

    public Gutt(int x, int y, ID id, Handler handler) {
        super(x, y, id);
        this.handler = handler;
    }

    public void tick() {
        x += velX;
        y += velY;

        // movement
        if(handler.isUp()) velY = -5;
        else if(!handler.isDown()) velY = 0;

        if(handler.isDown()) velY = 5;
        else if(!handler.isUp()) velY = 0;

        if(handler.isRight()) velX = 5;
        else if(!handler.isRight()) velX = 0;

        if(handler.isLeft()) velX = -5;
        else if(!handler.isLeft()) velX = 0;

    }

    public void render(Graphics g) {
        g.setColor(Color.pink);
        g.fillRoundRect(x, y, 20, 20, 20, 20);
    }

    public Rectangle getBounds() {

        return new Rectangle(x, y, 20, 20);
    }
}
