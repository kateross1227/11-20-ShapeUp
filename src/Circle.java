// A Circle object represents a circle defined by a center point and a radius.
public class Circle {
  Point center;
  double radius;
  
  public Circle() {
    center = new Point();
    radius = 0;
  }
  
  public Circle(Point startPoint, Point endPoint) {
    center = startPoint;
    radius = center.distance(endPoint);
  }
  
  public Circle(Point p, double d) {
    center = p;
    radius = d;
  }
  
  public double getRadius() {
    return radius;
  }
  
  public double area() {
    return (double)(Math.PI * (radius * radius));
  }
  
  public double circumference() {
    return (double)(2 * Math.PI * radius);
  }
  
  public double diameter() {
    return (double)(2 * radius);
  }
  
  public String toString() {
    return "[" + center.toString() + ", " + radius + "]";
  }
  
  public void translate(int x, int y) {
    center.translate(x, y);
  }
  
  public void changeRadius(double x) {
    radius += x;
  }
}
