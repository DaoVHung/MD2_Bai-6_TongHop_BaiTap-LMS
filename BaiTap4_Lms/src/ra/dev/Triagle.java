package ra.dev;

public class Triagle extends Shape{
    private double size1 = 1.0;
    private double size2 = 1.0;
    private double size3 = 1.0;

    public Triagle() {
    }

    public Triagle(double size1, double size2, double size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public Triagle(String color, Boolean filled, double size1, double size2, double size3) {
        super(color, filled);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }
    public void setArea(double size1, double size2, double size3){
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }
    public double getArea(){
        double p=(size1+size2+size3)/2;
        double area = Math.sqrt(p*(p-size1)*(p-size2)*(p-size3));
        return area;
    }
    public void setPermiter(double size1,double size2,double size3){
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }
    public double getPermeter(){
        double permiter =(size1+size2+size3)/2;
        return permiter;
    }

    @Override
    public String toString() {
        return "Triagle with \n Area     = " + getArea() +"\n"+
                " Permiter = " + getPermeter() + "\n"+
                super.toString();

    }
}
