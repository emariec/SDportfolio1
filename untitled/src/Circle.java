import java.util.Arrays;
public class Circle extends Shapes {
    int radius;



    public Circle(int x, int y, int r){
        this.name = "circle";

        this.radius = r;
        this.center[0] = x;
        this.center[1] = y;

        this.circumference = getCircumference();
        this.area = getArea();

    }
    // get area by using math.PI
    public double getArea(){
        this.area = Math.PI * (radius * radius);
        return area;

    }
    
    public double getCircumference(){
        this.circumference = radius*2*Math.PI;
        return circumference;
    }

    public boolean hasPointInside(int x, int y){
        double distToCenter = distTwoPoints(x,y, center[0],center[1]);

        if (distToCenter > radius) {
            isInside = false;
            return isInside;
        }
        else {
            isInside = true;
            return isInside;
        }

    }

}
