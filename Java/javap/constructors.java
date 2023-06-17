

public class constructors{
    public static void main(String args[])
    {
        Amit ob1=new Amit(1,"amit");
        System.out.println("ob1 num=:"+ob1.num+"ob1 name"+ob1.name);
        Amit ob2=new Amit(ob1);
        System.out.println("ob2 num=:"+ob2.num+"ob2 name"+ob2.name);


    }
}
class Amit{
    int num;
    String name;
    Amit(Amit a)//copy constructor
    {
        this.num=a.num;
        this.name=a.name;
    }
    Amit(int num,String name){
        this.num=num;
        this.name=name;
    }

}