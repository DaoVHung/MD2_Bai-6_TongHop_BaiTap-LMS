package ra;

public class test {
    public static void main(String[] args) {
        Point newPoint = new Point(3,4);
        System.out.println(newPoint.toString());
        System.out.println(" ");



        MovablePoint newPoint1 = new MovablePoint(4,4,10,10);
        System.out.println(newPoint1.toString());
       MovablePoint newPoint2 = new MovablePoint(Point1.getX(),Point1.getY(),10,20);
        System.out.println(newPoint2);
        newPoint2.move();
        System.out.println(newPoint2);
    }
}
