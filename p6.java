class Circle {
    // data member
    private double radius;
    static int numOfObject = -1;

    // static initializer block
    static {
        numOfObject = 0;
    }

    // default constructor
    public Circle() {
        this.numOfObject++;
    }

    // parameterized constructor
    public Circle(double r) {
        this();
        this.setRadius(r);
    }

    // copy constructor
    public Circle(Circle obj) {
        this();
        this.setRadius(obj.radius);
    }

    public double getRadius() {
        return (this.radius);
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    // method to calculate area of Circle
    public void getArea() {
        System.out.println("Radius : " + this.radius);
        System.out.println("Area   : " + Math.PI * (this.getRadius() * this.getRadius()));
    }

    // count number of objects created using static field
    public static void getNumOfObject() {
        System.out.println("Number of object created : " + numOfObject);
    }
}

class p6 {
    public static void main(String args[]) {
        System.out.println("\n---------------------------------------\n");
        Circle first = new Circle();
        first.setRadius(1.0);
        first.getArea();

        System.out.println("\n---------------------------------------\n");
        Circle second = new Circle(first);
        second.setRadius(3.5);
        second.getArea();

        System.out.println("\n---------------------------------------\n");
        Circle second1 = new Circle(2.0);
        second1.getArea();

        System.out.println("\n---------------------------------------\n");
        Circle.getNumOfObject();
    }
}