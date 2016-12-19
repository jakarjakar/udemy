package ws.minsk;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tails;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tails, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tails = tails;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        super.eat();
        this.chew();
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    public void walk() {
        System.out.println("Dow.walk() called");
        move(5);

    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }


    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

}
