package lamda;


public class Greeting {

    public void greet( Greet greet){

        greet.perform();
    }
    public static void main(String[] args) {

        Greeting greeting = new Greeting();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        Greet  myGreetLamda = () -> System.out.println("Hello world");
        myGreetLamda.perform();

        greeting.greet(()-> System.out.println("Print lamda"));

    }


}
