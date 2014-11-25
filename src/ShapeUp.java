// A program that deals with shape classes.

public class ShapeUp {
    public static void main(String[] args) {
        // create two Point objects
        Point p1 = new Point();
        p1.setX(2);
        p1.setY(2);

        Point p2 = new Point();
        p2.setX(8);
        p2.setY(8);

 /*       // print each point and its distance from origin
        System.out.println("p1 is " + p1.toString());
        System.out.println("p1 distance from origin = " + p1.distanceFromOrigin());

        System.out.println("p2 is " + p2.toString());
        System.out.println("p2 distance from origin = " + p2.distanceFromOrigin());
         
        // print the distance between the two points
        System.out.println("distance between p1 & p2 = " + p1.distance(p2));
*/
        // create a line
        System.out.println("----------------------------------------------");
        Line line = new Line(p1, p2);
        System.out.println("line is " + line.toString());
        System.out.println("line's length = " + line.length());
        System.out.println("line's slope = " + line.slope());
        
        // create a circle
        System.out.println("----------------------------------------------");
        Circle circle = new Circle(p1, p2);
        System.out.println("circle is " + circle.toString());
        System.out.println("circle's radius = " + circle.getRadius());
        System.out.println("circle's area = " + circle.area());
        System.out.println("circle's circumference = " + circle.circumference());
        System.out.println("circle's diameter = " + circle.diameter());
        System.out.println("add 3.5 to circle's radius -------------------");
        circle.changeRadius(3.5);
        System.out.println("circle's radius = " + circle.getRadius());
        System.out.println("circle's area = " + circle.area());
        System.out.println("circle's circumference = " + circle.circumference());
        System.out.println("circle's diameter = " + circle.diameter());
        
        // create a rectangle
        System.out.println("----------------------------------------------");
        Rectangle rectangle = new Rectangle(p1, p2);
        System.out.println("rectangle is " + rectangle.toString());
        System.out.println("rectangle's bottom left Point = " + rectangle.getBottomLeft().toString());
        System.out.println("rectangle's top righ Point = " + rectangle.getTopRight().toString());
        System.out.println("rectangle's height = " + rectangle.getHeight());
        System.out.println("rectangle's width = " + rectangle.getWidth());
        System.out.println("rectangle's area = " + rectangle.area());
        System.out.println("rectangle's diagonal = " + rectangle.diagonal());
        System.out.println("rectangle's perimeter = " + rectangle.perimeter());
        System.out.println("rectangle's square = " + rectangle.isSquare());
        System.out.println("add 3 to x and 5 to y to scale rectangle -----");
        rectangle.scale(3, 5);
        System.out.println("rectangle is " + rectangle.toString());
        System.out.println("rectangle's bottom left Point = " + rectangle.getBottomLeft().toString());
        System.out.println("rectangle's top righ Point = " + rectangle.getTopRight().toString());
        System.out.println("rectangle's height = " + rectangle.getHeight());
        System.out.println("rectangle's width = " + rectangle.getWidth());
        System.out.println("rectangle's area = " + rectangle.area());
        System.out.println("rectangle's diagonal = " + rectangle.diagonal());
        System.out.println("rectangle's perimeter = " + rectangle.perimeter());
        System.out.println("rectangle's square = " + rectangle.isSquare());
    }
}
