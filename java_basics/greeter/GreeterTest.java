public class GreeterTest{
    public static void main(String[] args){
        Greeter g = new Greeter();
        System.out.println(g.greet());
        System.out.println(g.greet("Calby"));
        System.out.println(g.greet("Calby", "Rex"));
    }
}