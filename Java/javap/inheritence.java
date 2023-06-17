//even odd program through inheritence

import java.util.*;

public class inheritence {
    public static void main(String arg[])
    {
        evenodd ob=new evenodd();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num:");
        ob.number(sc.nextInt());
        int c;
        do{
            System.out.println("enter 1 to print 2 to check and 3 for exit:");
            c=sc.nextInt();
            switch(c){
                case 1:
                ob.print();
                break;
                case 2:
                ob.check();
                break;
                case 3:
                c=0;
                System.out.println("exit");
                break;
                default:
                System.out.println("wrong choice");
            }

            
        }while(c!=0);

        
    }
    
}
class numbers{
    int num;
    void number(int num){
        this.num=num;
    }
    void print(){
        
    
    System.out.println("num:" +num);
    }

}
class evenodd extends numbers{    
    void check(){
        if(num%2==0)
    {
        System.out.println("the number is a even num");

    }
    else{
        System.out.println("number is odd");
    }
    }


    
   
}
