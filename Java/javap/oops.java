public class oops {

    public static void main(String args[])
    {
        Amit ob = new Amit(12,"dost");
        ob.print();
        ob.student(23,"smit");
        ob.print();

 
    }

    
    
}
class Amit{
    int age;
    String name;
    void student(int age,String name){
        this.age=age;
        this.name=name;

    }
    void print()
    {
        
        System.out.println("Student name:"+name);
        System.out.println("Student age:"+age);
        
    }
    Amit(int age,String name){
        this.age=age;
        this.name=name;

        System.out.println("constructor called");
    }
}
