import com.example.lamdaexpdemo.Circle;
import com.example.lamdaexpdemo.Shape;

public class Call {
    public static void main(String[] args) {
      Circle c=new Circle(new Shape() {
          @Override
          public void calculate(int r) {
              System.out.println("area of circle : " + (Math.PI*r*r));
          }
      });
    }
}
