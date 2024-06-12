
public class Bird extends animalhouse {

    public double height;
    public String color;

    public Bird(String noise, int age, String name, double height, String color) {
        super(noise, age, name);
        this.height = height;
        this.color = color;
    }

    public void printBird() {
        System.out.println("Hello! I am %s and I am a %s Bird! %s!");
        this.getName();
        this.color;
        this.noise;
    }

    public void speak() {
        super.speak();
        System.out.println("I am " + color);
        System.out.println("I am " + height + " inches tall");
    }
}
