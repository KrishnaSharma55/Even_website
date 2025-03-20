package P3.f1.f2;
class prize1{
    public void first()
    {
        System.out.println("You are rewarded first prize");
    }
    public void attendance()
    {
        System.out.println("You are rewarded highest attendance prize");
    }
}
public class Q3 {
     protected int proint=4;
    int defint=5;
    public static void main(String[] args) {
        prize1 p1 = new prize1();
        p1.first();
        p1.attendance();
    }
}
