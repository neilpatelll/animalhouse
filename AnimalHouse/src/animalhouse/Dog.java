
public class Dog extends animalhouse {

    private String owner;

    public Dog() {
        super(); 
        owner = null;
    }

    public Dog(String name, String owner) {
        super(name);  
        this.owner = owner;
    }
    
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void speak() {
        super.speak();
        System.out.println("Woof, Woof!");
    }

    public String toString() {
        return super.toString() + '\n' + "Owner: " + owner;
    }
}
