class Main {
    public static void main(String[] args) {

        // Creates new shapes: a circle, a rectangle and a triangle:
        Circle cir1 = new Circle(10,30,30);
        Rectangle rect1 = new Rectangle(2,2,4,2,2,4,4,4);
        //It is only possible to create rightangled triangles.
        //the first point will be the right angled corner
        Triangle tri1 = new Triangle(1,1,4,4,7,1);

        // here the printInfo method prints info of the different shapes
        cir1.printInfo();
        rect1.printInfo();
        tri1.printInfo();

        // checks and prints the distance between the shapes cir1 and tr1
        System.out.println("Here is the Euclidean distance between the objects: " + cir1.getEuclideanDist(tri1));

        // checks and print wether a the given point is inside the shape 
        System.out.println("Is the point [5,2] inside cir1? " + cir1.hasPointInside(5,2));
        System.out.println("Is the point [3,2] inside tri1? " + tri1.hasPointInside(6,4));




    }

}
