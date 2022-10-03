package ra.dev;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(double height, double radius, String color ){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double V(){
        return Math.PI*Math.pow(getRadius(),2)*height;
    }
    public String toString(){
        return "Hinh tru co chieu cao: " + getHeight() +"\n"
                + " Ban kinh la        : " + getRadius()  +"\n"
                + " The tich           : V = " + V() +"\n"
                + " Co mau             : " + getColor();
    }
}
