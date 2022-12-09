public class Main {
    public static void main(String[] args) {
        System.out.println("Udemy: Java Programming Masterclass");
        System.out.println("Class: Inheritance");

        Animal animal = new Animal("Animal" , 1, 1, 5, 5);


        //    public Dog(String name, int brain, int body, int size, int weight, int eyes, int legs, int tail, int teeth, String Coat) {
        //        super(name, 1, 1, size, weight);

        Dog dog = new Dog("Yorkie",1,1,8, 20, 2, 4, 4, 20,"Long silky");
        dog.eat();
    }
}