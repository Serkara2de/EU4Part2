package day43_polymorphism;

public class Ipad extends AppleDevice{

    @Override
    public void use() {
        System.out.println("Ipad | Readbook");
    }

    public void draw(){
        System.out.println("Drawing shapes using Ipad");
    }
}
