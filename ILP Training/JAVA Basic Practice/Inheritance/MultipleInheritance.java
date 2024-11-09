//Multiple Inheritance

class A{
    void msg()
    {
        System.out.println("Hello");
    }
}

class B{
    void msg()
    {
        System.out.println("Welcome");
    }
}

public class MultipleInheritance extends A,B{   //gives compliation error

    public static void main(String args[])
    {
        MultilevelInheritance obj = new MultilevelInheritance();
        obj.msg();
    }
}
