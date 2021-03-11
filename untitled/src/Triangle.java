public class Triangle extends Shapes {
    double side1;
    double side2;
    double side3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.name = "triangle";

        this.threePoint[0] = x1;
        this.threePoint[1] = y1;
        this.threePoint[2] = x2;
        this.threePoint[3] = y2;
        this.threePoint[4] = x3;
        this.threePoint[5] = y3;

        this.side1 = distTwoPoints(threePoint[0],threePoint[1], threePoint[2],threePoint[3]);
        this.side2 = distTwoPoints(threePoint[0],threePoint[1],threePoint[4],threePoint[5]);
        this.side3 = distTwoPoints(threePoint[2],threePoint[3],threePoint[4],threePoint[5]);

        this.center[0] = x1;
        this.center[1] = y1;

        this.circumference = getCircumference();
        this.area = getArea();
    }

    public double getArea(){
        this.area = side1 * side2 * 0.5;
        return area;
    }

    public double getCircumference(){
        this.circumference = side1+side2+side3;
        return circumference;
    }

    public String hasPointInside(int x, int y){
        isInside = false;
        return "it is not possible to check this...";
    }


}