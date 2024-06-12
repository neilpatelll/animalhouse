
public class Toy { 
    private String type; 
    private String name;
    
public Toy(String type) { 
    if(type.equals("ball")) { 
    this.name = "Teddy";
}
    else if (type.equals("bone")) 
{ this.name = "Jessie";; }
else if (type.equals("Rope")) 
{ this.name = "Ropppp"; } 

else { 
    throw new IllegalArgumentException ("No such toy");
 } this.type = type; } 

public static Toy myFavoriteToy (String type, String name) 
{
    Toy t = new Toy(type);
     t.name = name;
    return t;
}
}

