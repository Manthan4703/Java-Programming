public class Abstraction {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);
        // Chicken c = new Chicken();
        // c.eat();
        // c.walk();

        Mustang myHorse = new Mustang();
        
    }
}

abstract class Animal{      //The Class is made but cannot be used in the main function
                            //Only can be used in the subclass or derived class
    
    String color;
    Animal(){
        System.out.println("Animal Constructor Called");      
    }

    void eat(){             
        System.out.println("Animal Eats");
    }

    abstract void walk(); // only idea is given that function walk()is available but in the subclass
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor called");
    }
    void changeColor(){
        color = "Dark Brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor Called");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}
