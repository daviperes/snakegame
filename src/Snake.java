import java.awt.Rectangle;
import java.util.ArrayList;

public class Snake {

    private ArrayList<Rectangle> body;
    private int w = Game.width;
    private int h = Game.height;
    private int d = Game.dimension;

    public Snake(){
        body = new ArrayList<>();

        Rectangle rectangle = new Rectangle(d, d);
        rectangle.setLocation(w / 2 * d, h /2 * d);
        body.add(rectangle);

        rectangle = new Rectangle(d,d);
        rectangle.setLocation((w / 2 - 1) * d, (h / 2 - 1)  * d);
        body.add(rectangle);

        rectangle = new Rectangle(d,d);
        rectangle.setLocation((w / 2 - 2) * d, (h / 2 - 2)  * d);
        body.add(rectangle);

    }

    public ArrayList<Rectangle> getBody(){
        return this.body;
    }

    public void setBody(ArrayList<Rectangle> body){
        this.body = body;
    }

}
