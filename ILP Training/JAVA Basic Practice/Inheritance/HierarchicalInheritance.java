//Hierarchical Inheritance
class Animal{
    void eat()
    {
        System.out.println("eating...");
    }
}
class dog extends Animal{
    void bark()
    {
        System.out.println("barking...");
    }
}
class cat extends Animal{
    void meow()
    {
        System.out.println("meowing...");
    }
}
public class HierarchicalInheritance {

    public static void main(String args[])
    {
        cat c =  new cat();
        c.meow();
        c.eat();

    }
    
}
