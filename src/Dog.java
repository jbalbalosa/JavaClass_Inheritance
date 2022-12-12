
//extends - inheritance
public class Dog extends  Animal {

    private  int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String Coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail   = tail;
        this.teeth = teeth;
        this.coat   = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    public void walk(){
        System.out.println("Dog.eat() called");
        //super.move(4);
        super.move(5);
    }

    public void run (){
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
