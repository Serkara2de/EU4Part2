package day39_inheritance_review;


public class Vehicle {

    private String name;
    private String size;
    private int currentDirection;
    private int currentVelocity;


    /*public Vehicle() {
        this("BMW", "3.16",60,50);
    }

     */

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentDirection=0;
        this.currentVelocity=0;
    }

    public Vehicle(String name, String size, int currentDirection, int currentVelocity) {
        this.name = name;
        this.size = size;
        this.currentDirection = currentDirection;
        this.currentVelocity = currentVelocity;
    }

    public void steer(int direction){
        this.currentDirection+=direction;
        System.out.println("Vehicle.steer(): is steering at "+currentDirection+" degrees.");
    }

    public void move(int velocity, int direction){
        this.currentDirection=direction;
        this.currentVelocity=velocity;
        System.out.println("Vehicle.move(): moving at "+currentVelocity+" in direction "+direction);
    }

    public void stop(){
        this.currentVelocity=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }
}
