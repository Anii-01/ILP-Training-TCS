public class TestA {

    //Global variables
    int id ;
    String name;


    TestA(int id, String name)
    {
        this.id = id; // id = local variables
        this.name = name;
    }

    TestA(String name)
    {
        this.name = name;
    }

    public void setName(String str)
    {
        this.name = str;
    }

    public static void main(String[] args) {
        
        TestA obj1 = new TestA(10,"abc");
        System.out.println(obj1.id);
        System.out.println(obj1.name);

        //TestA obj2 = new TestA("Nilam");
        //System.out.println(obj2.name);

        obj1.setName("Swara");
        System.out.println(obj1.name);

    }
}
