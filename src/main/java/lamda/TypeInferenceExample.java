package lamda;


public class TypeInferenceExample {

    public static void main(String[] args) {

        StringLengthCount myLamdaFunction = s -> s.length();

        System.out.println(myLamdaFunction.getLength("hello world"));


    }
    interface  StringLengthCount {

        int getLength(String text);

    }

}


