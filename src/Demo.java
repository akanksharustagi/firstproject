import java.util.ArrayList;
import java.util.List;

public class Demo
{
    public static void main(String[] args) {

        Circle circle= new Circle();
        circle.draw();

//Shape shape = newCircle();
//shape.draw();
// functional not required

        //Lambda function/ expression- given this do this
        Shape shape1= ()-> {
            System.out.println("hello");
            //give parameter and code(sout)
        };
shape1.draw();

        List<Shape> participants= takeListFromReception();
        for(Shape shape : participants){
            shape.draw();
        } }

        public static List<Shape> takeListFromReception() {
            List<Shape> list = new ArrayList<>();

            list.add(new Circle());
            list.add(new Rectangle());
            return list;
        }
}

