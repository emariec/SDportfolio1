class Main {
    public static void main(String[] args) {


        Circle cir1 = new Circle(10,30,30);

        Rectangle rect1 = new Rectangle(2,2,4,2,2,4,4,4);

        //trekant første punkt i array er punktet for den rette vinkel i trekanten
        Triangle tri1 = new Triangle(2,2,2,6,7,2);

        cir1.printInfo();
        rect1.printInfo();
        tri1.printInfo();

        System.out.println("Here is the Euclidean distance between the objects: " + cir1.getEuclideanDist(tri1));

        System.out.println("Is the point [5,2] inside cir1? " + cir1.hasPointInside(5,2));
        System.out.println("Is the point [5,2] inside tri1? " + tri1.hasPointInside(5,2));

    }

}