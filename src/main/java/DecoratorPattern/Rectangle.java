package DecoratorPattern;

/**
 * Created by AndrewKing on 10/22/2019.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}