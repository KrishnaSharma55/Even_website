// import com.codewithharry.shape.circle;
// import com.codewithharry.shape.cylinder;
import com.codewithharry.shape.*;
public class main {
    public static void main(String[] args) {
        cylinder c1=new cylinder(4,5);
        System.out.println(c1.area());
        System.out.println(c1.Volume());
        circle c2=new circle(5);
        System.out.println(c2.perimeter());
        System.out.println(c2.area());
    }
}
