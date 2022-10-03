package ra;

public class test {
    public static void main(String[] args) {
        Point newPoint = new Point(3,4);
        System.out.println(newPoint.toString());
        System.out.println(" ");



        MovablePoint newPo = new MovablePoint(4,4,10,10);
        System.out.println(newPo.toString());
        newPo = new MovablePoint(newPo.getX(),newPo.getY(),10,20);
        System.out.println(newPo.toString());
        ((MovablePoint) newPo).move();
        System.out.println(newPo);
        MovablePoint diemKhac = new MovablePoint(20,20);
        System.out.println(diemKhac);
        diemKhac.move();
        System.out.println(diemKhac);
    }
}
