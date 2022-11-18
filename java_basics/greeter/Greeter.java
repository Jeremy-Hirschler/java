public class Greeter{
    public String greet(){
        return createGreeting("World");
    }

    public String greet(String name){
        return createGreeting(name);
    }

    public String greet(String firstName, String lastName){
        System.out.println("Preparing to greet " + firstName);
        return createGreeting(firstName + " " + lastName);
    }

    private String createGreeting(String greeting){
        return "Hello " + greeting;
    }
}