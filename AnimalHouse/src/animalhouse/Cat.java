
public class Cat extends animalhouse {

    private int numLives;

    public Cat(String name, int age, int numLives) {
        super(name, age);
        this.numLives = numLives;
    }

    public Cat(String name, int age) {
        this(name, age, 9);
    }

    public int getNumLives() {
        return numLives;
    }

    public String noise() {
        String result = "";
        for (int i = 0; i < numLives; i++) {
            result += "meow\n";
        }
        return result;
    }
}
