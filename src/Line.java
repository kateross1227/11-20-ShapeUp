// A Line object represents a line defined by a pair of Points.
import java.util.*;

public class Line {
  Point start = new Point();
  Point end = new Point();
  
  public Line () {
    start.x = 0;
    start.y = 0;
    end.x = 0;
    end.y = 0;
  }
  
  public Line (Point startPoint, Point endPoint) {
    start = startPoint;
    end = endPoint;
  }
  
  public double length () {
    return start.distance(end);
  }
  
  public double slope () {
    double slope = (double) ((end.y-start.y) / (end.x - start.x));
    return slope;
  }
  
  public String toString () {
    return "[" + start.toString() + "," + end.toString() + "]";
  }
  
  public void translate (int x, int y) {
    start.translate (x, y);
    end.translate (x, y);
  }
}
