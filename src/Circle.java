public class Circle implements Shape, Color{

    @Override
    public void draw() {
        System.out.println( "i can draw");
    }

    @Override
    public void myDefaultMethod() {
        Shape.super.myDefaultMethod();
    }

}
