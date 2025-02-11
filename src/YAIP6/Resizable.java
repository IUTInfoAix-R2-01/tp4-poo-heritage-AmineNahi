package YAIP6;

public class Resizable extends Circle implements ResizableInterface {
    
    public Resizable(double radius) {
        super(radius);  
    }

    @Override
    public void resize(double percentage) {
        double newRadius = getRadius() * (1 + percentage / 100);
        setRadius(newRadius);
    }

    @Override
    public String toString() {
        return "ResizableCircle [radius=" + getRadius() + "]";
    }
}
