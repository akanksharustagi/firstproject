public interface Color {
    void draw();

    default void myDefaultMethod() {
        System.out.println("Implementation 2");
    }
}