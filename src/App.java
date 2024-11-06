public class App {
    public static void main(String[] args) {
        StudentRecord student1   = new StudentRecord("12345", "Fred", "Flintstone", 20, "Stone cutting");
        System.out.println(student1.major());
        System.out.println(student1);
    }
}
