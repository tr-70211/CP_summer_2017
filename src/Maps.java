import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Square;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pantho on 2017-04-19.
 */
public class Maps {
    public static void main(String[] args) {
        Map<String, Shape> shapemap = new HashMap<>();
        shapemap.put("Circle 1", new Circle(4));
        shapemap.put("Rectangle", new Rectangle(2,5));
        shapemap.put("Square", new Square(6));

        System.out.println("Circle: "+ shapemap.get("Circle 1"));

        System.out.println(        );

        for (String s : shapemap.keySet()) {
            System.out.println(s+" = "+shapemap.get(s));
        }

    }

}
