
public class AnimalHouse {

    private String name;

    public AnimalHouse(String name) {

        this.name = name;
    }

    public AnimalHouse() {

        name = null;
    }

    public void speak() {
        System.out.println("My name is " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Animal: " + name;
    }
}
