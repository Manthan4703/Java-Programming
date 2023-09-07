public class Inheritance {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.walk();                
    }    
}

//base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    
    void breathe(){
        System.out.println("breathes");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims in Water");
    }
}
class Tuna extends Fish{
    void streamlined(){
        System.out.println("Tuna Fishes are Streamlined in nature");
    }
}
class Shark extends Fish{
    void skin(){
        System.out.println("Shark skin feels similar to sandpaper");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Flies");
    }
}
class Peacock extends Bird{
    void dance(){
        System.out.println("Peacocks dance in the rain");
    }
}

class Mammals extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}
class Dog extends Mammals{
    void bark(){
        System.out.println("Dogs Bark");
    }
}
class Cat extends Mammals{
    void meow(){
        System.out.println("Cat Meows");
    }    
}
class Human extends Mammals{
    void talk(){
        System.out.println("Humans Talk");
    }  
}
