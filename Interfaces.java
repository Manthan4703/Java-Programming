public class Interfaces {
    public static void main(String[] args) {
        Omnivore bear = new Omnivore();
        bear.hunt();
        bear.cut();
    }
}

interface Herbivore{
    void hunt();
}

interface Carnivore{
    void cut();
}

class Omnivore implements Herbivore, Carnivore{
        public void cut(){
            System.out.println("Cuts the plants and eat");
        }
        public void hunt(){
            System.out.println("Hunts the animals and eat");
        }
}


interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (in any direction)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right (in any 4 directions)");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (in any direction by one box)");
    }
}