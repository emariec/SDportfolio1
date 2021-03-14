import static java.lang.Math.sqrt;
import java.util.Arrays;

// defining the variables associated to a shape

public class Shapes{
    String name;
    double area;
    double circumference;
    boolean isInside;
    int[] center = {0,0};
    int [] threePoint = {0,0,0,0,0,0};
    int [] fourPoint = {0,0,0,0,0,0,0,0};

//method for calculating the distance between two points. It takes two sets of x,y-coordinates as parametres. The distance is defined as the square root of the squared values of the distances between x and y respectively. 
    public double distTwoPoints(int x1, int y1, int x2, int y2){
        double distance;
        distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        return distance;
    }

    //Method that returns center. The method for calculating the center is defined in the classes of the individual shapes.
    public String getCenter(){
        return Arrays.toString(center);
    }
//Method that calculates the euclidian distance between two shapes. It takes another shape as parameter. It calls the distTwoPointsMethods, where the coordinates of two shapes centres used as parametres. 
    public double getEuclideanDist(Shapes a){

        double euclideanDist = distTwoPoints(this.center[0],this.center[1], a.center[0], a.center[1]);
        return euclideanDist;
    }

    //Method for printing the name, area, circumference and center of a shape. 
    public void printInfo(){

        System.out.println("Here is the info about this " + name);
        System.out.println("Area: " + area);
        System.out.println ("Circumference: " + circumference);
        System.out.println("Center point: " + getCenter() + "\n");
    }

}
