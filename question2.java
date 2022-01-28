package com.company;
class Monkey{
    public void jump(){
        System.out.println("Very big jumps...");
    }
    public void bite(){
        System.out.println("bitting the bonus");
    }
}
interface BasicAnimal{
    public void eats();
    public void Sleeps();
}
class Human extends Monkey implements BasicAnimal{
    @Override
    public void jump() {
        super.jump();
    }
    @Override
    public void bite() {
        System.out.println("bitting...");
    }
    @Override
    public void eats() {
        System.out.println("eatting the meat...");
    }
    @Override
    public void Sleeps() {
        System.out.println("Sleeping at night...");
    }
}
public class question2 {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.bite();
        obj.Sleeps();
        obj.eats();
        obj.jump();
    }
}
