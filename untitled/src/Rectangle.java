import java.util.Arrays;

public class Rectangle extends Shapes{
    double side1;
    double side2;


    public Rectangle (int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){
        this.name = "rectangle";

        this.fourPoint[0] = x1;
        this.fourPoint[1] = y1;
        this.fourPoint[2] = x2;
        this.fourPoint[3] = y2;
        this.fourPoint[4] = x3;
        this.fourPoint[5] = y3;
        this.fourPoint[6] = x4;
        this.fourPoint[7] = y4;

        this.side1 = distTwoPoints(fourPoint[0],fourPoint[1], fourPoint[2],fourPoint[3]);
        this.side2 = distTwoPoints(fourPoint[0],fourPoint[1],fourPoint[4],fourPoint[5]);

        this.center[0] = (fourPoint[0]+fourPoint[6])/2;
        this.center[1] = (fourPoint[1]+fourPoint[7])/2;

        this.circumference = getCircumference();
        this.area = getArea();
    }

    public double getArea(){
        this.area= side1*side2;
        return area;
    }

    public double getCircumference(){
        this.circumference = side1*2 + side2*2;
        return circumference;
    }

    public boolean hasPointInside(int x, int y){

        if (x < fourPoint[0] || x > fourPoint[2] && y < fourPoint[1] || y > fourPoint[5]){
            isInside = false;
            return isInside;
        }
        else {
            isInside = true;
            return isInside;
        }
    }
}