package com.company;
abstract class Telephone{
    abstract public void Ring();
    abstract public void Lift();
    abstract public void discount();
}
class SmartPhone extends Telephone{
    @Override
    public void Ring() {
        System.out.println("Phone Ringing...");
    }
    @Override
    public void Lift() {
        System.out.println("Call lifting..");
    }
    @Override
    public void discount() {
        System.out.println("call discounting...");
    }
}
public class question3 {
    public static void main(String[] args) {
        SmartPhone iphone = new SmartPhone();
        iphone.Ring();
        iphone.Lift();
        iphone.discount();
    }
}
