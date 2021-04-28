public class Triangle extends Shapes {
    double side1;
    double side2;
    double side3;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
        // when a new triangle is created the differnt variable attributes are set. 
        this.name = "triangle";

        this.threePoint[0] = x1;
        this.threePoint[1] = y1;
        this.threePoint[2] = x2;
        this.threePoint[3] = y2;
        this.threePoint[4] = x3;
        this.threePoint[5] = y3;

        //Defines the sides of a triangle as the distance between the points. 
        this.side1 = distTwoPoints(threePoint[0],threePoint[1], threePoint[2],threePoint[3]);
        this.side2 = distTwoPoints(threePoint[0],threePoint[1],threePoint[4],threePoint[5]);
        this.side3 = distTwoPoints(threePoint[2],threePoint[3],threePoint[4],threePoint[5]);

        //The coordinates of the center are calculated using the following formula
        this.center[0] = (x1 + x2 + x3)/3;
        this.center[1] = (y1 + y2 + y3)/3;

        this.circumference = getCircumference();
        this.area = getArea(x1,y1,x2,y2,x3,y3);
    }
    // calculates the area of the traingle using the following formula
    public double getArea(double x1, double y1, double x2, double y2, double x3, double y3){

        // we multiply by -1 because the area will always be a negative value.
        this.area = ((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2)*-1;
        return area;
    }
    // calculates the circumference of the triangle using the side lenghts of the triangle
    public double getCircumference(){
        this.circumference = side1+side2+side3;
        return circumference;
    }
    // method for finding out if a point is inside the triangle
    public boolean hasPointInside(int x, int y) {

        double A= area;
        int x1 = threePoint[0];
        int y1 = threePoint[1];
        int x2 = threePoint[2];
        int y2 = threePoint[3];
        int x3 = threePoint[4];
        int y3 = threePoint[5];

        //we calculate the area from the point to the vertices in the triangle
        //getting the area of three smaller triangles
        double A1 = getArea(x, y, x1, y1, x2, y2);
        double A2 = getArea( x, y, x2, y2, x3, y3);
        double A3 = getArea(x, y, x1, y1,x3, y3);

        //area can't be negative
        if (A1 <0){
            A1= A1*-1;
        }
        if (A2 <0){
            A2= A2*-1;
        }

        if (A3 <0){
            A3= A3*-1;
        }

//if the area of the smaller triangles is equal to the area of the triangle,
// the point is inside
        if (A1 + A2 + A3 == A) {

            isInside = true;}
            return isInside;

        }

}
