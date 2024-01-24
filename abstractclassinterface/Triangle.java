package abstractclassinterface;

public class Triangle extends Shape {


    public Triangle(int side1,int side2,long height){
        super(side1,side2,height);
    }
    @Override
    public int calcArea() {
        return 1/2*this.getSide1()*this.getSide2();
    }

    @Override
    public int calcPm() {
        return this.getSide2()+this.getSide1()+(int)this.getHt();
    }
}