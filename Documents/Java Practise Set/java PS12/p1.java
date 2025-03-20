package Calc;
import java.util.Scanner;

class simple_calculator{
    public int sum(int a,int b)
    {
       return a+b;
    }
    public int subtract(int a,int b)
    {
        return a-b;
    }
    public int product(int a,int b)
    {
        return a*b;
    }
    public float division(int a,int b)
    {
        return ((float) a ) / b;
    }
}
class ScientificCalculator{
   public float cos2theta(float theta)
   {
       return (float) (2*Math.sin(Math.toRadians(theta))*Math.cos(Math.toRadians(theta)));
   }
    public float modulus(int a,int b)
    {
        return (float) Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }
}

class Hybrid_Calculator{
    public void print(){
        System.out.println("It is a hybrid Calculator");
    }
}
class Q2{
    public void BIP()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name=sc.next();
        System.out.println(name);
    }

}
public class p1 {
    public static void main(String[] args) {
        Hybrid_Calculator h1=new Hybrid_Calculator();
        h1.print();

//        PS11q4 p1=new PS11q4();
//        System.out.println(p1.a);
//        System.out.println(p1.b);
    }
}