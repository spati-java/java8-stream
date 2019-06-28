package lamda;


public class RunnableExample {

    public static void main(String[] args) {

        Thread thred = new Thread(() ->System.out.println("running") );
        thred.run();
    }
}
