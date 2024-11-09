
interface A{
    void msg();
}

interface B{
    void msg();
}

public class MultilevelInheritance_solution1 implements A,B{

    @Override
    public void msg()
    {
        System.out.println("Hello from Multiple inheritance...");
    }

    public static void main(String args[])
    {
        MultilevelInheritance_solution1 obj = new MultilevelInheritance_solution1();
        obj.msg();
    }
}
