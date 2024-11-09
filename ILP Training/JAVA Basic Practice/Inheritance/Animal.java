// just check1
public class Animal {

    void sound()
    {
        System.out.println("Animal is sounding!!");
    }
    
    public static void main(String args[])
    {
        dog obj1 = new dog();
        obj1.sound();
        
    }
}

class dog extends Animal
{
    void sound()
    {
        System.out.println("dog is barking!!");
    }
}
