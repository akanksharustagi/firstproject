public interface Shape {
    void draw();
    // added in java8, special feature added
    default void myDefaultMethod(){
        System.out.println("Implementation");
        // this doesnt break existing implementations. not a compulsion right away. take benefit of functional programing as opposed to oops
    }



}
