import static java.lang.Math.sqrt;
import java.util.Arrays;

public class Shapes{
    String name;
    double area;
    double circumference;
    boolean isInside;
    int[] center = {0,0};
    int [] checkPoint = {0,0};
    int [] threePoint = {0,0,0,0,0,0};
    int [] fourPoint = {0,0,0,0,0,0,0,0};


    public double distTwoPoints(int x1, int y1, int x2, int y2){
        double distance;
        distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        return distance;
    }

    public String getCenter(){
        return Arrays.toString(center);
    }

    public double getEuclideanDist(Shapes a){

        double euclideanDist = distTwoPoints(this.center[0],this.center[1], a.center[0], a.center[1]);
        return euclideanDist;
    }

    public void printInfo(){

        System.out.println("Here is the info about this " + name);
        System.out.println("Area: " + area);
        System.out.println ("Circumference: " + circumference);
        System.out.println("Center point: " + getCenter() + "\n");
    }

}