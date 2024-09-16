public class Shape {

    double sideLength;

    public Shape(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getPerimiter() {
        System.out.println("What is that?!");
        return 0;
    }
    public double getArea() {
        System.out.println("What the hell!?!");
        return 1;
    }

    public class Circle extends Shape {
        public Circle(double sideLength) {
            super(sideLength);
        }
        @Override
        public double getPerimiter() {
            return sideLength;
        }
        @Override
        public double getArea() {
            return (sideLength*sideLength)/(4.0*Math.PI);
        }
    }
    public class Triangle extends Shape {
        public Triangle(double sideLength) {
            super(sideLength);
        }
        @Override
        public double getPerimiter() {
            return (sideLength*3.0);
        }
        @Override
        public double getArea() {
            return ((sideLength*sideLength)*(Math.sqrt(3.0)/4.0));
        }
    }
    public class Square extends Shape {
        public Square(double sideLength) {
            super(sideLength);
        }
        @Override
        public double getPerimiter() {
            return (sideLength*4.0);
        }
        @Override
        public double getArea() {
            return (sideLength*sideLength);
        }
    }
    public class Pentagon extends Shape {
        public Pentagon(double sideLength) {
            super(sideLength);
        }
        @Override
        public double getPerimiter() {
            return (sideLength*5.0);
        }
        @Override
        public double getArea() {
            return ((sideLength*sideLength)*(Math.sqrt(5.0*(5.0+2.0*Math.sqrt(5.0))))/4.0);
        }
    }

    public static void main(String[] args) {
        double sideLength = 1;
        if (sideLength > 0) {
            Shape shape = new Shape(sideLength);
            Shape.Circle circle = shape.new Circle(sideLength);
            Shape.Triangle triangle = shape.new Triangle(sideLength);
            Shape.Square square = shape.new Square(sideLength);
            Shape.Pentagon pentagon = shape.new Pentagon(sideLength);
            System.out.println("Side Length (" + sideLength + ") Shape perimeter: " + shape.getPerimiter());
            System.out.println("Side Length (" + sideLength + ") Shape area: " + shape.getArea());
            System.out.println("Side Length (" + sideLength + ") Circle perimeter: " + circle.getPerimiter());
            System.out.println("Side Length (" + sideLength + ") Circle area: " + circle.getArea());
            System.out.println("Side Length (" + sideLength + ") Triangle perimeter: " + triangle.getPerimiter());
            System.out.println("Side Length (" + sideLength + ") Triangle area: " + triangle.getArea());
            System.out.println("Side Length (" + sideLength + ") Square perimeter: " + square.getPerimiter());
            System.out.println("Side Length (" + sideLength + ") Square area: " + square.getArea());
            System.out.println("Side Length (" + sideLength + ") Pentagon perimeter: " + pentagon.getPerimiter());
            System.out.println("Side Length (" + sideLength + ") Pentagon area: " + pentagon.getArea());
        }
        else {
            System.out.println("INVALID SIDE LENGTH. TRY AGAIN.");
        }
    }
}