
public abstract class Pet {

    private String name;
    private int age;
    private int weight;

    public Pet(String n, int yr, int wgt) {
        this.name = n;
        this.age = yr;
        this.weight = wgt;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAge(int yr) {
        age = yr;
    }

    public void setWeight(int wgt) {
        weight = wgt;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return "Pet Name: " + name + "\nAge: " + age + "\nWeight" + weight;
    }
}

class Dog extends Pet {

    private String breed;
    private boolean booster;

    public Dog(String n, int yr, int wgt, String br, boolean bst) {
        super(n, yr, wgt);
        this.breed = br;
        this.booster = bst;
    }

    void setBreed(String br) {
        breed = br;
    }

    void setBooster(boolean bst) {
        booster = bst;
    }

    public String getBreed() {
        return breed;
    }

    public boolean getBooster() {
        return booster;
    }

    public String toString() {
        return super.toString() + "\nBreed: " + breed + "\nBooster: " + booster;
    }

}


