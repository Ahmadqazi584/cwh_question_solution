package com.company;
abstract class Pen{
    abstract public void write();
    abstract public void refill();
}
class Foundation extends Pen{
    @Override
    public void write() {
        System.out.println("pen is writing with blue color...");
    }
    @Override
    public void refill() {
        System.out.println("Blue refill is needed...");
    }
    public void changeNib(){
        System.out.println("new nib is added...");
    }
}
public class Question1 {
    public static void main(String[] args) {
        Pen obj = new Foundation();
        obj.write();
        obj.refill();
        Foundation f = new Foundation();
        f.changeNib();
    }
}
