public class StaticAndSuperKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "ABC";
        
        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Horse h = new Horse();
        System.out.println(h.color);


    }
}

class Animal{
    String color;
    Animal(){
        System.out.println("Animal Constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super.color = "Brown";
        System.out.println("Horse Constructor is called");
    }
}

class Student{
    static int returnPercentage(int math, int phy , int chem){
        return (math+ phy+ chem)/3;
    }

    String name;
    int roll;

    static String schoolName;      // Every Object of Student Class will have same School Name

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
